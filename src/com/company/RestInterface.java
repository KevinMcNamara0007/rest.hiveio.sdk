package com.company;

    public class RestInterface {

        //Token Generator
        private static TokenGen tok = new TokenGen();

        //connect to ssl session with no verification and no authorization
        private static SSLwoVerification ssl_noauth = new SSLwoVerification();

        //connect to ssl session with no verification and no authorization
        private static SSLwoVerificationAuth ssl_auth = new SSLwoVerificationAuth();


        /*******************************REST INTERFACE METHODS********************************/

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

        /********************************PUBLIC METHODS AUTH************************************/
        //rest interface to get host overview from local appliance
        public static String getHostOverview(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/host/overview","GET");
        }

        //rest interface to get host statistics from local appliance
        public static String getHostStatistics(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/host/statistics","GET");
        }

        //rest interface to get auth me from local appliance
        public static String getAuthMe(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/auth/me","GET");
        }

        //rest interface to get broker assignments from local appliance
        public static String getBrokerAssignments(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/broker/assignments","GET");
        }

        //rest interface to get bus from local appliance
        public static String getBus(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/bus","GET");
        }

        //rest interface to get bus exchange from local appliance
        public static String getBusExchange(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/bus/exchange","GET");
        }

        //rest interface to get bus queue from local appliance
        public static String getBusQueue(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/bus/queue","GET");
        }

        //rest interface to get host cluster status from local appliance
        public static String getHostClusterStatus(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/host/cluster/status","GET");
        }

        //rest interface to get host cluster members from local appliance
        public static String getHostClusterMembers(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/host/cluster/members","GET");
        }

    }