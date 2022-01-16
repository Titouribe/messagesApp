package Posts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObject {

    public Connection get_connection(){

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/messageapp","root","");
            if(connection != null){
                System.out.println("Successful Connection");
            }
        } catch (SQLException e){
            System.out.println("Connection Error");
        }
        return connection;
    }

}
