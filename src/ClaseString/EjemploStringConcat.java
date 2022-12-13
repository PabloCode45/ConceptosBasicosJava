package ClaseString;

public class EjemploStringConcat {
    public static void main(String[] args) {

        String saludo = "Hola";
        String despedida = "Adiós!";
        String nombre = "Pablo";

        String frase = saludo + ", soy " + nombre + ", "+ despedida;
        System.out.println(frase);

        System.out.println(saludo.concat(", soy ".concat(nombre).concat(", ").concat(despedida)));


    }
}
