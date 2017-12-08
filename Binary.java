import java.util.*;

public class Binary{

    public static String sort(String d) {

      String[] str = new String[9];
      if(d.length()<8){
        for(int i = 0; d.length()<9; i++){
          if(d.substring(i,i+1).equals("1")||d.substring(i,i+1).equals("0")){
            d = "0"+d;}}
        for(int i = 0; i<9; i++){
          str[i]= d.substring(i,i+1);
            Array.toString(str);}}
      else{
          String[] str = new String[]{"-1","0","0", "0", "0", "0", "0", "0", "0"};}
      str(0)="2";
    }

    /*public static subtract(String[] e){
      for(int i = 0; i<9; i++){
        if(e(i).equals("0")){
          e(i).equals("1");}
        if(e(i).equals("1")){
          e(i).equals("0");}}
      }*/
    public static add(String[] e, String[] f){
      String[] sum = new String[9];
      for(int i =0; i<9;i++){
        int a = Integer.parseInt(e[i]);
        int b = Integer.parseInt(f[i]);
        sum[i] = a+b;
        if(sum = 2)
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Binary Calculator \n What would you like to do? Enter \"add\", \"subtract\", \"multiply\", or \'divide\".");
        Scanner scannn = new Scanner(System.in);
        String c = scannn.nextLine();


        System.out.println("Please enter the first number.");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();

        System.out.println("Now enter the second number.");
        Scanner scann = new Scanner(System.in);
        String b = scann.nextLine();

        String[] num1 = sort(scan.nextLine());
        String[] num2 = sort(scann.nextLine());

        if(num1[0].equals("-1")||num2[0].equals("-1")) {
          System.out.println("Invalid number.");
        }

        if (c.equals("add") {
        }

        if (c.equals("subtract") {
          subtract(num2);
        }
        if (c.equals("multiply") {

        }
        if (c.equals("divide") {

        }
        else{
          System.out.println("Invalid answer. Restart Calculator.");
          System.exit(0);}


    }

}
