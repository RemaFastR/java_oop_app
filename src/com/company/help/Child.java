package com.company.help;

import java.util.Formatter;

public class Child {
    public String name;
    public String secondName;
    public String patronymic;
    public int age;

    public Child(String name, String secondName, String patronymic, int age) {
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        Formatter f = new Formatter(); // объявление объекта
        return f.format(" \"%s\" , \"%s\" , \"%s\" , \"%d\" ",  name  , secondName , patronymic , age).toString();
    }
}
