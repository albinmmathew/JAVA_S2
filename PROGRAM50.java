/*PROGRAM 50 LOGIN CHECK
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 31/01/2026
*/

import java.sql.*;
import java.util.*;

public class PROGRAM50 {
    public static void main(String args[]) {
        try {
            String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
            String user = "albin";
            String password = "albin";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected.." + con);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Username: ");
            String uname = sc.nextLine();
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE username=? AND password=?");
            ps.setString(1, uname);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                System.out.println("Login Successful");
            else
                System.out.println("Login Failed");
            con.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
