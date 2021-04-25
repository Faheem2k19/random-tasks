package utilities;

public class Model {

  public static boolean toLower(String str) {

    boolean flag = false;
    char ch;
    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);

      if (Character.isUpperCase(ch)) {
        flag = true;
        return flag;
      } else {
        flag = false;
      }
    }

    return flag;
  }

  public static boolean checkPassword(String str1, String str2) {
    boolean flag = false;
    if (str1.equals(str2)) {
      flag = true;
    } else {
      flag = false;
    }

    return flag;
  }

}