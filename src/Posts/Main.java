package Posts;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("--------------");
            System.out.println("Messages App Menu");
            System.out.println("1. Create Message");
            System.out.println("2. List Messages");
            System.out.println("3. Edit Message");
            System.out.println("4. Delete Message");
            System.out.println("5. Leave Menu");

            option = sc.nextInt();

        }while (option != 5);

    }
}
