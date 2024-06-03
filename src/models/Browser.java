package models;

import domain.App;

public class Browser extends App {
    public Browser(String name, String version) {
        super(name, version);
    }

    public void open() {
        System.out.println("opening browser");
    }

    public void close() {
        System.out.println("closing browser");
    }

    public void historic() {
        System.out.println("historic");
    }

    public void searchBar() {
        System.out.println("Searching...");
    }
}
