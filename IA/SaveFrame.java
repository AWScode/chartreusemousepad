import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SaveFrame extends JFrame{
  JFrame frame = new JFrame("New Expense Saved");
  JLabel lbl;
  JButton home;
  JButton close;
  MyListener listener;
  JPanel pnl;



  public SaveFrame(){
    setSize(800,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    this.lbl = new JLabel();
    this.listener= new MyListener();
    this.pnl=new JPanel();
    this.home = new JButton("Go Back To Home Page");
    this.close = new JButton("Close");
    add(pnl, BorderLayout.CENTER);

    pnl.add(lbl);

    pnl.add(home);
    home.addActionListener(listener);

    pnl.add(close);
    close.addActionListener(listener);
  }
  public class MyListener implements ActionListener{
   @Override
     public void actionPerformed(ActionEvent e){
       if(e.getSource()==home){
         dispose();
         Expense1 expense = new Expense1();
       }
       else if(e.getSource()==close){
         dispose();
       }
     }
   }
}
