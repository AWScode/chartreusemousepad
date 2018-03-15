import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
  JFrame mainFrame = new JFrame("Main Window");
  JButton add;
  JButton view;
  JPanel pnl;

  public MainFrame(){
    setTitle("Main Window");
    setSize(300,150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    this.add = new JButton("Add New Expense");
    this.view = new JButton("View Expenses");
    this.pnl = new JPanel();
  }
  public void setPnl(){
    pnl.add(add);
    //add.addActionListener(listener);
    pnl.add(view);
    //view.addActionListener(listener);
  }
  public static void main(String[] args){
     MainFrame mainFrame=new MainFrame();
   }
  public void createInteractors(){
  MyListener listener= new MyListener();
  add(pnl, BorderLayout.CENTER);

}
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
