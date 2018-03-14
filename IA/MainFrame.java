import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
  JFrame mainFrame = new JFrame("Main Window");
  JButton add_btn= new JButton("Add New Expense");
  JButton view_btn= new JButton("View Expenses");

  public MainFrame(){
    setTitle("Main Window");
    setSize(800,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args){
     MainFrame mainFrame=new MainFrame();
   }
  public void createInteractors(){
  MyListener listener= new MyListener();

  Panel pnl=new Panel();
  add(pnl, BorderLayout.CENTER);

  pnl.add(add_btn);
  add_btn.addActionListener(listener);

  pnl.add(view_btn);
  view_btn.addActionListener(listener);
}
  public class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==add_btn){
        dispose();
        AddFrame addFrame = new AddFrame();
        addFrame.setVisible(true);
      }
      else if(e.getSource()==view_btn){
        dispose();
        ViewFrame viewFrame=new ViewFrame();
        viewFrame.setVisible(true);
      }
    }
  }
}
