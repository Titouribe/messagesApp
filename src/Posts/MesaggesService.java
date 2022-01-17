package Posts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MesaggesService {

    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plis write your post: ");
        String postMessage = sc.nextLine();

        System.out.println("Plis enter your name: ");
        String name = sc.nextLine();

        Posts post = new Posts();
        post.setPost(postMessage);
        post.setPost_author(name);

        MessagesDAO.createMessageDB(post);
    }

    public static void listMessage(){

    }

    public static void deleteMessage(){

    }

    public static void editMessage(){

    }

}
