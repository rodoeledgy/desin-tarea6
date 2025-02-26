package desin.tarea_t5.model;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
	
    public Ventana() {
        setTitle("Nada de esto es real");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Despierta estas en un coma", SwingConstants.CENTER);
        add(label);
    }
}
