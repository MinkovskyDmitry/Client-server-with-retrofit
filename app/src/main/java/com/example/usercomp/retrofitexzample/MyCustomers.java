package com.example.usercomp.retrofitexzample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyCustomers {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("customers")
    @Expose
    private List<Customer> customers = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
