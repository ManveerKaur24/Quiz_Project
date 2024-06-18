/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package QUIZ_project;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class timer extends JFrame implements Runnable {
    Thread t;
    static int TIMELIMIT = 1;
    int secs, mins, TOTAL = 5;
    boolean start_test;
    JLabel counter = new JLabel("     There are " + TOTAL + " questions in total");

    public timer() {

        counter.setBounds(20, 30, 500, 30);
        add(counter);

        setSize(600, 600);
        setLayout(null);
        setVisible(true);
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

    public static void main(String args[]) {
        if (TIMELIMIT > 0)
            new timer();
    }

}
