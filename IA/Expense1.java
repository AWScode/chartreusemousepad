import java.util.*;
import java.lang.*;
import java.awt.*;
import java.io.*;

public class Expense1{
    ArrayList<ArrayList<String>> expense;
    ArrayList<String> date;
    ArrayList<String> amount;
    ArrayList<String> address;
    public Expense1(){
      this.expense = new ArrayList<ArrayList<String>>();
      this.date = new ArrayList<>();
      this.amount = new ArrayList<>();
      this.address = new ArrayList<>();
    }
    public ArrayList<ArrayList<String>> getExpense(){
      return expense;
    }
    public ArrayList<String> getDate(){
      return date;
    }
    public ArrayList<String> getAmount(){
      return amount;
    }
    public ArrayList<String> getAddress(){
      return address;
    }
    public void setExpense(){
      expense.add(date);
      expense.add(address);
      expense.add(amount);
      this.expense = expense;
    }
    public void setDate(){
      this.date = date;
    }
    public void setAmount(){
      this.amount = amount;
    }
    public void setAddress(){
      this.address = address;
    }
    public void addExpense(String date, String amount, String address){
      expense.get(0).add(date);
      expense.get(1).add(amount);
      expense.get(2).add(address);
    }
    public void save(String expense.txt) throws FileNotFoundException {
      PrintWriter pw = new PrintWriter(new FileOutputStream(expense.txt));
      for(Expense a : expenses){
        pw.print(a.getExpense());}
      pw.close();
}
    public String checkFile(){
      File f = new File("c://downloads//expenses.txt");
      if(!f.exists()){
          return "File exists";
        }
        else{
          return "File doesn't exist.";
        }
      }
    public void displayExpense(){

    }
    public static void main(String[] args){
    }
}
