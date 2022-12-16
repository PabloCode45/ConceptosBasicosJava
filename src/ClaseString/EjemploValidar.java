package ClaseString;

public class EjemploValidar {
    public static void main(String[] args) {

        String saludo = null;
        
        boolean esNulo = saludo == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo==false) {
            System.out.println(saludo.toUpperCase());
        }

        // System.out.println("¿Cómo estás? ".concat(saludo)); //Así no funciona

        System.out.println("¿Cómo estás? "+ saludo); //Así si

        if(esNulo) {
            saludo = " "; //"Saludos!"
        }

        boolean esVacio = saludo.length()==0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = saludo.isBlank();
        System.out.println("esVacio2 = " + esVacio2);

        if(!esVacio) {
            System.out.println(saludo.toUpperCase());
            System.out.println(saludo.concat(" Encantado de conocerte!"));
        }

        System.out.println("saludo = " + saludo);
        
    }
}
