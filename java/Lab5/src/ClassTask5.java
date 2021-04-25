
public class ClassTask5 {

  public static String reverse(String string) {
    // TODO Auto-generated method stub
    String result = "";

    for (int i = string.length() - 1; i >= 0; i--) {
      result += string.charAt(i);
    }

    return result;
  }

  public static boolean isPalindrome(String string) {
    //return string.equals(reverse(string));
    string=string.toLowerCase();
    int stringLength=string.length();
    for(int lefti=0,righti=stringLength-1; lefti<stringLength/2; lefti++,righti--){
      if(string.charAt(lefti)!=string.charAt(righti)) {
        return false;
        }
      }
    return true;
    }

  public static void main(String[] args) {
    System.out.println("madam".equalsIgnoreCase(reverse("Madam")));
    System.out.println(reverse("madams"));
    System.out.println("madam".equals(reverse("madams")));
  }
}
