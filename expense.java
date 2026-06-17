import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

class ExpenseTracker
{
static JFrame jf = new JFrame("Expense Tracker");
static JTextField amount, dt;
static JComboBox <String> category;
static JTextArea remarks;
static JButton save, reset;

static public void main(String [] rk)
{
jf.setSize(650, 900);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLocationRelativeTo(null);

amount = new JTextField(20);
dt = new JTextField("YYYY-MM-dd", 20);
remarks = new JTextArea(5, 20);
save = new JButton("Save");
reset = new JButton("Reset");

String [] items = {"Food", "Transportation", "Housing / Home", "Bills & Utilities", "Shopping", "Education" , "Health & Medical" , " Entertainment", "Travel" , "Miscellaneous" };

category = new JComboBox<String>(items);

Font f = new Font("Serif", 1, 36);
JLabel amt = new JLabel("Amount");
amt.setFont(f);
JLabel ctg = new JLabel("Category");
ctg.setFont(f);
JLabel date = new JLabel("Date");
date.setFont(f);
JLabel rm = new JLabel("Remarks");
rm.setFont(f);

save.setFont(f);
reset.setFont(f);
Font f2 = new Font("Serif", 0, 24);
category.setFont(f2);
amount.setFont(f);
remarks.setFont(f2);
dt.setFont(f2);

//Manual placement of components

jf.setLayout(null);

//Category
jf.add(ctg); ctg.setBounds(100, 200, 150, 60);
jf.add(category); category.setBounds(300, 200, 250, 60);

//Amount
jf.add(amt); amt.setBounds(100, 300, 150, 60);
jf.add(amount); amount.setBounds(300, 300, 250, 60);

//Date
jf.add(date); date.setBounds(100, 400, 150, 60);
jf.add(dt); dt.setBounds(300, 400, 250, 60);

//Remarks
jf.add(rm); rm.setBounds(100, 500, 150, 60);
jf.add(remarks); remarks.setBounds(300, 500, 250, 150);

//Buttons

jf.add(save); save.setBounds(150, 700, 350, 40);
jf.add(reset); reset.setBounds(150, 770, 350, 40);



jf.setVisible(true);
}
}