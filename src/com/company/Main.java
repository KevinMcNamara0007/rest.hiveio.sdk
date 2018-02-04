package com.company;


public class Main {

    public static void main(String[] args) {

        /**
        rest_interface.getGuests("i2.hiveio.com:1443");

        rest_interface.getAlerts("i2.hiveio.com:1443");

        rest_interface.getRealms("i2.hiveio.com:1443");
        **/


        TokenGen generator = new TokenGen();
        ssl_w_o_verification_auth a = new ssl_w_o_verification_auth();
        a.challenge(generator.challenge("https://i2.hiveio.com:1443"),"https://i2.hiveio.com:1443","/host/overview","GET");
    }
}
