package ClaseString;

public class EjemploExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna_foto.png";
        int i = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(12) = " + archivo.substring(12));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
        
    }
}
