package conceptosbasicos;

import java.util.Scanner;

public class Escaners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre por pantalla");
        String nombre = sc.nextLine();

        System.out.println("Su nombre es = "+ nombre);
    }
}
