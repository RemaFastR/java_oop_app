package com.company.sections.sculpting;

import com.company.help.Child;
import com.company.sections.Section;

import java.util.List;

public class Sculpting extends Section {

    public Sculpting(int id, String sectionName, int countOfSeats, List<Child> childrens, double costPerMouth) {
        super(id, sectionName, countOfSeats, childrens, costPerMouth);
    }

    @Override
    public void addChild(Child child) {
        super.getChildrens().add(child);
    }

    @Override
    public List<Child> getChildrensList() {
        if (!super.getChildrens().isEmpty()) return super.getChildrens();
        else return null;
    }

    @Override
    public int getSectionCountOfSeats() {
        return super.getChildrens().size();
    }


}
