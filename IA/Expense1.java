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
    public void save() throws FileNotFoundException {
      try(FileWriter fw = new FileWriter("expenses.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter out = new PrintWriter(bw)) {
        out.println(expense.get(0) + " " + expense.get(1) + " " + expense.get(2));
      }
      catch (IOException e) {
        System.out.println("oh no");
      }
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
