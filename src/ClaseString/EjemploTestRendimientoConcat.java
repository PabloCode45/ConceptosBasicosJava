package ClaseString;

public class EjemploTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        //StringBuilder es mutable
        StringBuilder sb = new StringBuilder(a);

        //Esto devuelve el momento actual
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000;i++){
            // c = c.concat(a).concat(b).concat("\n"); // Esto ha tardado entre 1 y 2 milisegundos a (500) vueltas y 27 milisegundos a (5.000) vueltas y 6702 milisegundos a (100.000) vueltas

            // c+=a+b+"\n"; //Esto en cambio ha tardado 9 milisegundos a (500) vueltas y 22 milisegundos a (5.000) vueltas y 2413 milisegundos a (100.000) vueltas

            // sb.append(a).append(b).append("\n"); //Increíblemente, esto tarda 0 milisegundos a (500) vueltas y 1 milisegundo a (5.000) vueltas y 7 milisegundos a (100.000) vueltas
        }
        /*

        El ganador indiscutible es StringBuilder, con 7 milisegundos en 100.000 vueltas

         */

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
