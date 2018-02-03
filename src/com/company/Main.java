package com.company;


public class Main {

    public static void main(String[] args) {
        //ssl_w_o_verification h = new ssl_w_o_verification();
        //h.query("i2.hiveio.com:1443","guests");

        rest_interface.getGuests("i2.hiveio.com:1443");

        rest_interface.getAlerts("i2.hiveio.com:1443");

        rest_interface.getRealms("i2.hiveio.com:1443");

        /**try {
            ssl_w_o_verification_auth a = new ssl_w_o_verification_auth();
            a.start();
        } catch(Exception e){
            e.printStackTrace();
        }
         **/
    }
}
