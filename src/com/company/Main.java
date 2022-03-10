package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, Information> hashMap=new HashMap<>();
        Car car=new Car(1, "12 23 56");
        Car car1=new Car(2, "45 78 35");
        Car car2=new Car(3, "34 67 12");
        Car car3=new Car(4, "56 34 12");

        Information information=new Information(2008,"Mercedes","$75,000", "black" );
        Information information1=new Information(2022,"Tesla","$46,440", "black" );
        Information information2=new Information(2005,"BMW","$35,700", "blue" );
        Information information3=new Information(2019,"Toyota Camry","$25,000", "white" );


        hashMap.put(car,information );
        hashMap.put(car1,information1 );
        hashMap.put(car2,information2 );
        hashMap.put(car3,information3 );

        for (Map.Entry<Car, Information> item:hashMap.entrySet()) {
            System.out.println("Key: "+item.getKey()+"Value: "+item.getValue());


        }


    }
}
