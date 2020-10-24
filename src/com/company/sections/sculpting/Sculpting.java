package com.company.sections.sculpting;

import com.company.help.Child;
import com.company.sections.Section;

import java.util.List;

public class Sculpting extends Section {

    public Sculpting(String sectionName, int countOfSeats, List<Child> childrens) {
        super(sectionName, countOfSeats, childrens);
    }

    @Override
    public void addChild(Child child) {

    }

    @Override
    public List<Child> getChildrensList() {
        return null;
    }

    @Override
    public int getSectionCountOfSeats() {
        return 0;
    }


}
