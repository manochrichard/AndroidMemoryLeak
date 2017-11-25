package info.androidhive.retrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Manoch Richard on 26-Oct-17.
 */

public class ServerResponse {

    public List<ServerValue> getValue() {
        return Value;
    }

    public void setValue(List<ServerValue> value) {
        Value = value;
    }

    @SerializedName("Value")
    private List<ServerValue> Value;

}
