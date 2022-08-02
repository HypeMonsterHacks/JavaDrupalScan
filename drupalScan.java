import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class app {
    static String DOMAIN = "https://drupalsitegoeshere.com";
    static int RANGE = 500;
    public static void liveNodes(String domain) throws IOException {
        for(int i=0; i<RANGE+1; i++){
            URL url = new URL(domain.concat("/node/")+i);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.connect();
            if(connection.getResponseCode()==200){
                System.out.println(url);
            }
            connection.disconnect();
        }
    }
    public static void main(String[] args) throws IOException {
        liveNodes(DOMAIN);
    }
}