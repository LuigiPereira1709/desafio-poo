package models;

import domain.App;

public class PhoneCall extends App {
    public PhoneCall(String name, String version) {
        super(name, version);
    }

    public void contact() {
        System.out.println("contacts");
    }

    public void call() {
        System.out.println("call");
    }

    public void saveContact() {
        System.out.println("saving contact");
    }

    public void deleteContact() {
        System.out.println("deleting contact");
    }
}
