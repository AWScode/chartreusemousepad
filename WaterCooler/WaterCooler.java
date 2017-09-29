import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class WaterCooler{
  public static void main(String[] args) {
    BufferedReader in = new BufferedReader(new FileReader(new File("topics.txt")));
    System.out.println("You find yourself stranded at the watercooler with __");
    System.out.println("and ___. What do you say?");
    System.out.println("");
    System.out.println("What is your confidence level? 1 being lowest, 3 being highest.");
    Scanner scan = new Scanner(System.in);
    int con = scan.nextLine();
    String[] lowRisk = new String[5];
    String[] lowRisk = {"watercooler", "pets", "work", "weather", "weekend plans"};
    String[] highRisk = new String[5];
    String[] highRisk = {"flirt","poverty","come at me bro","loan","end conversation"};
    if (con==1){
      System.out.println("Pick a topic.");
      System.out.println(lowRisk.toString());}
    else if (con==2){
      System.out.println("Low or high risk topic?(Please reply with \"low\" or \"high\")");
      Scanner risk = new Scanner(System.in);
      String riskk = risk.nextLine();
        if(riskk.equals("low")){
          System.out.println("Pick a topic.");
          System.out.println(lowRisk.toString());}
        else{
          System.out.println("Pick a topic.");
          System.out.println(highRisk.toString());}}
    else if(con==3){
      System.out.println("Pick a topic.");
      System.out.println(highRisk.toString());}
    Scanner topic = new Scanner(System.in);
    String topicc = topic.nextLine();

    }
  }

}
