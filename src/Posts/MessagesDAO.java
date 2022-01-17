package Posts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessagesDAO {

    public static void createMessageDB(Posts post){
        ConnectionObject dbConnect = new ConnectionObject();

        try (Connection cn = dbConnect.get_connection()){

            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO posts ( post, post_author) VALUES (?,?)";
                ps = cn.prepareStatement(query);
                ps.setString(1, post.getPost());
                ps.setString(2, post.getPost_author());
                ps.executeUpdate();
                System.out.println("Successful post creation.");
            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void readMessageDB(){

    }

    public static void delMessageDB(int post_id){

    }

    public static void editMessageDB(Posts post){

    }

}
