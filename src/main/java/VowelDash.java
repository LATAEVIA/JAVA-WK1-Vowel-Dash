public class VowelDash {
  public static String replace(String original, String find, String replace) {
    String dashResult = original.replaceAll(find, replace);
    return dashResult;
  }
  public static Boolean findMatch(String preDashInput, String postDashGuess) {
    if (preDashInput.equals(postDashGuess)) {
    return true;
    } else {
    return false;
    }
  }
}
