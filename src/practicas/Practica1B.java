package practicas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


/**
 *
 * @author eliwrosalesfernandez
 * se ocupara  GridBagLayout  para esta practica
 */
public class Practica1B {

    JFrame frame;
    GridBagConstraints gbc;
    GridBagLayout layout;

    JButton btn;
    JButton btn2;
    JButton btn3;

    JLabel label;

    public Practica1B () 
    {
        frame = new JFrame("Practica1B (GridBagLayout) ");
        frame.setLayout(new GridBagLayout());
        
        frame.setSize(512, 256); //512 x 256px tamaño
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // cuando se cierra la app
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Escoge una opcion");
        


        btn = new JButton("Start");
        btn2 = new JButton("Stop");
        btn3 = new JButton("Close");

        frame.add(label);
        frame.add(btn);
        frame.add(btn2);
        frame.add(btn3);

        layout = new GridBagLayout();
        gbc = new GridBagConstraints();
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Se ha inicado el proyecto");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"Se ha parado el proyecto....");

            }
            
        });

        btn3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Se cerrara el proyecto...");
                System.exit(0);
            }

        });

    }

    public void run() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
     java.awt.EventQueue.invokeLater(new Runnable(){
        public void run() {
            new Practica1B().run();
        }
     });
        

    }

    

}
