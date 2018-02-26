import java.util.*;
import java.lang.*;

public class Expenses{
  public ArrayList<String> date = new ArrayList<String>();
  public ArrayList<Double> amount = new ArrayList<Double>();
  public ArrayList<String> address = new ArrayList<String>();
  public ArrayList<Integer> id = new ArrayList<Integer>();
  public void setDate(ArrayList<String> date){
    this.date = date;
  }
  public void setAmount(ArrayList<Double> amount){
    this.amount = amount;
  }
  public void setAddress(ArrayList<String> address){
    this.address = address;
  }
  public void setId(ArrayList<Integer> id){
    this.id = id;
  }
  public String getAddress(int a){
    return address.get(a);
  }
  public String getDate(int a){
    return date.get(a);
  }
  public double getAmount(int a){
    return amount.get(a);
  }
  public ArrayList<Integer> getId(){
    return id;
  }
  int num = id.size();
  public void newId(){
    id.add(id.size());
  }
  public static void main(String[] args){
    System.out.println("Welcome to Expense Tracker \n What would you like to do? Enter \"Add New Expense\" or \"View Expenses\".");
    Scanner scan = new Scanner(System.in);
    String a = scan.nextLine();

    if(a.equals("Add New Expense")){
      System.out.println("Enter the date.");
      Scanner scann = new Scanner(System.in);
      String date = scann.nextLine();

      System.out.println("Enter the address.");
      Scanner scannn = new Scanner(System.in);
      String address = scannn.nextLine();

      System.out.println("Enter the amount.");
      Scanner scannnn = new Scanner(System.in);
      String amount = scannnn.nextLine();

      newID();
    }

    if(a.equals("View Expenses")){
      for(int i = 0; i<id.size(); i++){
        System.println(getDate(i) + " " + getAddress(i) + " " + getAmount(i));
      }
    }
  }
}
