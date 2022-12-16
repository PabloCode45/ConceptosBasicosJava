package Operadores;

public class Unarios {
    public static void main(String[] args) {

        int i = -5;
        int j = +i; // j = (1)*i => -5; Al añadirle un más o un menos a la variable i, la estamos multiplicando por 1 o -1;
        System.out.println("j = " + j); //Esto dará negativo porque menos por más es igual a menos

        int k = -i;
        System.out.println("k = " + k); //Esto dará positivo porque menos por menos da más

        i = 6;
        j = +i;
        System.out.println("j = " + j); //Más por más igual a más

        k = -i;
        System.out.println("k = " + k); //Más por menos igual a menos




    }
}
