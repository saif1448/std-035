package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Buyer {
    String name;
    int age;
    String address;
//    Vegetables shoppingCart[];

    ArrayList<Vegetables> shoppingCart;

    double totalPurchaseAmount;

    public Buyer() {
        name = "";
        age = 0;
        address = "";
        shoppingCart = new ArrayList<>();
        totalPurchaseAmount = 0.0;
    }

    public Buyer(String name, int age, String address, ArrayList<Vegetables> shoppingCart) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.shoppingCart = shoppingCart;
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

    public void setShoppingCart(ArrayList<Vegetables> shoppingCart) {
        this.shoppingCart = shoppingCart;
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

    public ArrayList<Vegetables> getShoppingCart() {
        return shoppingCart;
    }

    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", shoppingCart=" + shoppingCart +
                ", totalPurchaseAmount=" + totalPurchaseAmount +
                '}';
    }
}
