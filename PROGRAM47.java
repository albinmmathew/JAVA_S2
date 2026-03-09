/*PROGRAM 47 DOWNLOAD A FILE FROM A GIVEN URL
@ALBIN MAMMEN MATHEW
Roll No: 08
Date: 19/01/2026
*/

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class PROGRAM47 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter file URL: ");
            String fileURL = sc.nextLine();
            URL url = new URL(fileURL);
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();

            String fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);
            String saveDir = "D:\\clientdownload\\";

            File dir = new File(saveDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            FileOutputStream out = new FileOutputStream(saveDir + fileName);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            out.close();
            in.close();
            sc.close();

            System.out.println("File downloaded successfully to:");
            System.out.println(saveDir + fileName);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
