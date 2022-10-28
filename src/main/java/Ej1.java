import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ej1 {

    public static void main(String[] args) throws Exception {

        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:" + "./Database/my", "root", "myPassword");
        Statement stmt = con.createStatement();

        String createSql = "DROP TABLE IF EXISTS Figuras;\n" +
                "CREATE TABLE Figuras(ID INT PRIMARY KEY, figura VARCHAR(255), color VARCHAR(50));\n" +
                "INSERT INTO Figuras VALUES(1, 'Circulo', 'rojo');\n" +
                "INSERT INTO Figuras VALUES(2, 'Circulo', 'verde');\n" +
                "INSERT INTO Figuras VALUES(3, 'Cuadrado', 'violeta');\n" +
                "INSERT INTO Figuras VALUES(4, 'Cuadrado', 'rojo');\n" +
                "INSERT INTO Figuras VALUES(5, 'Cuadrado', 'naranja');\n";
        stmt.execute(createSql);

        String sql = "select * from Figuras WHERE color LIKE 'rojo' AND figura LIKE 'Circulo'";
        ResultSet rd = stmt.executeQuery(sql);

        while(rd.next()) {
            System.out.println(rd.getString(2) + " " + rd.getString(3));
        }

        con.close();
    }

}