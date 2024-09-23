import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {

    public static void main(String[] args) {


        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // connect driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vimu@2164"); // connect database

            Statement statement = connection.createStatement();

            statement.executeUpdate("DELETE  FROM user WHERE name='thimira'");

            connection.close();

        }catch (Exception e) {
            System.out.println(e);
        }


    }

}
