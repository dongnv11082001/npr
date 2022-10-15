import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.TreeMap;

public class TallyDownloader extends Downloader {
    public TallyDownloader(String url) throws MalformedURLException {
        super(url); // call Downloader constructor
    }

    // Reads from URL and prints file contents and tally of each char
    public void download(String targetFileName) throws IOException {
        super.download(targetFileName);

        Map<Character, Integer> counts = new TreeMap<>();
        FileInputStream in = new FileInputStream(targetFileName);

        while (true) {
            int n = in.read();
            if (n == -1) {
                break;
            }

            char ch = (char) n;
            if (counts.containsKey(ch)) {
                counts.put(ch, counts.get(ch) + 1);
            } else {
                counts.put(ch, 1);
            }
            System.out.println(ch);
        }
        in.close();
        System.out.println(counts); // print map of char --> int
    }
}
