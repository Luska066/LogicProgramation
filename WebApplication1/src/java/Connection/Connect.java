package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lucas
 */
public class Connect {

    Connection conn;
    PreparedStatement stmt;
    ResultSet rs;

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public void getConnection() {
        try {
            String DRIVER = "com.mysql.cj.jdbc.Driver";
            String URL = "jdbc:mysql://localhost:3306/sika";
            String USER = "root";
            String PASSOWORD = "";

            Class.forName(DRIVER);
            this.conn = DriverManager.getConnection(URL, USER, PASSOWORD);
            System.out.println("Conectando com o DB");
        } catch (Exception ex) {
            System.out.println("Error");
        } finally {
            System.out.println("Connection was Finally");
        }
    }

    public void closeConnnection() throws Exception {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception ex) {
            System.out.println("Finalizando a Conexão" + ex.getMessage());
        }
    }

}
