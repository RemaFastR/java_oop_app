package com.company;

import com.company.help.Child;
import com.company.help.Interface;
import com.company.sections.Section;
import com.company.sections.painting.Batik;
import com.company.sections.painting.Watercolor;
import com.company.sections.sculpting.Clay;
import com.company.sections.sculpting.Floursalt;
import com.company.sections.wood.Woodburning;
import com.company.sections.wood.Woodsawing;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Данные для таблиц
    public static Object[][] batikArray;
    public static Object[][] watercolorArray;
    public static Object[][] clayArray;
    public static Object[][] floursaltArray;
    public static Object[][] woodburningArray;
    public static Object[][] woodsawingArray;
    // Заголовки столбцов
    public static Object[] columnsHeader = new String[] {"Фамилия", "Имя",
            "Отчество", "Возраст"};

    //
    public static List<Child> childListForBatik;
    public static List<Child> childListForWatercolor;
    public static List<Child> childListForClay;
    public static List<Child> childListForFloursalt;
    public static List<Child> childListForWoodburning;
    public static List<Child> childListForWoodsawing;


    public static void main(String[] args) {
        childListForBatik = new ArrayList<Child>();
        childListForWatercolor = new ArrayList<Child>();
        childListForClay = new ArrayList<Child>();
        childListForFloursalt = new ArrayList<Child>();
        childListForWoodburning = new ArrayList<Child>();
        childListForWoodsawing = new ArrayList<Child>();

        childListForBatik.add(new Child("Андрей","Иванов","Николаевич",13));
        childListForBatik.add(new Child("Антон","Вельский","Владиславович",13));
        childListForBatik.add(new Child("Артур","Гогидзе","Гочаевич",13));

        childListForWatercolor.add(new Child("Андрей","Иванов","Николаевич",13));
        childListForWatercolor.add(new Child("Антон","Вельский","Владиславович",13));
        childListForWatercolor.add(new Child("Артур","Гогидзе","Гочаевич",13));

        childListForClay.add(new Child("Андрей","Иванов","Николаевич",13));
        childListForClay.add(new Child("Антон","Вельский","Владиславович",13));
        childListForClay.add(new Child("Артур","Гогидзе","Гочаевич",13));

        childListForFloursalt.add(new Child("Андрей","Иванов","Николаевич",13));
        childListForFloursalt.add(new Child("Антон","Вельский","Владиславович",13));
        childListForFloursalt.add(new Child("Артур","Гогидзе","Гочаевич",13));

        childListForWoodburning.add(new Child("Андрей","Иванов","Николаевич",13));
        childListForWoodburning.add(new Child("Антон","Вельский","Владиславович",13));
        childListForWoodburning.add(new Child("Артур","Гогидзе","Гочаевич",13));

        childListForWoodsawing.add(new Child("Андрей","Иванов","Николаевич",13));
        childListForWoodsawing.add(new Child("Антон","Вельский","Владиславович",13));
        childListForWoodsawing.add(new Child("Артур","Гогидзе","Гочаевич",13));

        Batik batik = new Batik(1,"Батик", 15, childListForBatik, 580);
        Watercolor watercolor = new Watercolor(2,"Акварель",25,childListForWatercolor,400);
        Clay clay = new Clay(3,"Лепка глиной",17,childListForClay,800);
        Floursalt floursalt = new Floursalt(4, "Мукасоль", 12,childListForFloursalt,700);
        Woodburning woodburning = new Woodburning(5,"Выжигание по дереву", 15,childListForWoodburning,550);
        Woodsawing woodsawing = new Woodsawing(6, "Выпиливание", 10, childListForWoodsawing, 565);

        batikArray = childListToTable(batik);
        watercolorArray  = childListToTable(watercolor);
        clayArray = childListToTable(clay);
        floursaltArray = childListToTable(floursalt);
        woodburningArray = childListToTable(woodburning);
        woodsawingArray = childListToTable(woodsawing);


        System.out.println("Childs in batik after add:");
        for(Object person : batik.getChildrensList()){
            System.out.println(person);
        }

        System.out.println("Count childs in batik: " + batik.getSectionCountOfSeats());

        System.out.println("fffff");

        JFrame.setDefaultLookAndFeelDecorated(true);
        new Interface();
    }

    private static Object[][] childListToTable(Section section){
        Object[][] tempArray = new String[section.getChildrensList().size()][4];
        System.out.println("Childs in " + section.getSectionName() + ": ");
        int i =0;
        for(Child person : section.getChildrensList()){
            System.out.println(person);
            tempArray[i][0] = person.getName();
            tempArray[i][1] = person.getSecondName();
            tempArray[i][2] = person.getPatronymic();
            tempArray[i][3] = String.valueOf( person.getAge());
            i++;
        }
        return tempArray;
    }
}
