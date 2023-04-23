package com.Geekster.Restaurant.Models;

public class Restaurant {
    private  int id;
    private String name;
    private String address;
    private String number;
    private String speciality;
    private int totalStaffs;

    private  double ratings;
    private String website;
    private boolean isOpen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Restaurant(int id , String name, String address, String number, String speciality, int totalStaffs, double ratings, String website, boolean isOpen) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.speciality = speciality;
        this.totalStaffs = totalStaffs;
        this.ratings = ratings;
        this.website = website;
        this.isOpen = isOpen;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }
}
