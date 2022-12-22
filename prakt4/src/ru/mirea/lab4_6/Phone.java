package ru.mirea.lab4_6;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;
    Phone(String n,String m,double w)
    {
        this(n,m);
        weight=w;
    }
    Phone(String n, String m)
    {
        number = n;
        model = m;
    }
    Phone(){}

    public void setNumber(String number)
    {
        this.number=number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    void receiveCall (String name){
        System.out.println("Calling " + name);
    }
    void receiveCall (String name,String number){
        System.out.println("Calling " + name + " with number:" + number);
        System.out.println("My number:"+getNumber());
    }

    public String getNumber()
    {
        return number;
    }

    void sendMessage(String... numbers)
    {
        System.out.println(Arrays.toString(numbers));

    }

}
