import java.sql.*;

public class TestDatabase {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/product_db?user=postgres&password=postgres";
        Connection c = DriverManager.getConnection(url);
        Statement s = c.createStatement();
        ResultSet rs =
                s.executeQuery("SELECT * FROM product WHERE id = 1;");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int cost = rs.getInt("cost");
            System.out.println(id + " " + name + " " + cost);
        }
    }
}
