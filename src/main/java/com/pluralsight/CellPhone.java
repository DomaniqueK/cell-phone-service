package com.pluralsight;

public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public CellPhone(long serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }


    public long getSerialNumber() {return serialNumber;}
    public void setSerialNumber(long serialNumber) {this.serialNumber = serialNumber;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public String getCarrier() {return carrier;}
    public void setCarrier(String carrier) {this.carrier = carrier;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getOwner() {return owner;}
    public void setOwner(String owner) {this.owner = owner;}


    public void dial(String number) {
        System.out.println(this.owner + "'s phone is calling " + number);
    }
    public void dial(CellPhone phone) {
        String dialNumber = phone.getPhoneNumber();
        System.out.println(this.owner + " is using easy-dial to call " + phone.getOwner());
        this.dial(dialNumber);
    }

}
