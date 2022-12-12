package conceptosbasicos;

public class Primitivos {
    public static void main(String[] args) {
        /*
        Tipos primitivos:

        boolean (Verdadero o falso)
        char (Carácter UNICODE)
        byte (Número entero entre -128 a 127)
        short (Número entero entre -32768 a 32767)
        int (Número entero entre -2147483648 a 2147483647)
        long (Número entero entre -9223372036854775808 a 9223372036854775807)
        float (Número flotante precisión simple)
        doble (Número flotante precisión doble)

         */
        boolean a = true;
        boolean b = false;

        char c = 'a';
        char d = 1;
        char e = '\u0021';

        byte f = 126;
        short g = 32766;
        int h = 2147483646;
        //La 'L' al final es para indicarle que es un número "long".
        long i = 9223372036854775806L;

        //La 'f' y la 'd' es para indicar que son números "float" o "double"
        //Si escribimos un número float o double y ponemos "e" seguido de un número le estamos dando el exponente
        float j = 3.14e2f; //Este número es 314 (la coma se mueve 2 veces a la derecha)
        double k = 4.70e-2d; //Este número es 0.047 (la coma se mueve 2 veces a la izquierda)

    }
}
