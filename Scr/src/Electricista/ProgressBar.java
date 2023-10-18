package Electricista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ProgressBar extends JFrame {

    JFrame m;
    JButton b1,b2;
    JProgressBar barra;



    public ProgressBar() {
        m = new JFrame();
        b1 = new JButton();
        b2 = new JButton();
        barra = new JProgressBar();


        m.setLayout(null);
        m.setBounds(200, 200, 500, 500);
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setVisible(true);


        barra.setBounds(50,50,400,50);

        barra.setStringPainted(true);

        barra.setValue(0);

        barra.setOrientation(0);


        m.add(barra);
        /*m.add(b1);
        m.add(b2);*/
    }
    public void aumentodebarra(){
        if(barra.getValue() < 100) {
            barra.setValue(barra.getValue() + (100/Electricista.getAccionesPrincipales().size()));
        }
        if(barra.getValue() >= 100) {
            JOptionPane.showMessageDialog(m, "Tareas completadas");
        }
    }

}