package bol7.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Comparacion {
    public float pedirNumero (){
        return (Float.parseFloat(JOptionPane.showInputDialog("Introduce numero")));
    }
    public void compara (float num1){
        if (num1>0)
            System.out.println("+");
        else if (num1<0)
            System.out.print ("-");
        else 
            System.out.println("0");
    }
}
