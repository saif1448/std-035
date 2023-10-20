package org.example;

import java.util.Arrays;

public class Buyer {
    String name;
    int age;
    String address;
    Vegetables shoppingCart[];

    double totalPurchaseAmount;

    public Buyer() {
        name = "";
        age = 0;
        address = "";
        shoppingCart = new Vegetables[10];
        totalPurchaseAmount = 0.0;
    }

    public Buyer(String name, int age, String address, Vegetables[] shoppingCart) {
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

    public void setShoppingCart(Vegetables[] shoppingCart) {
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

    public Vegetables[] getShoppingCart() {
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
                ", shoppingCart=" + Arrays.toString(shoppingCart) +
                ", totalPurchaseAmount=" + totalPurchaseAmount +
                '}';
    }
}
