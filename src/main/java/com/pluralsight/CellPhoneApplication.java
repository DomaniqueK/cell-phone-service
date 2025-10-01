package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {


        CellPhone phone1 = new CellPhone();
        CellPhone phone2 = new CellPhone();

        phone1.setSerialNumber(467446);
        phone1.setModel("iPhone 17");
        phone1.setCarrier("Verizon");
        phone1.setPhoneNumber("214-899-2563");
        phone1.setOwner("Jace Washington");

        phone2.setSerialNumber(867413);
        phone2.setModel("iPhone 15");
        phone2.setCarrier("Verizon");
        phone2.setPhoneNumber("214-655-6289");
        phone2.setOwner("Jace Washington");

        System.out.println("\n   Phone 1 Information  ");
        display(phone1);
        System.out.println("\n   Phone 2 Information  ");
        display(phone2);

        System.out.println("\n Phone 1 dialing Phone 2: ");
        phone1.dial(phone2.getPhoneNumber());
        System.out.println("\n Phone 2 dialing Phone 1: ");
        phone2.dial(phone1.getPhoneNumber());
    }



    public static void display(CellPhone phone) {
        System.out.println(" *Cell Phone Information* ");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Serial Number: " + phone.getSerialNumber());
    }

}
