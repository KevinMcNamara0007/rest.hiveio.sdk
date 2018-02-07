package rest.com.hive;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

//SSL Connector with no verification
class SSLwoVerification {


    private String data =null;

    public String query(String hostname,String rest_interface) {
        try {
            URL url = new URL("https://" + hostname + "/api/" + rest_interface);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
                urlConnection.setRequestProperty("Content-Type", "application/json");

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
                System.out.println(reader.readLine());
                data = reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
                //System.out.println(e);
            } finally {
                if (inStream != null) {
                    inStream.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println(e);
        }
        return data;
    }

}