import org.junit.*;
import static org.junit.Assert.*;

public class VowelDashTest {

  @Test
  public void isVowelDash_forGiveInputReceiveOutput_SameString() {
    VowelDash testVowelDash = new VowelDash( );
    String testString = "Vowel Dash gives an output!";
    assertEquals(testString, testVowelDash.replace(testString, testString, "Vowel Dash gives an output!"));
  }
}


//   @Test
//   public void CheckString_ReplaceWordsAnywhere_NewString() {
//     FindAndReplace testFindAndReplace = new FindAndReplace( );
//     String testString = "cat in a cathedral";
//     assertEquals("dog in a doghedral", testFindAndReplace.replace(testString, "cat", "dog"));
//   }
//
//   @Test
//   public void CheckString_ReplaceOnlyCompleteWords_NewString() {
//     FindAndReplace testFindAndReplace = new FindAndReplace( );
//     assertEquals("dog in a cathedral", testFindAndReplace.replace(cat in a cathedral, "cat", "dog"));
//
//   @Test
//   public void CheckString_ReplaceCapsCorrectly_NewString() {
//     FindAndReplace testFindAndReplace = new FindAndReplace( );
//     assertEquals("dog in al cathedral", testFindAndReplace.replace(cat in a cathedral, "cat", "dog"));
//   }
//
//
// @Test
//  public void findReplace_changeAllInstanceOfOneWordToAnother_changedString() {
//    FindAndReplace testFindAndReplace = new FindAndReplace();
//    String userInput = "I went to sleep yesterday";
//    assertEquals("I went to class yesterday", testFindAndReplace.findReplace(userInput, "sleep", "class"));
//  }
//  @Test
//  public void findReplace_wontChangePartialWordMatches_changedString() {
//    FindAndReplace testFindAndReplace = new FindAndReplace();
//    String userInput = "I am walking my cat to the cathedral";
//    assertEquals("I am walking my dog to the cathedral", testFindAndReplace.findReplace(userInput, "cat", "dog"));
//  }
//  @Test
//  public void findReplace_willReplaceDifferentlyCapitalizedWords_changedString() {
//    FindAndReplace testFindAndReplace = new FindAndReplace();
//    String userInput = "I am walking my cat to the Park";
//    assertEquals("I am walking my cat to the beach", testFindAndReplace.findReplace(userInput, "park", "beach"));
//  }
