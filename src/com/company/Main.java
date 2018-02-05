package com.company;


public class Main {

    public static void main(String[] args) {
/****************************test rest_interfaces***************************************************************************/
        //test public interfaces
        //RestInterface.getGuests("i2.hiveio.com:1443");

        //RestInterface.getAlerts("i2.hiveio.com:1443");

        //RestInterface.getRealms("i2.hiveio.com:1443");


        //test private interfaces
        RestInterface.getHostOverview("i2.hiveio.com:1443");

        RestInterface.getHostStatistics("i2.hiveio.com:1443");

        RestInterface.getAuthMe("i2.hiveio.com:1443");

        //RestInterface.getBrokerAssignments("i2.hiveio.com:1443");

        RestInterface.getBus("i2.hiveio.com:1443");

        RestInterface.getBusExchange("i2.hiveio.com:1443");

        RestInterface.getBusQueue("i2.hiveio.com:1443");

        RestInterface.getHostClusterStatus("i2.hiveio.com:1443");

        RestInterface.getHostClusterMembers("i2.hiveio.com:1443");
    }
}
