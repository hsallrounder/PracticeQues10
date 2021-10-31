package com.automobile;
import com.automobile.TwoWheeler.Hero;
import com.automobile.TwoWheeler.Honda;

public class test {
    public static void main(String[] args) {
        Hero obj1 = new Hero();
        Honda obj2 = new Honda();
        System.out.println("Hero");
        System.out.println(obj1.getSpeed());
        obj1.radio();
        System.out.println("");
        System.out.println("Honda");
        System.out.println(obj2.getSpeed());
        obj2.cdplayer();
    }
}
