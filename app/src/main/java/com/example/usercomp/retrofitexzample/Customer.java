package com.example.usercomp.retrofitexzample;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("patronymic")
    @Expose
    private String patronymic;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phones")
    @Expose
    private List<Phone> phones = null;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("managerId")
    @Expose
    private Integer managerId;
    @SerializedName("vip")
    @Expose
    private Boolean vip;
    @SerializedName("bad")
    @Expose
    private Boolean bad;
    @SerializedName("site")
    @Expose
    private String site;
    @SerializedName("contragent")
    @Expose
    private Contragent contragent;
    @SerializedName("personalDiscount")
    @Expose
    private Integer personalDiscount;
    @SerializedName("marginSumm")
    @Expose
    private Integer marginSumm;
    @SerializedName("totalSumm")
    @Expose
    private Integer totalSumm;
    @SerializedName("averageSumm")
    @Expose
    private Double averageSumm;
    @SerializedName("ordersCount")
    @Expose
    private Integer ordersCount;
    @SerializedName("customFields")
    @Expose
    private List<Object> customFields = null;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("address")
    @Expose
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Boolean getBad() {
        return bad;
    }

    public void setBad(Boolean bad) {
        this.bad = bad;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }

    public Integer getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(Integer personalDiscount) {
        this.personalDiscount = personalDiscount;
    }

    public Integer getMarginSumm() {
        return marginSumm;
    }

    public void setMarginSumm(Integer marginSumm) {
        this.marginSumm = marginSumm;
    }

    public Integer getTotalSumm() {
        return totalSumm;
    }

    public void setTotalSumm(Integer totalSumm) {
        this.totalSumm = totalSumm;
    }

    public Double getAverageSumm() {
        return averageSumm;
    }

    public void setAverageSumm(Double averageSumm) {
        this.averageSumm = averageSumm;
    }

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public List<Object> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(List<Object> customFields) {
        this.customFields = customFields;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}