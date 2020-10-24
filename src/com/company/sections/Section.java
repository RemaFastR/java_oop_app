package com.company.sections;
import com.company.help.Child;
import java.util.List;

public abstract class Section {
    private String sectionName;
    private int countOfSeats;
    private List<Child> childrens;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public List<Child> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Child> childrens) {
        this.childrens = childrens;
    }

    public Section(String sectionName, int countOfSeats, List<Child> childrens) {
        this.sectionName = sectionName;
        this.countOfSeats = countOfSeats;
        this.childrens = childrens;
    }

    public abstract void addChild(Child child);

    public abstract List<Child> getChildrensList();

    public abstract int getSectionCountOfSeats();
}
