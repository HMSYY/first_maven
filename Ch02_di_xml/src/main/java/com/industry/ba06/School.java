package com.industry.ba06;

public class School {

    private String name;
    private String address;

    public School() {
    }

    @Override
    public String toString() {
        return "school{" +
                "namae='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
