import org.junit.*;
import static org.junit.Assert.*;

public class VowelDashTest {

  @Test
  public void isVowelDash_forGiveInputReceiveOutput_SameString() {
    VowelDash testVowelDash = new VowelDash( );
    String testString = "Vowel Dash gives an output!";
    assertEquals(testString, testVowelDash.replace(testString, testString, "Vowel Dash gives an output!"));
  }

  @Test
  public void isVowelDash_forReplaceOneLetter_NewString() {
    VowelDash testVowelDash = new VowelDash( );
    String testString = "Vowel Dash gives an output!";
    assertEquals("V-w-l D-sh g-v-s -n --tp-t!", testVowelDash.replace(testString, "[AEIOUaeiou]", "-"));
  }

  @Test
  public void isVowelDash_forMatchingInputs_true() {
    VowelDash testVowelDash = new VowelDash( );
    assertEquals(true, testVowelDash.findMatch("aString", "aString"));
  }
}
