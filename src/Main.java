import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PriceFetcher fetchHype = new PriceFetcher("https://api.coingecko.com/api/v3/coins/hyperliquid");
        System.out.println(fetchHype);
    }
}
