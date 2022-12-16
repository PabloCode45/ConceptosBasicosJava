package Operadores;

import javax.swing.*;

public class Aritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j); //Así concatena, no suma

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j)); //La resta sin los paréntesis aquí no es posible

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div = i / j;
        System.out.println("div = " + div); //No da decimales, el int es inexacto cuando hablamos de divisiones

        float div2 = (float) i / j;
        System.out.println("div2 = " + div2); //Divide de forma correcta sin problemas al ser un float

        int resto = i % j;
        System.out.println("resto = " + resto);

        float resto2 = (float) i % 9;
        System.out.println("resto2 = " + resto2);


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un número")); //Abre un panel para introducir texto

        if(numero % 2 == 0) { //Este if else te dirá por pantalla si tu variable es par o impar
            System.out.println("Número par = " + numero);
        }else{
            System.out.println("Número impar = " + numero);
        }


    }
}
