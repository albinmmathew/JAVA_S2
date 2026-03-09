import java.io.*;
import java.net.*;

public class PROGRAM43_CLIENT {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("localhost", 1234);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter filename to upload from clientfile/: ");
            String filename = br.readLine();
            File file = new File("clientfile/" + filename);

            if (file.exists()) {
                dout.writeUTF(filename);
                BufferedReader fr = new BufferedReader(new FileReader(file));
                String line;
                while ((line = fr.readLine()) != null) {
                    dout.writeUTF(line);
                }
                fr.close();
                System.out.println("File content sent.");
            } else {
                System.out.println("File not found in clientfile/");
            }
            dout.writeUTF("EOF");
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
