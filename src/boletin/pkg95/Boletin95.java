

package boletin.pkg95;
import javax.swing.JOptionPane;
/**
 *
 * @author jpatriciodasilva
 */
public class Boletin95 {

    
    public static void main(String[] args) {
    Cadena cad1= new Cadena();
    
    JOptionPane.showMessageDialog(null, cad1.metodoA(Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"))));
    JOptionPane.showMessageDialog(null, cad1.metodoB(Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"))));
    }
    
}
