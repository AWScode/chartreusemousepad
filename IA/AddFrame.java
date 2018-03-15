import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddFrame extends JFrame{
  public JFrame mainFrame = new JFrame("Main Window");
  public JTextField date;
  public JTextField amount;
  public JTextField address;
  public MyListener listener;
  public JButton save;
  public JPanel pnl;


  public AddFrame(){
    setTitle("Main Window");
    setSize(300,150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.listener= new MyListener();
    this.pnl = new JPanel();
    this.amount = new JField("Amount");
    this.date = new JField("Date (MM/DD/YYYY)");
    this.address = new JField("Address");
    this.save = new JButton("Save");

    add(pnl, BorderLayout.CENTER);

    pnl.add(date);
    date.addActionListener(listener);

    pnl.add(amount);
    amount.addActionListener(listener);
    setVisible(true);

    pnl.add(address);
    address.addActionListener(listener);

    pnl.add(save);
    save.addActionListener(listener);

    setVisible(true);
  }
  public class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==save){
        dispose();
        SaveFrame saveFrame = new SaveFrame();
        saveFrame.setVisible(true);
      }
    }
  }
}
