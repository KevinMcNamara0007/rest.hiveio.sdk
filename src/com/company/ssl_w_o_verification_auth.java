package com.company;

import org.json.JSONObject;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


public class ssl_w_o_verification_auth {

    public static String data =null;
    //public static String token0 = "-1";
    public static String preamble = "Authorization:Bearer=";
    public static String userpass = "/api/";
    public static String complete = "";


    public String challenge(String token, String hostname, String rest_interface, String method) {
        complete = hostname+userpass+rest_interface+"?"+preamble+token;

        System.out.println(complete);

        try {
            URL url = new URL(complete);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                if(method.contains("POST")) {
                    // CURLOPT_POST
                    urlConnection.setRequestMethod("POST");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                }

                urlConnection.setRequestProperty("Content-Type", "application/json");
                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));

                data = reader.readLine();

                //JSONObject obj = new JSONObject(data);
                //token0 = (String)obj.get("token");

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
        return data;
    }

}