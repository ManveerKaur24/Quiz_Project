/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ_project;

/**
 *
 * @author lenovo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame implements ActionListener {
    JLabel l = new JLabel("QUESTIONS");
    JLabel l1 = new JLabel("Q1. The number are co-prime only iff and only if their HCF is");
    JRadioButton r1 = new JRadioButton("2");
    JRadioButton r2 = new JRadioButton("3");
    JRadioButton r3 = new JRadioButton("1");
    JRadioButton r4 = new JRadioButton("None of these");
    // JRadioButton r5=new JRadioButton("None of these");

    JLabel l2 = new JLabel("Q2. Which of following no's are prime no ");
    JRadioButton rb1 = new JRadioButton("6,4");
    JRadioButton rb2 = new JRadioButton("2,3");
    JRadioButton rb3 = new JRadioButton("8,12");
    JRadioButton rb4 = new JRadioButton("None of these");

    JLabel l3 = new JLabel("Q3. What is the square root of 35 ");
    JRadioButton jr1 = new JRadioButton("1445");
    JRadioButton jr2 = new JRadioButton("1226");
    JRadioButton jr3 = new JRadioButton("1257");
    JRadioButton jr4 = new JRadioButton("1225");

    JLabel l4 = new JLabel("Q4. Cube root of 45");
    JRadioButton rr1 = new JRadioButton("90453");
    JRadioButton rr2 = new JRadioButton("91125");
    JRadioButton rr3 = new JRadioButton("92453");
    JRadioButton rr4 = new JRadioButton("None of these");

    JLabel l5 = new JLabel("Q5. Which of following no is divisible by 2?");
    JRadioButton r11 = new JRadioButton("24148");
    JRadioButton r12 = new JRadioButton("26143");
    JRadioButton r13 = new JRadioButton("27169");
    JRadioButton r14 = new JRadioButton("27177");

    ButtonGroup bg = new ButtonGroup();
    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();
    ButtonGroup bg4 = new ButtonGroup();

    public form2() {
        l.setBounds(20, 20, 200, 30);
        l1.setBounds(20, 50, 400, 30);
        r1.setBounds(20, 90, 200, 30);
        r2.setBounds(20, 130, 200, 30);
        r3.setBounds(20, 170, 200, 30);
        r4.setBounds(20, 210, 200, 30);

        l2.setBounds(20, 250, 400, 30);
        rb1.setBounds(20, 300, 200, 30);
        rb2.setBounds(20, 340, 200, 30);
        rb3.setBounds(20, 380, 200, 30);
        rb4.setBounds(20, 420, 200, 30);

        l3.setBounds(20, 460, 400, 30);
        jr1.setBounds(20, 500, 200, 30);
        jr2.setBounds(20, 540, 200, 30);
        jr3.setBounds(20, 580, 200, 30);
        jr4.setBounds(20, 620, 200, 30);

        l4.setBounds(500, 50, 400, 30);
        rr1.setBounds(500, 90, 200, 30);
        rr2.setBounds(500, 130, 200, 30);
        rr3.setBounds(500, 170, 200, 30);
        rr4.setBounds(500, 210, 200, 30);

        l5.setBounds(500, 250, 400, 30);
        r11.setBounds(500, 300, 200, 30);
        r12.setBounds(500, 340, 200, 30);
        r13.setBounds(500, 380, 200, 30);
        r14.setBounds(500, 420, 200, 30);

        add(l);
        add(l1);
        bg.add(r1);
        add(r1);
        bg.add(r2);
        add(r2);
        bg.add(r3);
        add(r3);
        bg.add(r4);
        add(r4);
        // bg.add(r5);
        // add(r5);
        add(l2);
        bg1.add(rb1);
        add(rb1);
        bg1.add(rb2);
        add(rb2);
        bg1.add(rb3);
        add(rb3);
        bg1.add(rb4);
        add(rb4);

        add(l3);
        bg2.add(jr1);
        add(jr1);
        bg2.add(jr2);
        add(jr2);
        bg2.add(jr3);
        add(jr3);
        bg2.add(jr4);
        add(jr4);

        add(l4);
        bg3.add(rr1);
        add(rr1);
        bg3.add(rr2);
        add(rr2);
        bg3.add(rr3);
        add(rr3);
        bg3.add(rr4);
        add(rr4);

        add(l5);
        bg4.add(r11);
        add(r11);
        bg4.add(r12);
        add(r12);
        bg4.add(r13);
        add(r13);
        bg4.add(r14);
        add(r14);

        r1.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setSize(900, 700);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            r1.setForeground(Color.red);

        }

    }

    public static void main(String args[]) {
        new form2();
    }

}
