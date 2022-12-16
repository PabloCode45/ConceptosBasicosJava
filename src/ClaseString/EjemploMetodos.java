package ClaseString;

public class EjemploMetodos {
    public static void main(String[] args) {

        String nombre = "Pablo";

        System.out.println("nombre.length() = " + nombre.length()); //Cuánto mide el String
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase()); //Convertir a mayúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase()); //Convertir a minúsculas
        System.out.println("nombre.equals(\"Pablo\") = " + nombre.equals("Pablo")); //Compararlo con otro String
        System.out.println("nombre.equalsIgnoreCase(\"pablo\") = " + nombre.equalsIgnoreCase("pablo")); //Compararlo con otro String ignorando las mayúsculas
        System.out.println("nombre.compareTo(\"Pablo\") = " + nombre.compareTo("Pablo")); //Comparar con otro String de forma Unicode, compara cada carácter y devuelve un int con la diferencia
        System.out.println("nombre.compareTo(\"Pedro\") = " + nombre.compareTo("Pedro"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //Obtiene el carácter en la posición solicitada
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); //Obtiene el último carácter

        System.out.println("nombre.substring(1) = " + nombre.substring(1)); //Hace que el String empiece en el carácter que tu le digas
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); //También puede leerse entre caracteres
        /*
        --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         */


        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", ".")); //Cambia todas las ocurrencias de un carácter
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //Devuelve la primera ocurrencia que encuentre (Devuelve -1 si no existe)
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //Devuelve la última ocurrencia que encuentre
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); //Devuelve true si existe
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); //Devuelve true si empieza así
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); //Devuelve true si termina así
        System.out.println("      trabalenguas     ".trim()); //Recorta los espacios sobrantes
        
    }
}
