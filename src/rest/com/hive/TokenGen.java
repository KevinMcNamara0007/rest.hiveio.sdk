package rest.com.hive;
/**
 *  *   Copyright (c) 2018, HiveIO Inc and/or its affiliates. All rights reserved.
 *      HiveIO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *      HiveIO Java SDK
 *      Version 1.0
 *      Please see attached README File to reference REST Interface Maps
 *      See attached Example file as usage reference
 *
 *
 *      Developed by: Kevin McNamara
 *      Date: Feb 5, 2018
 *
 */
import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import org.json.*;


class TokenGen {
    private static String token0 = "-1";
    //private static final String userpass = "/api/auth?username="+ Globals._LOGIN +"&password="+ Globals._PWD +"&realm=local";
    private static final String auth = "{\"username\":\""+Globals._LOGIN+"\",\"password\":\""+Globals._PWD+"\",\"realm\":\"local\"}";


    public String challenge(String hostname) {
        try {
            URL url = new URL("https://"+hostname+"/api/auth");
            //System.out.println("https://"+hostname+"/api/auth");

            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                // CURLOPT_POST
                urlConnection.setRequestMethod("POST");
                urlConnection.setRequestProperty("Content-Type", "application/json");

                urlConnection.setDoOutput(true);
                OutputStreamWriter writer = new OutputStreamWriter(urlConnection.getOutputStream(),"UTF-8");
                writer.write(auth);
                writer.close();

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
                String data = reader.readLine();

                JSONObject obj = new JSONObject(data);
                token0 = (String)obj.get("token");

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
        return token0;
    }


}