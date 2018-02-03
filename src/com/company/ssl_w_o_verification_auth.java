package com.company;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.DataOutputStream;


public class ssl_w_o_verification_auth {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void start() throws Exception {
        ssl_w_o_verification_auth http = new ssl_w_o_verification_auth();
        System.out.println("\nTesting  - Send Http POST request");
        http.sendPost();
    }

    // HTTP POST request
    private void sendPost() throws Exception {

        String url = "https://i2.hiveio.com:1443/api/auth";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        //String urlParameters = "ctl00$OnlineContent$ddlInput=R&ctl00$OnlineContent$txtInput=AP31BF2942";
        String urlParameters = "{admin, admin,  realm: 'local'}";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }

}