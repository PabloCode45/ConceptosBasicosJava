package Operadores;

public class Relacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j; //Esto dará falso siempre
        System.out.println("b1 = " + b1);
        //Con los primitivos se usa el == y con los objetos como Integer, el .equals;

        boolean b2 = !b1; //La exclamación invertida invierte el valor de la variable que tenga a la derecha
        System.out.println("b2 = " + b2);

        boolean b3 = i != j; //En este caso, está negando el igual, por la tanto, el valor de b3 deberá ser verdadero si i es diferente a j
        System.out.println("b3 = " + b3);

        boolean b4 = m == true; //De nuevo, dará falso porque m es falso
        System.out.println("b4 = " + b4);

        boolean b5 = m != true; //Aquí dara verdadero porque dice que si m no es verdadero entonces b5 será verdadero
        System.out.println("b5 = " + b5);

        boolean b6 = i > j; //Si i es mayor que j, b6 será verdadero
        System.out.println("b6 = " + b6);

        boolean b7 = i < j; //Si i es menor que j, b7 será verdadero
        System.out.println("b7 = " + b7);

        boolean b8 = l >= k; //Mayor o igual
        System.out.println("b8 = " + b8);
        //El igual debe ir a la derecha siempre
        boolean b9 = l <= k; //Menor o igual
        System.out.println("b9 = " + b9);


    }
}
