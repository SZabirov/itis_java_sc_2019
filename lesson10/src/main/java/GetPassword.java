import java.sql.*;
import java.util.Scanner;

public class GetPassword {
    public static void main(String[] args) throws SQLException {
        System.out.println("Введите имя пользователя:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        String url = "jdbc:postgresql://localhost/product_db?user=postgres&password=postgres";
        Connection c = DriverManager.getConnection(url);
        Statement s = c.createStatement();
        String query = "SELECT password from \"user\" " +
                " WHERE username = '" + username + "'";
        ResultSet rs = s.executeQuery(query);
        boolean notEmpty = rs.next();
        if (notEmpty) {
            System.out.println(rs.getString("password"));
        } else {
            System.out.println("Такого юзера нет");
        }
    }
}
