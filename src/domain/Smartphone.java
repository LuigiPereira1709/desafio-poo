package domain;

import java.util.ArrayList;
import java.util.List;

public class Smartphone {
    private String model;
    private String brand;
    private List<App> apps;

    public Smartphone(String model, String brand) {
        this.model = model;
        this.brand = brand;
        this.apps = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }
}
