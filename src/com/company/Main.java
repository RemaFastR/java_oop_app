package com.company;

import com.company.help.Child;
import com.company.sections.painting.Batik;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Child> childList = new ArrayList<Child>();
        childList.add(new Child("Aram","Ivanov","Ivanovich",13));
        childList.add(new Child("Aram","Ivanov","Ivanovich",13));
        childList.add(new Child("Aram","Ivanov","Ivanovich",13));

        Batik batik = new Batik(1,"Батик", 15, childList);

        System.out.println("Childs in batik:");
        for(Object person : batik.getChildrensList()){
            System.out.println(person);
        }

        batik.addChild(new Child("kon","kon","kon",15));

        System.out.println("Childs in batik after add:");
        for(Object person : batik.getChildrensList()){
            System.out.println(person);
        }

        System.out.println("Count childs in batik: " + batik.getSectionCountOfSeats());

        System.out.println("fffff");
    }
}
