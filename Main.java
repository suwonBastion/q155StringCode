import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    System.out.print("문자열s:");
    String s = stdin.next();

    for (int i = 0;i<s.length();i++){
      System.out.printf("s[%d] = %c %x \n",i,s.charAt(i),(int)s.charAt(i));
    }

  }
}