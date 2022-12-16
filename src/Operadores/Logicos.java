package Operadores;

public class Logicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // El operador == comprueba que ambas variables sean iguales
        boolean b1 = i == j;
        System.out.println("b1 = " + b1);

        //El operador AND (&&) indica que ambas afirmaciones, derecha e izquierda, deben cumplirse
        boolean b2 = i == j && k > l;
        System.out.println("b2 = " + b2);
        
        //El operador OR (||) indica que una de las afirmaciones debe ser cierta
        //Aqui estamos diciendo: b3 será verdadero si la variable i es igual a j o la variable k es mayor que l
        boolean b3 = i == j || k > l;
        System.out.println("b3 = " + b3);

        //Podemos mezclar los operadores lógicos en caso de que necesitemos revisar varios pasos para
        //Aqui estamos diciendo: b4 será verdadero si la variable i es igual a j y la variable k es mayor que l o la variable m es falsa
        boolean b4 = i == j && k > l || m == false;
        System.out.println("b4 = " + b4);
    }
}
