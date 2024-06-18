import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form7 extends JFrame implements ActionListener {
    JLabel l = new JLabel("QUESTIONS");
    JLabel l1 = new JLabel("Q1.Wrapping up of a data into single unit is known as");
    JRadioButton r1 = new JRadioButton("Polymorphism");
    JRadioButton r2 = new JRadioButton("Data Abstraction");
    JRadioButton r3 = new JRadioButton("Encapsulation");
    JRadioButton r4 = new JRadioButton("Inheritance");
    JRadioButton r5 = new JRadioButton("Inheritance");

    JLabel l2 = new JLabel("Q2.C language is developed by  ");
    JRadioButton rb1 = new JRadioButton("Martin Richards");
    JRadioButton rb2 = new JRadioButton("Ken thompson");
    JRadioButton rb3 = new JRadioButton("Dennis Ritche");
    JRadioButton rb4 = new JRadioButton("None of the above");

    JLabel l3 = new JLabel("Q3.C++ is developed by  ");
    JRadioButton jr1 = new JRadioButton("Dennis Ritche");
    JRadioButton jr2 = new JRadioButton("Bjarne Stroustruop");
    JRadioButton jr3 = new JRadioButton("Bill Gates");
    JRadioButton jr4 = new JRadioButton("Steve Jobs");

    JLabel l4 = new JLabel("Q4. Divide by Zero is which type of Error");
    JRadioButton rr1 = new JRadioButton("Compilation Error");
    JRadioButton rr2 = new JRadioButton("Syntax Error");
    JRadioButton rr3 = new JRadioButton("Logic Error");
    JRadioButton rr4 = new JRadioButton("Runtime Error");

    JLabel l5 = new JLabel("Q5.Which function is used to hold the output screen till users enter a key  ");
    JRadioButton r11 = new JRadioButton("Printf()");
    JRadioButton r12 = new JRadioButton("Scanf()");
    JRadioButton r13 = new JRadioButton("Main()");
    JRadioButton r14 = new JRadioButton("Getch()");

    ButtonGroup bg = new ButtonGroup();
    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();

    JButton b2 = new JButton("Continue");
    JButton b3 = new JButton("Continue");
    JButton b = new JButton("CONFIRM");
    JButton b1 = new JButton("CONFIRM");

    public form7() {
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
        new form7();
    }

}
