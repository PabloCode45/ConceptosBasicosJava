package Operadores;

public class IncrementalesDecrementales {
    public static void main(String[] args) {

        //Pre incremento
        System.out.println("Pre incremento");
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i;

        System.out.println("j = " + j);
        System.out.println("i = " + i);
        System.out.println();



        //Post incremento
        System.out.println("Post incremento");
        i = 1;
        System.out.println("i = " + i);
        j = i++; //Esto es lo único que cambia, si está delante o detrás

        System.out.println("j = " + j);
        System.out.println("i = " + i);
        System.out.println();



        //Pre decremento
        System.out.println("Pre decremento");
        i = 1;
        System.out.println("i = " + i);
        j = --i;

        System.out.println("j = " + j);
        System.out.println("i = " + i);
        System.out.println();



        //Post decremento
        System.out.println("Post decremento");
        i = 1;
        System.out.println("i = " + i);
        j = i--;

        System.out.println("j = " + j);
        System.out.println("i = " + i);
    }
}
