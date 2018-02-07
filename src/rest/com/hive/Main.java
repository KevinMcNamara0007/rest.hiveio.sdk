package rest.com.hive;


public class Main {
    private static Globals g = new Globals();

    private static String host = g._HOST;

    private static String guest = g._GUEST;


    public static void main(String[] args) {
/****************************    test passive_rest_interfaces    ***************************************************************************/
        //test public interfaces
        //RestInterface.getGuests(host);

        //RestInterface.getAlerts(host);

        //RestInterface.getRealms(host);

        //test private interfaces
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

        RestInterface.postGuestDelete(host,guest);


    }
}
