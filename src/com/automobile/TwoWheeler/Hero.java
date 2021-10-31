package com.automobile.TwoWheeler;
import com.automobile.Vehicle;

public class Hero extends Vehicle {
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

    public int getSpeed() {
        return 50;
    }

    public void radio() {
        System.out.println("I can control the Radio.");
        System.out.println("Change the Volume, Switch Stations, Turn the Radio On/Off.");
    }
}