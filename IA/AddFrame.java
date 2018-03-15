import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddFrame extends JFrame{
  JFrame addFrame = new JFrame("New Expense Window");
  JTextField date= new JTextField("Date(MM/DD/YYYY)");
  JTextField amount= new JTextField("Amount");
  JTextField address= new JTextField("Address");

  public AddFrame(){
    setSize(800,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args){
     AddFrame addFrame=new AddFrame();
   }
  public void createInteractors(){
  MyListener listener= new MyListener();

  Panel pnl=new Panel();
  add(pnl, BorderLayout.CENTER);

  pnl.add(date);
  date.addActionListener(listener);

  pnl.add(amount);
  amount.addActionListener(listener);

  pnl.add(address);
  address.addActionListener(listener);
}
  public class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==date){
        dispose();
        AddFrame addFrame = new AddFrame();
        addFrame.setVisible(true);
      }
      else if(e.getSource()==amount){
        dispose();
        AddFrame addFrame=new AddFrame();
        addFrame.setVisible(true);
      }
      else if(e.getSource()==address){
        dispose();
        AddFrame addFrame=new AddFrame();
        addFrame.setVisible(true);
      }
    }
  }
}
