import java.util.*;
import java.lang.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

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

    public void save(int a) throws FileNotFoundException {
      try(FileWriter fw = new FileWriter("expenses.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter out = new PrintWriter(bw);) {
        out.println(expense.get(0).get(a) + " " + expense.get(1).get(a) + " " + expense.get(2).get(a));
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

    public String displayExpense(){
      String line;
      try(BufferedReader in = new BufferedReader(new FileReader("expenses.txt"));){
        while((line = in.readLine()) != null){
          return(line);
        }
        in.close();
      }
      catch (IOException e){
        return "oh no";
      }
      return "ok";
    }

    public static void main(String[] args){
      Expense1 ex = new Expense1();
      MainFrame a = new MainFrame();
    }
}
