package practicas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author eliwrosalesfernandez
 */
public class Practica1 {

    JFrame frame;
    JLabel lbl;
    JTextField textField;
    JButton btn;

    public Practica1() {
        frame = new JFrame("practica 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLayout(new BorderLayout());

        lbl = new JLabel("Escribe un nombre para saludar");
        textField = new JTextField("");
        btn = new JButton("Saludar!");

        frame.add(lbl, BorderLayout.NORTH);
        frame.add(textField, BorderLayout.CENTER);
        frame.add(btn, BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hola! " + textField.getText());
            }
        });
    }

    public void run() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica1().run();
            }
        });
    }
}
