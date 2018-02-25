import java.util.*;
import java.lang.*;

public class Expenses{
  public ArrayList<String> date = new ArrayList<String>();
  public ArrayList<double> amount = new ArrayList<String>();
  public ArrayList<String> address = new ArrayList<String>();
  public ArrayList<int> id = new ArrayList<String>();
  public void setDate(ArrayList<String> date){
    this.date = date;
  }
  public void setAmount(ArrayList<double> amount){
    this.amount = amount;
  }
  public void setAddress(ArrayList<String> address){
    this.address = address;
  }
  public void setId(ArrayList<int> id){
    this.id = id;
  }
  public ArrayList<String> getAddress(){
    return address;
  }
  public ArrayList<String> getDate(){
    return date;
  }
  public ArrayList<double> getAmount(){
    return amount;
  }
  public ArrayList<int> getId(){
    return id;
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

      id.add(id.length);
    }

    if(a.equals("View Expenses")){
      for(int i = 0; i<id.length; i++){
        System.println(date.get(i) + " " + address.get(i) + " " + amount.get(i));
      }
    }
  }
}
