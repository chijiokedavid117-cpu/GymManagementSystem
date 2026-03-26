import java.sql.*;
public class GymData
{
  public static void main(String[] args)
  {

        try 
        {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gymdb",
                "root",
                "Doc242007"
            );

            System.out.println("Connected!");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Member");

            while (rs.next())
            {
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
