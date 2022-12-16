package ClaseString;

public class EjemploInmutable {
    public static void main(String[] args) {

        String saludo = "Hola";
        String despedida = "Adiós!";
        String nombre = "Pablo";

        String frase = saludo + ", soy " + nombre + ", "+ despedida;
        System.out.println("frase = " + frase);

        String resultado = saludo.transform(s -> {
            return s + ", soy " + nombre;
        });

        System.out.println("saludo = " + saludo);
        System.out.println("resultado = " + resultado);
        
        resultado = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);

        

    }
}
