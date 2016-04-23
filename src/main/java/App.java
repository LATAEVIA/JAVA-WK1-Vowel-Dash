import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    ArrayList<String> checkArray = new ArrayList<String>();

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());

    post("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String inputNoDashes = request.queryParams("inputNoDashes");
      checkArray.add(inputNoDashes);
      VowelDash myVowelDash = new VowelDash();
      String dashedInput = myVowelDash.replace(inputNoDashes, "[AEIOUaeiou]", "-");
      model.put("dashedOutput", dashedInput);
      model.put("template", "templates/result.vtl");
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());

    post("/check", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String inputSolution = request.queryParams("inputGuess");
      String inputOriginal = checkArray.get(0);
      String output = "";
      VowelDash myVowelDash = new VowelDash();

      model.put("inputGuess", inputSolution);
      model.put("inputNoDashes", inputOriginal);

      // model.put("output", output);
      //
      // Boolean solutionGuess = myVowelDash.findMatch(inputOriginal, inputSolution);
      // if (solutionGuess.equals(true)){
      //   output = (inputSolution + " is correct");
      // } else {
      //   output = (inputSolution + " is incorrect. " +  inputOriginal + " was the correct answer.");
      // }

      model.put("template", "templates/check.vtl");
      checkArray.remove(0);
      return new ModelAndView(model, layout);
    },new VelocityTemplateEngine());
  }
}
