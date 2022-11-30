package inventory;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Currency {

    public void currencyRun(int curNo, double money) throws IOException {
        switch (curNo) {
            case 1:
                String cur2 = "CAD";
                URLGet(cur2, money);
                break;
            case 2:
                String cur3 = "GBP";
                URLGet(cur3, money);
                break;
            case 3:
                String cur4 = "EUR";
                URLGet(cur4, money);
                break;
            case 4:
                String cur5 = "TRY";
                URLGet(cur5, money);
                break;
            case 5:
                String cur6 = "AUD";
                URLGet(cur6, money);
                break;
            default:
                System.out.println("The number has to be between 1 and 5!");
        }
    }

    private void URLGet(String cur, double money) throws IOException {
        String URLGet = "https://v6.exchangerate-api.com/v6/ef7eb54b0b1cd92aff9431fe/pair/USD/" + cur + "/"+ money;
        URL urlCur = new URL(URLGet);
        HttpURLConnection connection = (HttpURLConnection) urlCur.openConnection();
        connection.connect();

        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(new InputStreamReader((InputStream) connection.getContent()));
        JsonObject JsObject = element.getAsJsonObject();
        String conversion = JsObject.get("conversion_rate").toString();

        double newAmount = Double.parseDouble(conversion);
        System.out.println("The amount represented in the desired " + cur + " " + (newAmount * money));
        System.out.println("End of the currency convertor");
    }
}
