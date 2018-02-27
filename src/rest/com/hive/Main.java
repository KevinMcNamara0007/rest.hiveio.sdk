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

class Main {
    //private static final Globals g = new Globals();

    private static final String host = Globals._HOST;

    private static final String hostid = Globals._HOSTID;

    private static String guest = Globals._GUEST;

    private static String certificate = Globals._CERT;

    private static TokenGen t = new TokenGen();

    //private static String profileid = Globals._PROFILEID;


    public static void main(String[] args) {
/****************************    test passive_rest_interfaces    ***************************************************************************/
        //test public interfaces

        //test Token
        //System.out.println(t.challenge(Globals._HOST));

        //RestInterface.getGuests(host,"running");

        //RestInterface.getGuests(host,"assigned");

        //RestInterface.getAlerts(host);

        //RestInterface.getRealms(host);

        //RestInterface.getHosts(host);

        //RestInterface.getHostOverview(host);

        //RestInterface.getHostStatistics(host);

        //RestInterface.getAuthMe(host);

        //RestInterface.getBrokerAssignments(host,"kevin");

        //RestInterface.getBus(host);

        //RestInterface.getBusExchange(host);

        //RestInterface.getBusQueue(host);

        //RestInterface.getHostClusterStatus(host);

        //RestInterface.getHostClusterMembers(host);

        //RestInterface.getNetworkProfiles(host);

        //RestInterface.getPools(host);

        //RestInterface.getStoragePools(host);

        //RestInterface.getStoragePoolsInfo(host);

        //RestInterface.getTemplates(host);

        //RestInterface.getUsers(host);

        //RestInterface.getHostsStorageTypes(host);

        //RestInterface.getMetricsFabric(host,"23b20141e57f");

        //RestInterface.getMetricsFabricMemory(host,"23b20141e57f");

        //RestInterface.getMetricsFabricCPU(host,"23b20141e57f");

        //RestInterface.getMetricsFabricStorage(host,"23b20141e57f");

        //RestInterface.getMetricsFabricSensors(host,"23b20141e57f");

        //RestInterface.postGuestReset(host,"W10POUV0001");

        //RestInterface.postGuestPowerOff(host,"W10POUV0001");

        //RestInterface.postGuestSuspend(host,"W10POUV0002");

        //RestInterface.postGuestResume(host,guest);

        //RestInterface.postGuestPowerOff(host,guest);

        //RestInterface.postGuestUndefine(host,guest);

        //RestInterface.postGuestReboot(host,guest);

        //RestInterface.postGuestShutdown(host,guest);

        ///////RestInterface.postGuestMessage(host,guest);

        //RestInterface.postGuestDelete(host,guest);

        ////////RestInterface.postHostVerifyCMA(host,hostid);

        ///////RestInterface.postHostVerifyRealm(host,hostid);

        //RestInterface.postHostReboot(host,hostid);

        //RestInterface.postHostShutdown(host,hostid);

        //RestInterface.postHostServices(host,hostid);

        //RestInterface.postHostPackages(host,hostid);

        //RestInterface.postHostImages(host,hostid);

        //RestInterface.postHostNetworkProd(host,hostid);

        //RestInterface.postHostNetworkInterfaces(host,hostid);

        // value is not correct
        ////////RestInterface.postHostGlobalCloneDensity(host,hostid);

        //RestInterface.postHostState(host,hostid);

        //simply names the supportfile after it is created.  Does not create the file
        //RestInterface.postHostSupportFiles(host,hostid);

        //RestInterface.postHostLicense(host,hostid);

        //need to send a certificate file:  http format
        /////////RestInterface.postHostCertificate(host,certificate);

        //System.out.println(auth);






    }
}
