import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewFrame extends JFrame{
  JFrame addFrame = new JFrame("Display Expense Window");

  public ViewFrame(){
    setSize(800,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
  public void createInteractors(){
  MyListener listener= new MyListener();

  Panel pnl=new Panel();
  add(pnl, BorderLayout.CENTER);


  }
  public class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
      dispose();
      ViewFrame viewFrame = new ViewFrame();
      viewFrame.setVisible(true);
      }
    }
    public static void main(String[] args){
       AddFrame addFrame=new AddFrame();
       Expense1 view = new Expense1();
       view.displayExpense();
    }

}
