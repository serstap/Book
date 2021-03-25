package com.company;

public class Publish {
    private String name;
    private String town;

    public Publish(String name, String town) {
       // this.name = name;
       // this.town = town;
        setName(name);
        setTown(town);
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("name cant be zero.");
        this.name = name;
    }

    public void setTown(String town) {
        if (town == null)
            throw new IllegalArgumentException("town cant be zero.");
        this.town = town;
    }
    public void print() {
            System.out.println(name+ " " + town);

    }

}
