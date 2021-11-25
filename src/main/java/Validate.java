import java.sql.*;

public class Validate {
    public static boolean checkUser(String email,String pass)
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            //Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_db","root","andreidombi");
            PreparedStatement ps = con.prepareStatement("select * from users where email=? and password=?");
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;
    }
    /*
    public static void main(String[] arg)
    {
        System.out.println(checkUser("andreidombi99@gmail.com","12345678"));
    }
    */

}


/*
String jdbcURL = "jdbc:mysql://localhost:3306/users";
String usename = "root";
String pass = "asd2000dsa22";
Connection connection = DriverManager.getConnection(jdbcURL, usename, pass);
*/
