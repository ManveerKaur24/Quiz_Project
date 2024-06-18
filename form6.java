import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form6 extends JFrame implements ActionListener {
    JLabel l = new JLabel("QUESTIONS");
    JLabel l1 = new JLabel("Q1. Which of the following has a same meaning as that of word AUDACIOUS ?");
    JRadioButton r1 = new JRadioButton("Engrave");
    JRadioButton r2 = new JRadioButton("Overconfident");
    JRadioButton r3 = new JRadioButton("Confident");
    JRadioButton r4 = new JRadioButton("Evacuated");
    JRadioButton r5 = new JRadioButton("Evacuated");

    JLabel l2 = new JLabel("Q2. Which of following have opposite meaning as that of AGGRESSIVE ?");
    JRadioButton rb1 = new JRadioButton("Peaceful");
    JRadioButton rb2 = new JRadioButton("Assertive");
    JRadioButton rb3 = new JRadioButton("Provoke");
    JRadioButton rb4 = new JRadioButton("Obvious");

    JLabel l3 = new JLabel("Q3. The one who is having very Selective taste ");
    JRadioButton jr1 = new JRadioButton("Incorrigible");
    JRadioButton jr2 = new JRadioButton("Accessible");
    JRadioButton jr3 = new JRadioButton("Fastidious");
    JRadioButton jr4 = new JRadioButton("Exocommunicate");

    JLabel l4 = new JLabel("Q4. He is not ...... Honourable man");
    JRadioButton rr1 = new JRadioButton("who");
    JRadioButton rr2 = new JRadioButton("the");
    JRadioButton rr3 = new JRadioButton("a");
    JRadioButton rr4 = new JRadioButton("an");

    JLabel l5 = new JLabel("Q5. What is the superlative degree of the word SWEET");
    JRadioButton r11 = new JRadioButton("Sweet");
    JRadioButton r12 = new JRadioButton("Sweeter");
    JRadioButton r13 = new JRadioButton("Sweetest");
    JRadioButton r14 = new JRadioButton("sweetier");

    ButtonGroup bg = new ButtonGroup();
    ButtonGroup bg1 = new ButtonGroup();
    ButtonGroup bg2 = new ButtonGroup();
    ButtonGroup bg3 = new ButtonGroup();

    JButton b2 = new JButton("Continue");
    JButton b3 = new JButton("Continue");
    JButton b = new JButton("Submit");
    JButton b1 = new JButton("Submit");

    public form6() {
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
            // if(TIMELIMIT >0)
            // new Timer();
            r1.setForeground(Color.red);
            r2.setEnabled(false);
            r3.setEnabled(false);
            r4.setEnabled(false);
        }
        if (r2.isSelected()) {
            r2.setForeground(Color.green);
            r3.setEnabled(false);
            r1.setEnabled(false);
            r4.setEnabled(false);
        }
        if (r3.isSelected()) {
            r3.setForeground(Color.red);
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
        new form6();
    }

}
