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


import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.*;


class SSLwoVerificationAuth {
    private static String data =null;
    private static final String userpass = "/api/";
    private static String complete = "";

    public String challenge(String token, String hostname, String rest_interface, String method) {
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

                //JSONObject json = new JSONObject(data);
                JSONArray json = new JSONArray(data);
                System.out.println(json.toString(3));

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

    public String challengeAlert(String token, String hostname, String id, String rest_interface, String method) {

        if(rest_interface.contains("acknowledge")) {
            complete = "https://" + hostname + userpass + "/alert/" + id + "/"+rest_interface;
        } else if (rest_interface.contains("delete")) {
            complete = "https://" + hostname + userpass + "/alert/" + id;
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
                } else if(method.contains("GET")) {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("DELETE");
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

    public String challengeBus(String token, String hostname, String name, String rest_interface, String method) {

        if(rest_interface.contains("exchangename")) {
            complete = "https://" + hostname + userpass + "/bus/exchange/" + name;
        } else if (rest_interface.contains("queuename")) {
            complete = "https://" + hostname + userpass + "/queue/name/" + name;
        } else {
            complete = "https://" + hostname + userpass + rest_interface + "/" + name;
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
                } else if(method.contains("GET")) {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("DELETE");
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
        complete = "https://"+hostname+userpass+"/guest/"+guest+rest_interface;

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
            complete = "https://" + hostname + userpass + "host/verifycma";
        } else if (rest_interface.contains("verifyrealm")) {
            complete = "https://" + hostname + userpass + "host/" + rest_interface;
        } else if (rest_interface.contains("reboot")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + rest_interface;
        } else if (rest_interface.contains("shutdown")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + rest_interface;
        } else if (rest_interface.contains("services")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + rest_interface;
        } else if (rest_interface.contains("packages")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/firmware/software/packages ";
        } else if (rest_interface.contains("images")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/firmware/appliance/images ";
        } else if (rest_interface.contains("networkprod")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/networking/production";
        } else if (rest_interface.contains("networkinterfaces")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/networking/interfaces";
        } else if (rest_interface.contains("clonedensity")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/globalCloneDensity";
        } else if (rest_interface.contains("hoststate")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/state";
        } else if (rest_interface.contains("supportfiles")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/supportfiles";
        }  else if (rest_interface.contains("license")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/license";
        }  else if (rest_interface.contains("certificate")) {
            complete = "https://" + hostname + userpass + "host/" + hostid + "/certificate";
        }  else {
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

    public String challengeGuestPool(String token, String hostname, String name, String rest_interface, String method) {

        if(rest_interface.contains("exchangename")) {
            complete = "https://" + hostname + userpass + "/bus/exchange/" + name;
        } else if (rest_interface.contains("queuename")) {
            complete = "https://" + hostname + userpass + "/queue/name/" + name;
        } else {
            complete = "https://" + hostname + userpass + rest_interface + "/" + name;
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
                } else if(method.contains("GET")) {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("GET");
                } else {
                    // CURLOPT_GET
                    urlConnection.setRequestMethod("DELETE");
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

    public String challengeStorage(String token, String hostname, String id, String rest_interface, String method) {

        if(rest_interface.contains("browse")) {
            complete = "https://" + hostname + userpass + "/storage/pool/" + id + "/browse";
        } else if (rest_interface.contains("poolAdd")) {
            complete = "https://" + hostname + userpass + "/storage/pools/";
        } else if (rest_interface.contains("poolDelete")) {
            complete = "https://" + hostname + userpass + "/storage/pool/" + id;
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

    public String challengeTemplate(String token, String hostname, String name, String rest_interface, String method) {

        if(rest_interface.contains("unload")) {
            complete = "https://" + hostname + userpass + "/template/" + name + "/unload";
        } else if (rest_interface.contains("load")) {
            complete = "https://" + hostname + userpass + "/template/" + name + "/load";
        } else if (rest_interface.contains("analyze")) {
            complete = "https://" + hostname + userpass + "/template/" + name + "/analyze";
        }  else if (rest_interface.contains("create")) {
            complete = "https://" + hostname + userpass + "/template/" + name + "/create";
        } else if (rest_interface.contains("author")) {
            complete = "https://" + hostname + userpass + "/template/" + name + "/author";
        }  else if (rest_interface.contains("duplicate")) {
            complete = "https://" + hostname + userpass + "/template/" + name + "/duplicate";
        }  else if (rest_interface.contains("convert")) {
            complete = "https://" + hostname + userpass + "/template/convert";
        } else if (rest_interface.contains("templateAdd")) {
            complete = "https://" + hostname + userpass + "/templates";
        }else {
            complete = "https://" + hostname + userpass + rest_interface + "/" + name;
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