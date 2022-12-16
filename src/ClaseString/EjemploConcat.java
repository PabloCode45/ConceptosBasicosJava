package ClaseString;

public class EjemploConcat {
    public static void main(String[] args) {

        String saludo = "Hola";
        String despedida = "Adiós!";
        String nombre = "Pablo";

        String frase = saludo + ", soy " + nombre + ", "+ despedida;
        System.out.println(frase);

        System.out.println(saludo.concat(", soy ".concat(nombre.concat(", ".concat(despedida)))));

        int numeroA = 10;
        int numeroB = 5;

        //De esta forma, con los paréntesis se suman los números de forma matemática
        System.out.println(frase + (numeroA + numeroB));

        //De esta forma los números se concatenan como si fuesen texto, uno detrás de otro
        System.out.println(frase + numeroA + numeroB);

    }
}
