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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form8 extends JFrame implements ActionListener {

    static int TIMELIMIT = 5;
    JLabel l = new JLabel("QUESTIONS");
    JLabel l1 = new JLabel("Q1. The number are co-prime only iff and only iff their HCF is");
    JRadioButton r1 = new JRadioButton("2");
    JRadioButton r2 = new JRadioButton("3");
    JRadioButton r3 = new JRadioButton("1");
    JRadioButton r4 = new JRadioButton("None of these");
    JRadioButton r5 = new JRadioButton("None of these");

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

    JButton b2 = new JButton("Continue");
    JButton b3 = new JButton("Continue");
    JButton b = new JButton("Submit");
    JButton b1 = new JButton("Submit");
    private int TOTAL = 10;

    JLabel counter = new JLabel("     There are " + TOTAL + " questions in total");

    public form8() {

        counter.setBounds(20, 30, 500, 30);
        add(counter);

        l.setBounds(20, 20, 200, 30);
        l1.setBounds(20, 50, 400, 30);
        r1.setBounds(20, 90, 200, 30);
        r2.setBounds(20, 130, 200, 30);
        r3.setBounds(20, 170, 200, 30);
        r4.setBounds(20, 210, 200, 30);
        b.setBounds(100, 350, 100, 30);
        b2.setBounds(220, 350, 100, 30);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);
        add(l);
        add(l1);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
        add(r5);
        add(b);
        add(b1);
        add(b2);
        add(b3);

        if (TIMELIMIT > 0)
            new Timer();

        b.addActionListener(this);

        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        setSize(500, 500);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            r1.setForeground(Color.red);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);

        }
        if (r2.isSelected()) {
            r2.setForeground(Color.red);
            r1.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if (r3.isSelected()) {
            r3.setForeground(Color.green);
            r2.setEnabled(false);
            r1.setEnabled(false);
            r4.setEnabled(false);
        }
        if (r4.isSelected()) {
            r4.setForeground(Color.red);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r1.setEnabled(false);
        }

        // if(TIMELIMIT >0) new Timer();

    }

    public class Timer extends JFrame implements Runnable {
        Thread t;

        int secs, mins, TOTAL = 10;
        boolean start_test;

        // JLabel counter = new JLabel(" There are "+TOTAL+" questions in total");
        public Timer() {

            // counter.setBounds(20,30,500,30);
            // add(counter);

            // setSize(600,600);
            // setLayout(null);
            // setVisible(true);
            t = new Thread(this);
            System.out.println("test::" + start_test);
            t.start();

        }

        public void run() {

            start_test = true;
            while (start_test) {
                try {
                    Thread.sleep(1000);
                    secs++;
                    if (secs % 60 == 0 && secs != 0) {
                        secs -= 60;
                        mins++;
                    }
                    counter.setText("    Time Counter:  " + mins + " mins : " + secs + " secs ");
                    if (mins == TIMELIMIT) {
                        start_test = false;
                        JOptionPane.showMessageDialog(this, "TIME UP");

                        // endTest();
                    }
                } catch (InterruptedException ex) {
                    System.out.print(ex);
                }
            }
        }
    }

    public static void main(String args[]) {
        new form8();
    }

}
