package Operadores;

public class Asignacion {
    public static void main(String[] args) {
        int i = 5, j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2; //Esto es la forma más rápida de escribir i = i + 2;
        System.out.println("i = " + i);

        i += 5; //Y lo mismo con el resto de operadores
        System.out.println("i = " + i);

        i -= 4;
        System.out.println("i = " + i);

        j *= 3;
        System.out.println("j = " + j);

        String sql = "select * from clientes as c"; //Los operadores de asignación se pueden usar para muchas cosas, por ejemplo tener una consulta base y concatenar más consultas a este
        sql += " where c.nombre ='Andres' ";
        sql += " and c.activo=1";

        System.out.println("sql = " + sql);

    }
}
