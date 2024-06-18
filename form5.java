import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form5 extends JFrame implements ActionListener {
    JLabel l = new JLabel("QUESTIONS");
    JLabel l1 = new JLabel("Q1.What is the position of alphabet R from Right to left ");
    JRadioButton r1 = new JRadioButton("21");
    JRadioButton r2 = new JRadioButton("17");
    JRadioButton r3 = new JRadioButton("9");
    JRadioButton r4 = new JRadioButton("14");
    JRadioButton r5 = new JRadioButton("14");

    JLabel l2 = new JLabel("Q2.IF NEHA s written as AEHN,how HEMA is written ");
    JRadioButton rb1 = new JRadioButton("ASTC");
    JRadioButton rb2 = new JRadioButton("AEMH");
    JRadioButton rb3 = new JRadioButton("DBRT");
    JRadioButton rb4 = new JRadioButton("HEMA");

    JLabel l3 = new JLabel("Q3.ORANGE is written as QTCPIG,how HOUSE is written ");
    JRadioButton jr1 = new JRadioButton("PQRST");
    JRadioButton jr2 = new JRadioButton("MNOPQ");
    JRadioButton jr3 = new JRadioButton("JOWVG");
    JRadioButton jr4 = new JRadioButton("ABCDE");

    JLabel l4 = new JLabel("Q4.SUMMER is written as Runner,how WINTER is written  ");
    JRadioButton rr1 = new JRadioButton("ABCDEF");
    JRadioButton rr2 = new JRadioButton("IJKLMN");
    JRadioButton rr3 = new JRadioButton("VIOUER");
    JRadioButton rr4 = new JRadioButton("WXYZN");

    JLabel l5 = new JLabel("Q5.DONKEY is written as XDJMNC,how ZEBRA is written ");
    JRadioButton r11 = new JRadioButton("ZQADY");
    JRadioButton r12 = new JRadioButton("VIOUE");
    JRadioButton r13 = new JRadioButton("SMTPQ");
    JRadioButton r14 = new JRadioButton("NGSAP");

    ButtonGroup bg = new ButtonGroup();
    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();

    JButton b2 = new JButton("Continue");
    JButton b3 = new JButton("Continue");
    JButton b = new JButton("Submit");
    JButton b1 = new JButton("Submit");

    public form5() {
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

        b.addActionListener(this);
        setVisible(true);
        setLayout(null);
        setSize(500, 700);

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
            r3.setEnabled(false);
            r1.setEnabled(false);
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

    }

    public static void main(String args[]) {
        new form5();
    }

}
