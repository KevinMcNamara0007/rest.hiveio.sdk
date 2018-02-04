package com.company;


import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import org.json.*;

public class TokenGen {


    public static String data =null;
    public static String token0 = "-1";
    public static String userpass = "/api/auth?username=admin&password=admin&realm=local";


    public String challenge(String hostname) {
        try {
            URL url = new URL(hostname+userpass);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                // CURLOPT_POST
                urlConnection.setRequestMethod("POST");
                urlConnection.setRequestProperty("Content-Type", "application/json");
                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
                //System.out.println(reader.readLine());

                data = reader.readLine();

                JSONObject obj = new JSONObject(data);
                token0 = (String)obj.get("token");

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);
            } finally {
                if (inStream != null) {
                    inStream.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return token0;
    }


}