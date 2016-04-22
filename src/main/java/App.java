// import java.util.Map;
// import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;
//
// public class App {
//
//   public static void main(String[] args) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/home.vtl" );
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     post("/player2", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       String player1 = request.queryParams("pl1choice");
//       model.put("player1output", player1);
//       model.put("template", "templates/player2.vtl" );
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     post("/result", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/result.vtl" );
//       String input1p = request.queryParams("pl1choice");
//       String input2p = request.queryParams("pl2choice");
//       //String compChoice = RockPaperScissors.getRandomChoice();
//       String result = RockPaperScissors.findWinner(input1p, input2p);
//       model.put("output", result );
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//   }
// }
