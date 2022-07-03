package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
public class GetApi {

    String minuteApi = "https://min-api.cryptocompare.com/data/histominute?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD";
    String hourApi = "https://min-api.cryptocompare.com/data/histohour?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD";
    String dayApi = "https://min-api.cryptocompare.com/data/histoday?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD";

    public String histoMinuteApi() {
        String contents = "";
        try {
            URL address = new URL(minuteApi);
            InputStreamReader reader = new InputStreamReader(address.openStream());
            BufferedReader buffer = new BufferedReader(reader);

            String line = "";
            while ((line = buffer.readLine()) != null) {
                if (line.isEmpty()) {
                    break;
                }
                contents += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contents;
    }

    public String histoHourApi() {
        String contents = "";
        try {
            URL address = new URL(hourApi);
            InputStreamReader reader = new InputStreamReader(address.openStream());
            BufferedReader buffer = new BufferedReader(reader);

            String line = "";
            while ((line = buffer.readLine()) != null) {
                if (line.isEmpty()) {
                    break;
                }
                contents += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contents;
    }

    public String histoDayApi() {
        String contents = "";
        try {
            URL address = new URL(dayApi);
            InputStreamReader reader = new InputStreamReader(address.openStream());
            BufferedReader buffer = new BufferedReader(reader);

            String line = "";
            while ((line = buffer.readLine()) != null) {
                if (line.isEmpty()) {
                    break;
                }
                contents += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contents;
    }
}
