package com.automobile.TwoWheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle {
    @Override
    public String getModelName() {
        return null;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getOwnerName() {
        return null;
    }

    public int getSpeed(){
        return 80;
    }

    public void cdplayer(){
        System.out.println("I can control the CDPlayer.");
        System.out.println("Change the Volume, Switch CD, Turn the CDPlayer On/Off.");
    }
}