import java.util.*;

public class Binary{

    public static String sort(String a, String b) {
      if(a.length()<8){
        for(int i = 0; a.length<8; i++)
          a = "0"+a;
      }
      if(a.length()>8)
        System.out.println("Invalid number");

        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Binary Calculator \n Please enter the first number.");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        System.out.println("Now enter the second number.");
        Scanner scann = new Scanner(System.in);
        String b = scann.nextLine();

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {
            System.out.println("That's not a Palindrome!");
        }

    }

}
