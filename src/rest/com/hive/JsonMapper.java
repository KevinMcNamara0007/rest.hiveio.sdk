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
import org.json.JSONObject;

class JsonMapper {

private static String output = "NULL";
public static String[] outputA ;

    public void mapGuests(String data){
        try {
            JSONObject obj = new JSONObject(data);
            output = (String)obj.get("guest");

        }catch(Exception e){
            e.printStackTrace();
        }
    }






}
