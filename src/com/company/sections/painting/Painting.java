package com.company.sections.painting;

import com.company.help.Child;
import com.company.sections.Section;

import java.util.List;

public class Painting extends Section {

    public Painting(String sectionName, int countOfSeats, List<Child> childrens) {
        super(sectionName, countOfSeats, childrens);
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
