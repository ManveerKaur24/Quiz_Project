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

public class CrackQuiz extends JFrame implements ActionListener {
    // public ImageIcon x1 = new
    // ImageIcon(getClass().getResource("D:\\QUIZ_project\\6.jpg"));
    // Create an ImageIcon object to hold the image
    ImageIcon icon = new ImageIcon("D:\\QUIZ_project\\6.jpg");
    Image image = icon.getImage();
    // Resize the image
    Image newimg = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
    ImageIcon newImageIcon = new ImageIcon(newimg);
    JLabel l = new JLabel(icon);
    JLabel l1 = new JLabel("CRACK THE QUIZ");
    JLabel l2 = new JLabel("Instructions:");
    JLabel l3 = new JLabel("* Quiz contains four levels.");
    JLabel l4 = new JLabel("Quantitative Aptitude");
    JLabel l5 = new JLabel("Logical Ability");
    JLabel l6 = new JLabel("Verbal Ability");
    JLabel l7 = new JLabel("Technical");
    JLabel l8 = new JLabel("* Each levels contain five questions.");
    JLabel l9 = new JLabel("* All questions are MCQs having four options");
    JLabel l10 = new JLabel("* 20 questions are included in quiz.");
    JLabel l11 = new JLabel("* Tme limit of each questions is one minute");
    JLabel l12 = new JLabel("* You have only 20 minutes to complete the quiz.");
    JButton b = new JButton("PROCEED");

    public CrackQuiz() {
        super("CRACK THE QUIZ");

        l.setBounds(0, 0, 1400, 900);
        Font f = new Font("Monotype Corsiva", Font.BOLD, 70);
        Font f2 = new Font("Monotype Corsiva", Font.BOLD, 40);
        Font f1 = new Font("Monotype Corsiva", Font.BOLD, 28);

        l1.setBounds(60, 10, 800, 70);
        l1.setFont(f);
        l2.setBounds(60, 120, 800, 40);
        l2.setFont(f2);
        l3.setBounds(60, 160, 800, 40);
        l3.setFont(f1);
        l4.setBounds(70, 200, 800, 40);
        l4.setFont(f1);
        l5.setBounds(70, 240, 800, 40);
        l5.setFont(f1);
        l6.setBounds(70, 280, 800, 40);
        l6.setFont(f1);
        l7.setBounds(70, 320, 800, 40);
        l7.setFont(f1);
        l8.setBounds(60, 360, 800, 40);
        l8.setFont(f1);
        l9.setBounds(60, 400, 800, 40);
        l9.setFont(f1);
        l10.setBounds(60, 440, 800, 40);
        l10.setFont(f1);
        l11.setBounds(60, 480, 800, 40);
        l11.setFont(f1);
        l12.setBounds(60, 520, 800, 40);
        l12.setFont(f1);
        b.setBounds(500, 600, 100, 40);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(b);

        add(l);
        b.addActionListener(this);

        setLayout(null);
        setVisible(true);
        setSize(700, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "LOGIN TO PROCEED.");
        
            new form1().setVisible(true);
            // new form3().setVisible(true);



        }

    }

    public static void main(String args[]) {
        new CrackQuiz();
    }

}
