package com.company;

    public class rest_interface {

        //connect to ssl session with no verification and no authorization
        private static ssl_w_o_verification ssl_noauth = new ssl_w_o_verification();


        //PUBLIC METHODS NO AUTH
            //rest interface to get guest inventory from local appliance
            public static String getGuests(String hostname){
                return ssl_noauth.query(hostname,"guests");
            }

            //rest interface to get alerts from local appliance
            public static String getAlerts(String hostname){
                return ssl_noauth.query(hostname,"alerts");
            }

            //rest interface to get realms from local appliance
            public static String getRealms(String hostname){
                return ssl_noauth.query(hostname,"realms");
            }



    }