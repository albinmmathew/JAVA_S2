/*PROGRAM 49 INSERT VALUES INTO A TABLE
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 31/01/2026
*/

import java.sql.*;

public class PROGRAM49 {
    public static void main(String args[]) {
        try {
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
            String user = "albin";
            String password = "albin";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected.." + con);
            PreparedStatement ps = con.prepareStatement("INSERT INTO emp (eno, ename, esal) VALUES(?, ?, ?)");
            ps.setInt(1, 101);
            ps.setString(2, "Albin");
            ps.setFloat(3, 50000.0f);
            ps.executeUpdate();
            System.out.println("Data inserted successfully.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
