import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDatabase {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/product_db?user=postgres&password=postgres";
        Connection c = DriverManager.getConnection(url);
        Statement s = c.createStatement();

    }
}
