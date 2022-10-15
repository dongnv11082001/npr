import java.io.*;

public class OutputStreamExample2 {
    public static void main(String[] args) {

        try {
            File dir = new File("./Test");
            dir.mkdir();

            OutputStream os = new FileOutputStream("(\"./Test/test_writerOutputStream.txt");
            byte[] by = new byte[]{'H', 'e', 'l', 'l', 'o', ' ', 31, 34, 92, 10};
            //10 = "\n" new line , 31 = control code chart , 34 = """ , 92 = "\"

            byte[] by2 = new byte[]{'H', 'e', 'l', 'l', 'o', ' ', 'b', 'o', 'y'};
            os.write(by);

            os.flush();

            os.write(by2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
