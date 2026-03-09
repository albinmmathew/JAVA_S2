/*PROGRAM 52 CALLABLE AND PREPARED STATEMENTS
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 02/02/2026
*/

import java.sql.*;

public class PROGRAM52 {
    public static void main(String args[]) {
        try {
            String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
            String user = "albin";
            String password = "albin";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected.." + con);

            PreparedStatement ps = con.prepareStatement("UPDATE empl SET esal=? WHERE eno=?");
            ps.setDouble(1, 60000);
            ps.setInt(2, 1);
            int count = ps.executeUpdate();
            System.out.println(count + " record updated using PreparedStatement.");

            CallableStatement cs = con.prepareCall("{call get_emp_name(?, ?)}");
            cs.setInt(1, 1);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.execute();
            System.out.println("Employee Name: " + cs.getString(2));

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
