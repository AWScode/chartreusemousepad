import java.util.*;
import java.lang.*;

public class Binary{

    public static String[] sort(String d) { //outputs an array of 8 bits
      String[] str = new String[8];
      if(d.length()<9 && (d.contains("0") || d.contains("1"))) {//checks if it's a valid number
        for(int i = 0; d.length()<8; i++){
          d = "0"+d; //makes the number into a string with a length of 8
        }
        for(int i =0; i<8; i++){
          str[i]= d.substring(i,i+1);//turns d into an array
        }
      }
      else { str = new String[]{"-1","0","0","0","0","0","0","0"}; //if the number entered is not binary
      }
      return str;
    }

    public static String[] add(String[] e, String[] f){ //adds two arrays
      String[] sum = new String[8];//will hold the sum
      boolean car = false;//the carry ad a boolean
      for(int i = 7; i>-1; i--){//starting from the front of the number
        if(car == false){//a case for no carry
          if(e[i].equals("1") && f[i].equals("1")){//0+1+1=10
            sum[i]="0";
            car=true;
          }
          if((e[i].equals("1") && f[i].equals("0")) || (e[i].equals("0") && f[i].equals("1"))){//0+1+0=01
            sum[i]="1";
            car=false;
          }
          if(e[i].equals("0") && f[i].equals("0")){//0+0+0=00
            sum[i]="0";
            car=false;
          }
        }
        else{//a case with a carry
          if(e[i].equals("1") && f[i].equals("1")){//1+1+1+=11
            sum[i]="1";
            car=true;
          }
          if((e[i].equals("1") && f[i].equals("0")) || (e[i].equals("0") && f[i].equals("1"))){//1+1+0=10
            sum[i]="0";
            car=true;
          }
          else{//1+0+0=01
            sum[i]="1";
            car=false;
          }
        }
      }
      return sum;
    }

    public static String[] subtract(String[] s,String[] t){//a method for subtraction
      String[] neg = new String[8];// an array to hold inverted number
      for(int i= 0; i<9; i++){//inverts t
        if(t[i].equals("0")){
          neg[i]="1";
        }
        else{
          neg[i]="0";
        }
      }
      String[] plus1 = sort("1"); //makes an array of {0,0,0,0,0,0,0,1}b = 1d
      String[] sub = add(neg,plus1);// adds one to the inverted array to make a new array(the negative subtractor) using add method
      return add(sub,s);// adds the negative subtractor and other number using add method
    }

    public static String[] multiply(String[] m, String[] n){//mutlipies 2 arrays
      String[] a = new String[8];//each array accounts for n being multiplied by an element of m
      String[] b = new String[8];
      String[] c = new String[8];
      String[] d = new String[8];
      String[] e = new String[8];
      String[] f = new String[8];
      String[] g = new String[8];
      String[] h = new String[8];
      for(int i = 0; i<9; i++){
        if(m[i].equals("1")&&i==0){ // assigns values to each array if m[i] has value
          a[i]=m[i];
        }
        if(m[i].equals("1")&&i==1){
          b=m;
        }
        if(m[i].equals("1")&&i==2){
          c=m;
        }
        if(m[i].equals("1")&&i==3){
          d=m;
        }
        if(m[i].equals("1")&&i==4){
          e=m;
        }
        if(m[i].equals("1")&&i==5){
          f=m;
        }
        if(g[i].equals("1")&&i==6){
          g=m;
        }
        if(h[i].equals("1")&&i==7){
          h=m;
        }
        else{ //assigns an array of 0 if m[i] is 0 using sort method
          if(i==0){
            a = sort("0");
          }
          if(i==1){
            b = sort("0");
          }
          if(i==2){
            c = sort("0");
          }
          if(i==3){
            d = sort("0");
          }
          if(i==4){
            e = sort("0");
          }
          if(i==5){
            f = sort("0");
          }
          if(i==6){
            g = sort("0");
          }
          if(i==7){
            h = sort("0");
          }
        }
      }
      String[] j = add(a,b);//adds 2 arrays using add method
      String[] k = add(c,d);
      String[] l = add(e,f);
      String[] x = add(g,h);
      String[] y = add(j,k);//adds 2 resulting arrays using add method
      String[] o = add(l,x);
      String[] product = add(y,o);//adds 2 final arrays using add  method
      return product;
    }

    public static String[] divide(String[] q, String[] r){//divides an array
      String[] quotient = sort("0");//currently empty, eventually holds the answer using sort method
      String[] plus1 = sort("1");////makes an array of {0,0,0,0,0,0,0,1}b = 1d using sort method
      String[] change = q;//currently = q, will hold the changing number that will be subtracted from
      String yeet = ""; //will hold answer in string form
      for(int i = 7; i>-1; i--){
        if(change[0].equals("0")){
          change = subtract(change, r);//using subtract method
          quotient= add(quotient, plus1);//using add method
        }
      }
      for(int i = 0; i<9; i++){//converts answer into string form
        yeet= yeet+quotient[i];
      }
      return sort(yeet);//returns the answer as a complete array using sort method
    }

    public static void main(String[] args) {
      System.out.println("Welcome to Binary Calculator \n What would you like to do? Enter \"add\", \"subtract\", \"multiply\", or \'divide\".");
      Scanner scannn = new Scanner(System.in);
      String c = scannn.nextLine();

      if(!(c.equals("add")||c.equals("subtract")||c.equals("multiply")||c.equals("divide"))){//validifies input
        System.out.println("Invalid answer. Restart Calculator.");
        System.exit(0);
      }

      System.out.println("Please enter the first number.");
      Scanner scan = new Scanner(System.in);
      String a = scan.nextLine();

      System.out.println("Now enter the second number.");
      Scanner scann = new Scanner(System.in);
      String b = scann.nextLine();

      String[] num1 = sort(a);//inputs entered numbers into sort method to put in right format
      String[] num2 = sort(b);

      if(num1[0].equals("-1")||num2[0].equals("-1")){//validifies input
        System.out.println("Invalid number(s).");
        System.exit(0);
       }

      if(c.equals("add")){//displays inputs as arrays and result of addition
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        String[] ans = add(num1,num2);//calls add method
        System.out.println(Arrays.toString(ans));
      }

      if (c.equals("subtract")){//displays inputs as arrays and result of subtraction
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        String[] ans = subtract(num1,num2);// calls subtract method
        System.out.println(Arrays.toString(ans));
      }

      if (c.equals("multiply")){//displays inputs as arrays and result of multiplication
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        String[] ans = multiply(num1,num2);//calls multiply method
        System.out.println(Arrays.toString(ans));
      }

      if (c.equals("divide")){//displays inputs as arrays and result of division
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        String[] ans = divide(num1,num2);//calls divide method
        System.out.println(Arrays.toString(ans));
      }
    }
}
