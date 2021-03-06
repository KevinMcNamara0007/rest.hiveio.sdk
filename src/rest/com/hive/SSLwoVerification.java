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


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

//SSL Connector with no verification
class SSLwoVerification {


    private String data =null;
    private static JsonMapperMakePretty mp = new JsonMapperMakePretty();
    private static String call = "";

    public String query(String hostname,String rest_interface, String focus) {

        try {
            if(focus.contains("running")){
                call = "https://" + hostname + "/api/" + rest_interface+"?q=gueststate:-destroyed";
            } else if(focus.contains("assigned")){
                call = "https://" + hostname + "/api/" + rest_interface +"?q=username:-^null$";
            } else {
                call = "https://" + hostname + "/api/" + rest_interface;
            }

            System.out.println(call);

            URL url = new URL(call);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
                urlConnection.setRequestProperty("Content-Type", "application/json");

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
                //System.out.println(reader.readLine());

                data = reader.readLine();

                System.out.println(mp.parseData(data));

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