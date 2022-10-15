import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class DownloadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URL to download?");

        String urlString = sc.nextLine();

        Downloader down = null; // create a downloader

        while (down == null) { // re-prompt the user if this fails
            try {
                down = new Downloader(urlString);
            } catch (MalformedURLException e) {
                System.out.println("Bad URL! Try again");
                urlString = sc.nextLine();
            }
        }

        System.out.println("Target file name: ");
        String targetFileName = sc.nextLine();

        try { // download bytes to file (print error if it fails)
            down.download(targetFileName);
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }

    }
}
