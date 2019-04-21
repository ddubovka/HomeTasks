package ru.dubovka.task6;

import java.util.Arrays;

public class Restoration {
    private int restorersNumber;
    private Cathedral[] cathedralPart = new Cathedral[200];
    private String occupation;
    private int salary;

    public Restoration(int restorersNumber, Cathedral[] cathedralPart, String occupation, int salary) {
        this.restorersNumber = restorersNumber;
        this.cathedralPart = cathedralPart;
        this.occupation = occupation;
        this.salary = salary;
    }

    public int getRestorersNumber() {
        return restorersNumber;
    }

    public void setRestorersNumber(int restorersNumber) {
        this.restorersNumber = restorersNumber;
    }

    public Cathedral[] getCathedralPart() {
        return cathedralPart;
    }

    public void setCathedralPart(Cathedral[] cathedralPart) {
        this.cathedralPart = cathedralPart;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Restoration{" +
                "restorersNumber=" + restorersNumber +
                ", cathedralPart=" + Arrays.toString(cathedralPart) +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
