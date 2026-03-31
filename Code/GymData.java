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
                System.out.println("Name:" + rs.getString("name"));
            }
            stmt.executeUpdate("UPDATE Member SET age = 22 WHERE member_id = 101")
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
