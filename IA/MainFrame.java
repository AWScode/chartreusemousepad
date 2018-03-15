import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
  public JFrame mainFrame = new JFrame("Main Window");
  public JButton add;
  public JButton view;
  MyListener listener;
  JPanel pnl;


  public MainFrame(){
    setTitle("Main Window");
    setSize(300,150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.listener= new MyListener();
    this.pnl = new JPanel();
    this.add = new JButton("Add New Expense");
    this.view = new JButton("View Expenses");

    add(pnl, BorderLayout.CENTER);

    pnl.add(add);
    add.addActionListener(listener);

    pnl.add(view);
    view.addActionListener(listener);
    setVisible(true);
  }
  /*public static void main(String[] args){
     MainFrame mainFrame=new MainFrame();
     mainFrame.createInteractors();
   }*/
  /*public void createInteractors(){
  MyListener listener= new MyListener();
  JPanel pnl = new JPanel();
  add(pnl, BorderLayout.CENTER);

  pnl.add(add);
  add.addActionListener(listener);

  pnl.add(view);
  view.addActionListener(listener);
}*/
  public class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==add){
        dispose();
        AddFrame addFrame = new AddFrame();
        addFrame.setVisible(true);
      }
      else if(e.getSource()==view){
        dispose();
        ViewFrame viewFrame=new ViewFrame();
        viewFrame.setVisible(true);
      }
    }
  }
}
