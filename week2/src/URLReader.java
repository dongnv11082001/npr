import java.net.* ;
import java.io.* ;
public class URLReader {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://hanu.vn") ;
        BufferedReader br = new BufferedReader (new InputStreamReader(url.openStream())) ;
        String line ;
        while ((line=br.readLine())!=null)
            System.out.println(line) ;
        br.close() ;
    }
}
