
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

import static QUIZ_project.form4.crtans;
import static QUIZ_project.form4.get;

public class form9 extends JFrame {

    JLabel l[] = new JLabel[5];

    public form9() {
        for (int i = 0; i < l.length; i++) {
            System.out.println("cde runing");
            try {
                l[i].setBounds(50, 50 + (i * 50), 400, 30);
                add(l[i]);
                System.out.println("cde runing1");
            } catch (Exception e) {
                e.printStackTrace();
            }

            for (int j = 0; j < l.length; j++) {
                System.out.println("cde runing2");
                add(l[j]);
            }
        }
        // l[0].setBounds(50, 50, 400, 30);
        // l[1].setBounds(50, 100, 400, 30);
        // l[2].setBounds(50, 150, 400, 30);
        // l[3].setBounds(50, 200, 400, 30);
        // l[4].setBounds(50, 250, 400, 30);
        // add(l[0]);
        // add(l[1]);
        // add(l[2]);
        // add(l[3]);
        // add(l[4]);
        // System.out.println("kdsflsknf");
        // l[0].setText("you select ans ");
        for (int i = 0; i < 5; i++) {
            System.out.println("cde runing 1");
            l[i].setText("you select ans " + get[i] + " And Correct Ans  is " + crtans[i]);
        }
        System.out.println("kdsflsknfhguhdlfhvdfj");
        setLayout(null);
        setSize(500, 400);
        setVisible(true);

    }

    public static void main(String args[]) {
        new form9();
    }

}
