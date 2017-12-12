import java.util.*;
import java.lang.*;

public class Binary{

    public static String[] sort(String d) { //output an array of 8 bits
      String[] str = new String[8];
      if(d.length()<9 && (d.contains("0") || d.contains("1"))) {//checks if it's a valid number
        for(int i = 0; d.length()<8; i++){
          d = "0"+d;} //makes the number into a string with a length of 8
        for(int i =0; i<8; i++){
          str[i]= d.substring(i,i+1);}//turns the d string into an array
        }

      else { str = new String[]{"-1","0","0","0","0","0","0","0"}; }
      return str;}



    /*public static subtract(String[] e){
      for(int i = 0; i<9; i++){
        if(e(i).equals("0")){
          e(i).equals("1");}
        if(e(i).equals("1")){
          e(i).equals("0");}}
      }*/
    public static String[] add(String[] e, String[] f){ //adds two arrays
      String[] sum = new String[8];
      int carry = 0;
      for(int i =0; i<8;i++){
        if(carry==0){
          if(e[i].equals("1")&&f[i].equals("1")){
            carry = 1;
            sum[i]= 0;
          }
          if(e[i].equals("1")&&f[i].equals("0")||(e[i].equals("0")&&f[i].equals("1"))){
            sum[i]=1;
          }
          else{sum[i]="0";}
        }
        else{
          if(e[i].equals("1")&&f[i].equals("1")){
            carry = 1;
            sum[i]= 1;
          }
          if(e[i].equals("1")&&f[i].equals("0")||(e[i].equals("0")&&f[i].equals("1"))){
            carry = 1;
            sum[i]= 0;
          }
          else{sum[i]="1";}
        }

      }
      return sum;
  }*/
  /*
    public static String subtract(){}
    public static String multiply(){}
    public static String divide(){} */

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Calculator \n What would you like to do? Enter \"add\", \"subtract\", \"multiply\", or \'divide\".");
        Scanner scannn = new Scanner(System.in);
        String c = scannn.nextLine();


        System.out.println("Please enter the first number.");
        Scanner scan = new Scanner(System.in);

        System.out.println("Now enter the second number.");
        Scanner scann = new Scanner(System.in);

        String[] num1 = sort(scan.nextLine());//inputs entered numbers into sort method to put in right format
        String[] num2 = sort(scann.nextLine());

        if(num1[0].equals("-1")||num2[0].equals("-1")){//prints invalid number if the number is invalid
          System.out.println("Invalid number.");
        }




        if(c.equals("add")){
          String[] sum = add(num1,num2);
        }
}
        /*if (c.equals("subtract")){
          subtract(num2);
        }
        if (c.equals("multiply")){

        }
        if (c.equals("divide")){

        }
        else{
          System.out.println("Invalid answer. Restart Calculator.");
          System.exit(0);}


    }*/

}
