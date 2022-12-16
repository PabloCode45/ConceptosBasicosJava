package ClaseString;

public class EjemploMetodosArray {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arrayChar = trabalenguas.toCharArray();
        int medida = arrayChar.length;
        for (int i = medida-1; i >=0 ;i--) {
            System.out.println("arrayChar["+i+"] = " + arrayChar[i]);
        }

        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        
    }
}
