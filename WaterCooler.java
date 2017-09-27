import java.util.*;
public class WaterCooler{
  public static void main(String[] args) {
    System.out.println("You find yourself stranded at the watercooler with __");
    System.out.println("and ___. What do you say?");
    System.out.println("");
    System.out.println("What is your confidence level? 1 being lowest, 3 being highest.");
    Scanner scan = new Scanner(System.in);
    String con = scan.nextLine();
    String[] lowRisk = new String[10];
    String[] lowRisk = {"music", "sports", "computers", "watercooler", "pets", "books","movies", "work", "weather", "weekend plans"};
    String[] highRisk = new String[10];
    String[] highRisk = {"politics", "war","sports","flirt","romantic life","parents","poverty","income","come at me bro","loan"};
    if (con.equals("1")==true){
      System.out.println("Pick one.");
      System.out.println(lowRisk.toString());
    }
  }

}
