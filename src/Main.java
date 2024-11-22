import org.w3c.dom.ranges.Range;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String cadena;
        int numero;
        char letra;
        double decimal;
        float flotante;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        //Integer es una clase
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
                                                                //guarda un caracter
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal =Double.parseDouble(JOptionPane.showInputDialog("digite un numero decimal: "));
        flotante = Float.parseFloat(JOptionPane.showInputDialog("digite un numero flotante: "));

        JOptionPane.showMessageDialog(null,"la cadena es:" + cadena);
        JOptionPane.showMessageDialog(null,"El numero es: " + numero);
        JOptionPane.showMessageDialog(null,"El caracter es: " + letra);
        JOptionPane.showMessageDialog(null,"el decimal es: " + flotante);
    }
}