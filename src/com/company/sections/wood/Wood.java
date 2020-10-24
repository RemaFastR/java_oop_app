package com.company.sections.wood;

import com.company.help.Child;
import com.company.sections.Section;

import java.util.List;

public class Wood extends Section {

    public Wood(String sectionName, int countOfSeats, List<Child> childrens) {
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
