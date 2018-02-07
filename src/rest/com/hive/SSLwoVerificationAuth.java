package rest.com.hive;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;


class SSLwoVerificationAuth {

    private static String data =null;
    //public static String token0 = "-1";
    private static final String userpass = "/api/";
    private static String complete = "";


    public String challenge(String token, String hostname, String rest_interface, String method) {
        //complete = hostname+userpass+RestInterface+"?"+preamble+token;
        complete = "https://"+hostname+userpass+rest_interface;

        //System.out.println(complete);

        try {
            URL url = new URL(complete);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                if(method.contains("POST")) {
                    // CURLOPT_POST
                    urlConnection.setRequestMethod("POST");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                }

                urlConnection.setRequestProperty("Content-Type", "application/json");
                //urlConnection.setRequestProperty("Authorization:Bearer", token);
                urlConnection.setRequestProperty("Authorization", "Bearer "+token);

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));

                data = reader.readLine();
                System.out.println(data);



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

    public String challengeUser(String token, String hostname, String username, String rest_interface, String method) {
        //complete = hostname+userpass+RestInterface+"?"+preamble+token;
        complete = "https://"+hostname+userpass+rest_interface+"?username="+username;

        //System.out.println(complete);

        try {
            URL url = new URL(complete);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                if(method.contains("POST")) {
                    // CURLOPT_POST
                    urlConnection.setRequestMethod("POST");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                }

                urlConnection.setRequestProperty("Content-Type", "application/json");
                //urlConnection.setRequestProperty("Authorization:Bearer", token);
                urlConnection.setRequestProperty("Authorization", "Bearer "+token);

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));

                data = reader.readLine();
                System.out.println(data);



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

    public String challengeID(String token, String hostname, String id, String rest_interface, String method) {

        if(rest_interface.contains("memory")) {
            complete = "https://" + hostname + userpass + "/metrics/fabric/" + id + rest_interface;
        } else if (rest_interface.contains("cpu")) {
            complete = "https://" + hostname + userpass + "/metrics/fabric/" + id + rest_interface;
        } else if (rest_interface.contains("storage")) {
            complete = "https://" + hostname + userpass + "/metrics/fabric/" + id + rest_interface;
        } else if (rest_interface.contains("sensors")) {
            complete = "https://" + hostname + userpass + "/metrics/fabric/" + id + rest_interface;
        } else {
            complete = "https://" + hostname + userpass + rest_interface + "/" + id;
        }
        System.out.println(complete);

        try {
            URL url = new URL(complete);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                if(method.contains("POST")) {
                    // CURLOPT_POST
                    urlConnection.setRequestMethod("POST");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                }

                urlConnection.setRequestProperty("Content-Type", "application/json");
                //urlConnection.setRequestProperty("Authorization:Bearer", token);
                urlConnection.setRequestProperty("Authorization", "Bearer "+token);

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));

                data = reader.readLine();
                System.out.println(data);

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

    public String challengeGuest(String token, String hostname, String guest, String rest_interface, String method) {
        //complete = hostname+userpass+RestInterface+"?"+preamble+token;
        complete = "https://"+hostname+userpass+"/guest/"+guest+rest_interface;

        //System.out.println(complete);

        try {
            URL url = new URL(complete);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                if(method.contains("POST")) {
                    // CURLOPT_POST
                    urlConnection.setRequestMethod("POST");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                }

                urlConnection.setRequestProperty("Content-Type", "application/json");
                //urlConnection.setRequestProperty("Authorization:Bearer", token);
                urlConnection.setRequestProperty("Authorization", "Bearer "+token);

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));

                data = reader.readLine();
                System.out.println(data);



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


    public String challengeHost(String token, String hostname, String hostid, String rest_interface, String method) {

        if(rest_interface.contains("verifycma")) {
            complete = "https://" + hostname + userpass + "host/cma/verify";
        } else if (rest_interface.contains("verifyrealm")) {
            complete = "https://" + hostname + userpass + "host/" + rest_interface;
        } else if (rest_interface.contains("reboot")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + rest_interface;
        } else if (rest_interface.contains("shutdown")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + rest_interface;
        } else if (rest_interface.contains("services")) {
        complete = "https://" + hostname + userpass + "host/" + hostid + rest_interface;
        } else {
            complete = "https://" + hostname + userpass + rest_interface + "/" + hostid;
        }
        System.out.println(complete);

        try {
            URL url = new URL(complete);
            InputStream inStream = null;

            try {
                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                if(method.contains("POST")) {
                    // CURLOPT_POST
                    urlConnection.setRequestMethod("POST");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                }

                urlConnection.setRequestProperty("Content-Type", "application/json");
                //urlConnection.setRequestProperty("Authorization:Bearer", token);
                urlConnection.setRequestProperty("Authorization", "Bearer "+token);

                inStream = urlConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));

                data = reader.readLine();
                System.out.println(data);

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