import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PriceFetcher {
    private double price;
    private String urlAccessString;
    private String contractAddress;

    public PriceFetcher(String urlAccessString) throws IOException {
        this.urlAccessString = urlAccessString;
        URL url = new URL(this.urlAccessString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        System.out.println(connection);
        InputStream urlData = connection.getInputStream();
        String contentType = connection.getContentType();
        System.out.println(contentType);
        System.out.println("Stream opened with content-type: " + contentType);
//
        System.out.println("Fetching content from " + urlAccessString + " ...");
        BufferedReader in;
        in = new BufferedReader(new InputStreamReader(urlData));

        while (true) {
            String line = in.readLine();
                System.out.println(line);
//            System.out.println(contractAddress);
            if (line == null)
                break;
//            System.out.println(line);
        }
        in.close();

    }

    public double getPrice() {
        return price;
    }
}
