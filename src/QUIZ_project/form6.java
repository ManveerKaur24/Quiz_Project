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

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import QUIZ_project.form1;

import java.sql.*;
import static QUIZ_project.form8.TIMELIMIT;

public class form6 extends JFrame implements ActionListener, ItemListener {
    static String get[] = new String[5];
    static int marks = 0;

    Connection coon;
    Statement stmt;
    ResultSet rs;

    static int count1 = 0;
    static int count = 0;
    static String q[] = new String[20];
    static String ques[] = new String[20];
    static String ans[][] = new String[20][5];
    static String crtans[] = new String[20];
    static String rd[] = { "A", "B", "C", "D", " " };

    JRadioButton rb, rb1, rb2, rb3, rb4;

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    JTextField t5 = new JTextField();
    JTextField t6 = new JTextField();
    JTextField t7 = new JTextField();

    ButtonGroup bg = new ButtonGroup();

    JLabel ll;
    JLabel l1 = new JLabel("Ques");

    public static int l = 0, k = 0, cn = 0, i = 0;
    JLabel l6 = new JLabel("Correct Answer.");
    JLabel l7 = new JLabel();

    JButton b1 = new JButton("CONFIRM");
    JButton b2 = new JButton("NEXT");
    JButton b3 = new JButton("Finish");
    JButton b4 = new JButton("BACK TO HOME");

    JLabel counter = new JLabel("     There are 5 questions in total");

    public form6() {
        super("CRACK THE QUIZ");

        counter.setBounds(20, 30, 500, 30);
        add(counter);

        ll = new JLabel("Welcome");

        rb = new JRadioButton("A");
        rb1 = new JRadioButton("B");
        rb2 = new JRadioButton("C");
        rb3 = new JRadioButton("D");
        rb4 = new JRadioButton();

        rb.setBounds(50, 150, 100, 30);
        rb1.setBounds(50, 200, 100, 30);
        rb2.setBounds(50, 250, 100, 30);
        rb3.setBounds(50, 300, 100, 30);
        rb4.setBounds(50, 350, 100, 30);

        l1.setBounds(50, 100, 30, 30);

        l6.setBounds(50, 350, 100, 30);
        l7.setBounds(100, 100, 30, 30);

        t1.setBounds(150, 100, 450, 30);
        t2.setBounds(150, 150, 200, 30);
        t3.setBounds(150, 200, 200, 30);
        t4.setBounds(150, 250, 200, 30);
        t5.setBounds(150, 300, 200, 30);
        t6.setBounds(150, 350, 200, 30);

        b1.setBounds(200, 400, 100, 30);
        b2.setBounds(350, 400, 100, 30);
        b3.setBounds(500, 400, 150, 30);

        add(l1);
        add(l7);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);

        add(b2);
        add(b3);

        add(rb);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);

        bg.add(rb);
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        rb.addItemListener(this);
        rb1.addItemListener(this);
        rb2.addItemListener(this);
        rb3.addItemListener(this);
        rb4.addItemListener(this);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        if (TIMELIMIT > 0)
            new Timer();

        setVisible(true);
        setSize(700, 500);
        setLayout(null);
    }

    // create a connetion

    public void getdata() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_app", "root", "Veer@2024");
        System.out.print("connection");
        stmt = coon.createStatement();
        rs = stmt.executeQuery("SELECT * FROM verbal");

        int i = 0;
        while (rs.next()) {
            q[i] = rs.getString(1);
            ques[i] = rs.getString(2);

            for (int j = 0; j <= 3; j++) {
                ans[i][j] = rs.getString(j + 3);
            }
            crtans[i] = rs.getString(7);
            i++;
        }
        l7.setText(q[0]);
        t1.setText(ques[0]);
        t2.setText(ans[0][0]);
        t3.setText(ans[0][1]);
        t4.setText(ans[0][2]);
        t5.setText(ans[0][3]);

    }

    // For display next question on frame
    public void setdata(int k) {
        for (int i = k; i < q.length; i++) {
            l7.setText(q[i]);
            t1.setText(ques[i]);
            t2.setText(ans[i][0]);
            t3.setText(ans[i][1]);
            t4.setText(ans[i][2]);
            t5.setText(ans[i][3]);
            break;
        }

    }

    // To save the user answer.
    public void setdata1() {
        count1++;
        boolean x = rb.isSelected();
        boolean x1 = rb1.isSelected();
        boolean x11 = rb2.isSelected();
        boolean x12 = rb3.isSelected();
        if (x) {
            get[l] = ans[k][0];
        } else if (x1) {
            get[l] = ans[k][1];
        } else if (x11) {
            get[l] = ans[k][2];
        } else if (x12) {
            get[l] = ans[k][3];
        } else {

            get[l] = "x";
        }

        l = l + 1;
        k = k + 1;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b2) {

            setdata1();
            count++;
            setdata(count);

            t6.setText(" ");
            b1.setEnabled(true);

        }

        if (e.getSource() == b3) {
            for (int z = 0; z < get.length; z++) {

                System.out.println(get[z]);

            }
            for (int h = 0; h < get.length; h++) {

                String us = get[h];
                String crt = crtans[h];

                if (us.equals(crt)) {

                    marks = marks + 2;
                    //
                }
            }
            new Resultwindow();
            this.dispose();

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    // Display Answers
    public class Resultwindow extends JFrame implements ActionListener {

        JButton b = new JButton("EXIT");
        JLabel l[] = new JLabel[5];
        JLabel l2 = new JLabel();

        Resultwindow() {
            setSize(500, 500);
            setVisible(true);
            setLayout(null);
            b.setBounds(200, 400, 100, 30);
            l2.setBounds(50, 300, 100, 30);
            add(b);
            add(l2);
            b.addActionListener(this);
            for (int i = 0; i < 5; i++) {
                l[i] = new JLabel();

                l[i].setBounds(50, 50 + (i * 50), 400, 30);
                add(l[i]);
            }
            for (int j = 0; j < 5; j++) {

                l[j].setText("Ques " + q[j] + ": " + get[j] + " correctans " + crtans[j]);

            }

            l2.setForeground(Color.BLUE);
            l2.setText("You get " + marks + " marks");

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b) {
                System.exit(0);
            }
        }
    }

    // Timer
    public class Timer extends JFrame implements Runnable {
        Thread t;

        int secs, mins, TOTAL = 10;
        boolean start_test;

        public Timer() {

            //
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
                        b2.setEnabled(false);

                        rb.setEnabled(false);
                        rb1.setEnabled(false);
                        rb2.setEnabled(false);
                        rb3.setEnabled(false);
                        rb4.setEnabled(false);

                        // endTest();
                    }
                } catch (InterruptedException ex) {
                    System.out.print(ex);
                }
            }
        }
    }

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        new form6().getdata();
    }

}
