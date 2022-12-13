package ClaseString;

public class EjemploString {
    public static void main(String[] args) {

        //Esto crea la instancia implícita al nuevo objeto String
        //Esto ahorra el tener que escribir new String();
        String saludo = "Hola";

        //Pero también se puede instanciar el objeto de forma clásica
        String saludo2 = new String("Hola");

        //Estos dos objetos no son iguales, son 2 instancias distintas
        //Esto dará false porque compara igualdad absoluta
        boolean sonIguales = saludo==saludo2;
        System.out.println("sonIguales = " + sonIguales);
        
        //Esto dará true porque compara el contenido
        sonIguales = saludo.equals(saludo2);
        System.out.println("sonIguales = " + sonIguales);




    }
}
