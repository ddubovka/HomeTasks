package ru.dubovka.task6;

import java.util.Arrays;

public class Cathedral
        extends SaveNotreDameDeParis {
    private String title;
    private int damagePercent;
    private int age;

    public Cathedral(String title, int damagePercent, int age) {
        this.title = title;
        this.damagePercent = damagePercent;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDamagePercent() {
        return damagePercent;
    }

    public void setDamagePercent(int damagePercent) {
        this.damagePercent = damagePercent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cathedral{" +
                "title='" + title + '\'' +
                ", damagePercent=" + damagePercent +
                ", age=" + age +
                '}';
    }
}
