package info.androidhive.retrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Manoch Richard on 26-Oct-17.
 */

public class ServerValue {

    @SerializedName("State")
    private String State;
    @SerializedName("CustomerId")
    private String CustomerId;
    @SerializedName("CustomerCode")
    private String CustomerCode;
    @SerializedName("Address")
    private String Address;
    @SerializedName("CreatedDate")
    private String CreatedDate;


    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public ServerValue(String State, String CustomerId, String CustomerCode, String Address, String CreatedDate) {
        this.State = State;
        this.CustomerId = CustomerId;
        this.CustomerCode = CustomerCode;
        this.Address = Address;
        this.CreatedDate = CreatedDate;
    }

}
