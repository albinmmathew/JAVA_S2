/*PROGRAM 53 TRANSACTION AND BATCH PROCESSING
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 02/02/2026
*/

import java.sql.*;

public class PROGRAM53 {
    public static void main(String args[]) {
        // Implementation for JDBC Transaction and Batch Processing
        try {
            String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
            String user = "albin";
            String password = "albin";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected.." + con);

            con.setAutoCommit(false);
            Statement stmt = con.createStatement();
            // batch
            stmt.addBatch("INSERT INTO empl VALUES(102, 'afsd', 45000, 20)");
            stmt.addBatch("INSERT INTO empl VALUES(103, 'qwer', 55000, 10)");
            stmt.executeBatch();

            stmt.executeUpdate("insert into empl values(108,'vimal',45000,20)");
            con.commit();
            System.out.println("Batch transaction committed successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
