import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    public static void main(String[] args) {


        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // connect driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Vimu@2164"); // connect database

            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("SELECT * FROM user");

            String names;
            String Address;
            while (result.next()) {
                names = result.getString(1);//pooji, pooji, thimira
                Address = result.getString(2);//bandaragama, bandaragama, kaluthara
                System.out.println(names+"  "+Address);
            }

            connection.close();

        }catch (Exception e) {
            System.out.println(e);
        }


    }
}
