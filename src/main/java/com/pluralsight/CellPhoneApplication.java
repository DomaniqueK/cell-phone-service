package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {


        CellPhone phone1 = new CellPhone();

        phone1.setSerialNumber(467446);
        phone1.setModel("iPhone 17");
        phone1.setCarrier("Verizon");
        phone1.setPhoneNumber("214-899-2563");
        phone1.setOwner("Jace Washington");

        System.out.println(" Cell Phone Information ");
        System.out.println("Owner: " + phone1.getOwner());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Carrier: " + phone1.getCarrier());
        System.out.println("Phone Number: " + phone1.getPhoneNumber());
        System.out.println("Serial Number: " + phone1.getSerialNumber());
    }

}
