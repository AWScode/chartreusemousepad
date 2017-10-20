import java.util.*;
import java.lang.String;

public class Palindrome {

    public static boolean palindromeCheck(String test) {
        String b = test.replaceAll("\\s+","");
        String back = new StringBuilder(b).reverse().toString();
        if(b.equals(back)){
          return true;}
        else{
          return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {
            System.out.println("That's not a Palindrome!");
        }

    }

}
