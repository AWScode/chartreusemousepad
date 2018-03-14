import java.util.*;
import java.lang.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class Expense1 extends JFrame implements ActionListener{
    ArrayList<ArrayList<String>> expense;
    ArrayList<String> date;
    ArrayList<String> amount;
    ArrayList<String> address;

    JFrame frame = new JFrame("Main Window");
    JButton add_btn= new JButton("Add New Expense");
    JButton view_btn= new JButton("View Expenses");

    public Expense1(){
      this.expense = new ArrayList<ArrayList<String>>();
      this.date = new ArrayList<>();
      this.amount = new ArrayList<>();
      this.address = new ArrayList<>();

      setTitle("Main Window");
      setSize(800,300);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
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
    public JFrame getFrame(){
      return frame;
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
    public void setFrame(){
      frame.setSize(800,300);
      frame.setDefaultCloseOperation(Expense1Frame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      this.frame = frame;
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
    public void displayExpense(){
      BufferedReader in = new BufferedReader(new FileReader("expenses.txt"));
      String line = in.readLine();
      while((line = in.readLine()) != null)
      {
          System.out.println(line);
      }
      in.close();
    }
    public static void main(String[] args){

    }
}
