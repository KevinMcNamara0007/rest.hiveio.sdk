package rest.com.hive;

    public class RestInterface {

        //Token Generator
        private static TokenGen tok = new TokenGen();

        //connect to ssl session with no verification and no authorization
        private static SSLwoVerification ssl_noauth = new SSLwoVerification();

        //connect to ssl session with no verification and no authorization
        private static SSLwoVerificationAuth ssl_auth = new SSLwoVerificationAuth();


        /*******************************Public REST Passive METHODS No Auth********************************/

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

        /********************************Public Passive METHODS AUTH************************************/
        //rest interface to get hosts from local appliance
        public static String getHosts(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/hosts","GET");
        }
        //rest interface to get host overview from local appliance
        public static String getHostOverview(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/host/overview","GET");
        }

        //rest interface to get host storage types from local appliance
        public static String getHostsStorageTypes(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/hosts/storage/types","GET");
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
        public static String getBrokerAssignments(String hostname, String username){
            return ssl_auth.challengeUser(tok.challenge(hostname),hostname,username,"/broker/assignments","GET");
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

        //rest interface to get network profiles from local appliance
        public static String getNetworkProfiles(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/profiles","GET");
        }

        //rest interface to get pools from local appliance
        public static String getPools(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/pools","GET");
        }

        //rest interface to get storage pools from local appliance
        public static String getStoragePools(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/storage/pools","GET");
        }

        //rest interface to get storage pools info from local appliance
        public static String getStoragePoolsInfo(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/storage/pools/info","GET");
        }

        //rest interface to get templates info from local appliance
        public static String getTemplates(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/templates","GET");
        }

        //rest interface to get users info from local appliance
        public static String getUsers(String hostname){
            return ssl_auth.challenge(tok.challenge(hostname),hostname,"/users","GET");
        }

        //rest interface to get Fabric Metrics from local appliance
        public static String getMetricsFabric(String hostname, String id){
            return ssl_auth.challengeID(tok.challenge(hostname),hostname,id,"metrics/fabric","GET");
        }

        //rest interface to get Fabric Metrics Memory from local appliance
        public static String getMetricsFabricMemory(String hostname, String id){
            return ssl_auth.challengeID(tok.challenge(hostname),hostname,id,"/memory","GET");
        }

        //rest interface to get Fabric Metrics CPU from local appliance
        public static String getMetricsFabricCPU(String hostname, String id){
            return ssl_auth.challengeID(tok.challenge(hostname),hostname,id,"/cpu","GET");
        }

        //rest interface to get Fabric Metrics Storage from local appliance
        public static String getMetricsFabricStorage(String hostname, String id){
            return ssl_auth.challengeID(tok.challenge(hostname),hostname,id,"/storage","GET");
        }

        //rest interface to get Fabric Metrics Sensors from local appliance
        public static String getMetricsFabricSensors(String hostname, String id){
            return ssl_auth.challengeID(tok.challenge(hostname),hostname,id,"/sensors","GET");
        }

        //rest interface to post guest reset from local appliance
        public static String postGuestReset(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/reset","POST");
        }

        //rest interface to post guest poweroff from local appliance
        public static String postGuestPowerOff(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/poweroff","POST");
        }

        //rest interface to post guest suspend from local appliance
        public static String postGuestSuspend(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/suspend","POST");
        }

        //rest interface to post guest resume from local appliance
        public static String postGuestResume(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/resume","POST");
         }

        //rest interface to post guest poweron from local appliance
        public static String postGuestPowerOn(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/poweron","POST");
        }

        //rest interface to post guest undefine from local appliance
        public static String postGuestUndefine(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/undefine","POST");
        }

        //rest interface to post guest reboot from local appliance
        public static String postGuestReboot(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/reboot","POST");
        }

        //rest interface to post guest shutdown from local appliance
        public static String postGuestShutdown(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/shutdown","POST");
        }

        //rest interface to post guest message from local appliance
        public static String postGuestMessage(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/message","POST");
        }

        //rest interface to post guest delete from local appliance
        public static String postGuestDelete(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/delete","POST");
        }

        //rest interface to post guest migrate from local appliance
        public static String postGuestMigrate(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/migrate","POST");
        }

        //rest interface to post guest publish from local appliance
        public static String postGuestPublish(String hostname, String guest){
            return ssl_auth.challengeGuest(tok.challenge(hostname),hostname,guest,"/publish","POST");
        }
    }