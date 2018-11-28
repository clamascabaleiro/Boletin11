package boletin11_1;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Tiempo {
    
    //Constructores

    public Tiempo() {
    }
    
    //Metodos
    
    public void Timer() {
        long inicio, fin, total;
        inicio = System.currentTimeMillis();
        JOptionPane.showInputDialog(null, "Escriba la siguiente frase" + "\n La documentación es todo aquel conjunto de manuales impresos o en formato digital que explique una aplicación informática.");
        fin = System.currentTimeMillis();
        total = fin - inicio;
        JOptionPane.showMessageDialog(null, "Tardastes " + (total / 1000) + " segundos " + " en escribir la frase");
    }
}
