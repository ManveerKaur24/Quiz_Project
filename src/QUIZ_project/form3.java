/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
package QUIZ_project;

import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class form3 extends JFrame implements ActionListener {

    static int m;
    // Create an ImageIcon object to hold the image
    ImageIcon icon = new ImageIcon("D:\\QUIZ_project\\7_1.jpg");
    Image image = icon.getImage();
    // Resize the image
    Image newimg = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    ImageIcon newImageIcon = new ImageIcon(newimg);
    JLabel l1 = new JLabel(icon);
    JLabel l = new JLabel("Levels");
    JRadioButton b = new JRadioButton("Quantitative Aptitude");
    JRadioButton b1 = new JRadioButton("Logical Ability");
    JRadioButton b2 = new JRadioButton("Verbal Ability");
    JRadioButton b3 = new JRadioButton("Technical Ability");
    ButtonGroup bg = new ButtonGroup();
    JButton jb = new JButton("START");
    JButton jb1 = new JButton("FINISH");

    public form3() {
        super("CRACK THE QUIZ");
        l.setBounds(60, 10, 200, 100);
        l.setFont(new Font("Snap ITC", Font.BOLD, 48));
        b.setBounds(60, 100, 250, 30);
        b.setFont(new Font("Arial", Font.PLAIN, 14));
        b1.setBounds(60, 140, 200, 30);
        b1.setFont(new Font("Arial", Font.PLAIN, 14));
        b2.setBounds(60, 180, 200, 30);
        b2.setFont(new Font("Arial", Font.PLAIN, 14));
        b3.setBounds(60, 220, 200, 30);
        b3.setFont(new Font("Arial", Font.PLAIN, 14));
        jb.setBounds(60, 300, 100, 30);
        jb1.setBounds(200, 300, 100, 30);

        l1.setBounds(0, 0, 1400, 700);

        add(l);
        bg.add(b);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        add(b);
        add(b1);
        add(b2);
        add(b3);
        add(jb);
        add(jb1);

        jb.addActionListener(this);
        jb1.addActionListener(this);
        add(l1);
        setLayout(null);
        setVisible(true);
        setSize(400, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (b.isSelected()) {
            new form4().setVisible(true);;
            try {
                new form4().getdata();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            }
            b.setEnabled(false);

        } else if (b1.isSelected()) {
            new form5().setVisible(true);
            try {
                new form5().getdata();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            }
            b1.setEnabled(false);
        } else if (b2.isSelected()) {
            new form6().setVisible(true);
            try {
                new form6().getdata();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            }
            b2.setEnabled(false);
        } else if (b3.isSelected()) {
            new form7().setVisible(true);;
            try {
                new form7().getdata();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(form3.class.getName()).log(Level.SEVERE, null, ex);
            }
            b3.setEnabled(false);
        }

        if (e.getSource() == jb1) {
            System.exit(0);
            JOptionPane.showMessageDialog(this, "your marks is "+m); 
        }
    }

    // public static void data(int mm)
    // {
    // m=m+mm;
    //
    // }
    //

    public static void main(String args[]) {
        new form3();
    }

}
