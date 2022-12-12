package conceptosmatematicos;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numBinario = 0b11110;
        System.out.println("numBinario = " + numBinario);

        int numOctal = 036;
        System.out.println("numOctal = " + numOctal);

        int numDecimal = 1234;
        System.out.println("numDecimal = " + numDecimal);

        int numHexadecimal = 0x1e;
        System.out.println("numHexadecimal = " + numHexadecimal);


        int numIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero"));

        System.out.println("numIn = " + numIn);
    }
}
