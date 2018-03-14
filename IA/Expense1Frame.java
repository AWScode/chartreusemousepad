import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Expense1Frame extends JFrame{
  public static JButton add_btn= new JButton("Add New Expense");
  public static JButton view_btn= new JButton("View Expenses");

  public static void main(String[] args){
    Expense1Frame frame = new Expense1Frame();
    frame.createInteractors();
    frame.setTitle("Main Window");
    frame.setSize(800,300);
    frame.setDefaultCloseOperation(Expense1Frame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  public static void createInteractors(){
    
  }
}
