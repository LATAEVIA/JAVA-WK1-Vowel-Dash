import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Create a word puzzle");
  }

  @Test
  public void isDashedForVowels() {
    goTo("http://localhost:4567");
    fill("#inputNoDashes").with("test");
    submit(".btn");
    assertThat(pageSource()).contains("t-st");
  }

  @Test
  public void isCorrectGuess() {
    goTo("http://localhost:4567");
    fill("#inputNoDashes").with("test");
    submit(".btn");
    fill("#inputGuess").with("test");
    submit(".btn");
    assertThat(pageSource()).contains("'test' is correct.");
  }

  @Test
  public void notCorrectGuess() {
    goTo("http://localhost:4567");
    fill("#inputNoDashes").with("test");
    submit(".btn");
    fill("#inputGuess").with("tests");
    submit(".btn");
    assertThat(pageSource()).contains("'tests' is incorrect.");
  }
}
