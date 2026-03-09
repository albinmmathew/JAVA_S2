/*PROGRAM 51 JOIN QUERY (DEPT/EMP)
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 02/02/2026
*/

import java.sql.*;

public class PROGRAM51 {
    public static void main(String args[]) {
        // Implementation for SQL Join query using JDBC
        try {
            String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
            String user = "albin";
            String password = "albin";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected.." + con);

            Statement stmt = con.createStatement();
            String query = "SELECT e.eno, e.ename, e.esal, d.dname, d.dloc FROM empl e JOIN dept d ON e.dno = d.dno";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("eno\tename\tesal\t\tdname\tdloc");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getFloat(3) + "\t"
                        + rs.getString(4) + "\t\t" + rs.getString(5));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
