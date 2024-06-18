/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz_app;

/**
 *
 * @author lenovo
 */
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class form1 extends JFrame implements ActionListener {
    
    Connection con;
    Statement smt;
    
    
    public String name;
    public ImageIcon x1 = new ImageIcon(getClass().getResource("D:\\QUIZ_project\\2.jpg"));

    public ImageIcon x2 = new ImageIcon(getClass().getResource("D:\\QUIZ_project\\7.jpg"));
    JLabel ll=new JLabel(x2);
    JLabel l=new JLabel(x1);
    JLabel l1=new JLabel("First Name: ");
    JLabel l2=new JLabel("Last Name:");
    JLabel l3=new JLabel("Age:");
    JLabel l4=new JLabel("Email id:");
    JLabel l5=new JLabel("Date of Birth:");
    JLabel l6=new JLabel("Contact No.:");
    JLabel l7=new JLabel("Address:");
    JLabel l8=new JLabel("City:");
    JLabel l9=new JLabel("State:");
    
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JTextField t4=new JTextField();
    JTextField t5=new JTextField();
    JTextField t6=new JTextField();
    JTextField t7=new JTextField();
    JTextField t8=new JTextField();
    JTextField t9=new JTextField();
    
    JComboBox cb=new JComboBox();
    JComboBox cb1=new JComboBox();
    JComboBox cb2=new JComboBox();
    
    
    
//    JRadioButton r=new JRadioButton("Male");
//    JRadioButton r1=new JRadioButton("Female");
    JButton b1=new JButton("SUBMIT");
    JButton b2=new JButton("EXIT");
//    ButtonGroup bg=new ButtonGroup();
    public form1()
    {
        super("LOGIN FORM");
        
        
        
        
        
        
        ll.setBounds(0, 0, 1400, 700);
        l.setBounds(0, 0, 500, 120);
        l1.setBounds(100, 150, 80, 30);
        l1.setFont(new Font("Arial",Font.BOLD,12));
        l2.setBounds(100,190,80,30);
        l2.setFont(new Font("Arial",Font.BOLD,12));
        l4.setBounds(100, 230, 80, 30);
        l4.setFont(new Font("Arial",Font.BOLD,12));
        l5.setBounds(100, 270, 80, 30);
        l5.setFont(new Font("Arial",Font.BOLD,12));
        l6.setBounds(100, 310, 80, 30);
        l6.setFont(new Font("Arial",Font.BOLD,12));
        l7.setBounds(100, 350, 80, 30);
        l7.setFont(new Font("Arial",Font.BOLD,12));
        l8.setBounds(100, 390, 80, 30);
        l8.setFont(new Font("Arial",Font.BOLD,12));
        l9.setBounds(100, 430, 80, 30);
        l9.setFont(new Font("Arial",Font.BOLD,12));
        
        
        t1.setBounds(190, 150, 180, 30);
        t2.setBounds(190, 190, 180, 30);
        t3.setBounds(190, 230, 180, 30);
        t4.setBounds(190, 310, 180, 30);
        t5.setBounds(190, 350, 180, 30);
        t6.setBounds(190, 390, 180, 30);
        t7.setBounds(190,430, 180, 30);
        t9.setBounds(190,270,180,30);
        cb.setBounds(190, 270, 50, 30);
        cb1.setBounds(250, 270, 50, 30);
        cb2.setBounds(310, 270, 60, 30);
        
        cb.addItem("D");
        for(int i=1;i<=31;i++)
        {
            cb.addItem(i);
        }
//        
//        
        
        cb1.addItem("M");
        for(int i=1;i<=12;i++)
        {
            cb1.addItem(i);
        }
        cb2.addItem("Y");
        for(int i=1980;i<=2016;i++)
        {
            cb2.addItem(i);
        }
        
      
        b1.setBounds(100, 500, 80, 30);
        b2.setBounds(290, 500, 80, 30);
        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);//add(t9);
        add(cb);add(cb1);add(cb2);
     
        add(b1);
        add(b2);
        add(ll);
        b1.addActionListener(this);
        b2.addActionListener(this);
     
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setSize(500,700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
    
    
    public void getrecord() throws ClassNotFoundException
    {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_app","root","Veer@2024");
          System.out.print("connection");
          smt=con.createStatement();
          String fname=t1.getText();
          name=fname;
          String lname=t2.getText();
          String email=t3.getText();
          String contact=t4.getText();
          String address=t5.getText();
          String city=t6.getText();
          String state=t7.getText();
         // String dob=t9.getText();
          String dat=(String)cb.getSelectedItem().toString();
          String mon=(String)cb1.getSelectedItem().toString();
          String year=(String)cb2.getSelectedItem().toString();
          String dob= dat+"/"+mon+"/"+year;
          smt.executeUpdate("insert into login_table values('"+fname+"','"+lname+"','"+dob+"','"+email+"','"+contact+"','"+address+"','"+city+"','"+state+"')");
             JOptionPane.showMessageDialog(this, "Successfully insert.");
            
   
          
        t1.setText(" ");
          t2.setText(" ");
          t3.setText(" "); 
          t4.setText(" ");
          t5.setText(" ");
          t6.setText(" ");
          t7.setText(" ");
          cb.setSelectedItem(0);
          cb1.setSelectedItem(0);
          cb2.setSelectedItem(0);
                  }
        catch(SQLException e)
        {
            System.out.println("Error"+e);
        }
    }
    
    
    
    
     @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==b1)
        {
            if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("") || t6.getText().equals("") || t7.getText().equals("")  )
            {
                     JOptionPane.showMessageDialog(this, "Fill all fields..");
            }
            else
            {
                try {
                      getrecord();
                      this.hide();
                      new form1().setVisible(true);;
           
                    
                }
                catch (ClassNotFoundException ex) {
                    Logger.getLogger(form1.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
            }
         }
        if(e.getSource()==b2)
        {
            System.exit(0);
        }
    } 
    
    public static void main(String args[])
    {
        new form1();
    }

   
    
    
}
