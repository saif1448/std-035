package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Seller {
    String name;
    int age;
    String address;
    ArrayList<Vegetables> veg ;
    double total_amount;

    public Seller(){
        name = "";
        age = 0;
        address = "";
        veg = new ArrayList<>();
        total_amount = 0;
    }
    public Seller(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setVeg(ArrayList<Vegetables> veg) {
        this.veg = veg;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Vegetables> getVeg() {
        return veg;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", veg=" + veg +
                ", total_amount=" + total_amount +
                '}';
    }
}
