import java.util.*;
import java.lang.*;

public class Expense{
  public ArrayList<ArrayList<String>> expense = new ArrayList<>();
  public ArrayList<String> date = new ArrayList<>();
  public ArrayList<String> amount = new ArrayList<>();
  public ArrayList<String> address = new ArrayList<>();
  public void setExpense(ArrayList<ArrayList<String>> expense){
    this.expense = expense;
  }
  public ArrayList<ArrayList<String>> getExpense(){
    expense.add(date);
    expense.add(address);
    expense.add(amount);
    return expense;
  }
  public void setDate(ArrayList<String> date){
    this.date = date;
  }
  public ArrayList<String> getDate(){
    return date;
  }
  public void setAddress(ArrayList<String> address){
    this.address = address;
  }
  public ArrayList<String> getAddress(){
    return address;
  }
  public void setAmount(ArrayList<String> amount){
    this.amount = amount;
  }
  public ArrayList<String> getAmount(){
    return amount;
  }
  public static void main(String[] args){
    System.out.println("Welcome to Expense Tracker \n What would you like to do? Enter \"Add New Expense\" or \"View Expenses\".");
    Scanner scan = new Scanner(System.in);
    String a = scan.nextLine();

    if(a.equals("Add New Expense")){
      System.out.println("Enter the date.");
      Scanner scann = new Scanner(System.in);
      date.add(scann.nextLine());
      

      System.out.println("Enter the address.");
      Scanner scannn = new Scanner(System.in);
      //String address = scannn.nextLine();
      address.add(scannn.nextLine());

      System.out.println("Enter the amount.");
      Scanner scannnn = new Scanner(System.in);
      //String amount = scannnn.nextLine();
      amount.add(scannnn.nextLine());

    }

    if(a.equals("View Expenses")){
      
      }
    }
}
  