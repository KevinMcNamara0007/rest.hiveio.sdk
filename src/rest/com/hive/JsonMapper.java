package rest.com.hive;

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
