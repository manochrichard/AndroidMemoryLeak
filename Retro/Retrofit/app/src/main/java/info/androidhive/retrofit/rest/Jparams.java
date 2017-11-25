package info.androidhive.retrofit.rest;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Manoch Richard on 26-Oct-17.
 */

public class Jparams {



    public static String params()
    {
        JSONObject o = new JSONObject();
        JSONObject p = new JSONObject();
        String s="";
        try {
            o.put("interface", "RestAPI");
            o.put("method", "getCustomers");
            o.put("parameters", p);
            s = o.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return s;
    }

}
