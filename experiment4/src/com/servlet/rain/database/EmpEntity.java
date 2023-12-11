package com.servlet.rain.database;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmpEntity {
    private int id;
    private String author;
    private String press;
    private int amount;

    public EmpEntity() {
    }

    public EmpEntity(int id, String author, String press, int amount) {
        this.id = id;
        this.author = author;
        this.press = press;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {this.amount = amount;}
    public static void sortByEmpId(List<EmpEntity> empList) {
        Collections.sort(empList, Comparator.comparingInt(EmpEntity::getId));
    }


    @Override
    public String toString() {

        return "EmpEntity{" +
                "id=" + id +
                ", author=" + author +
                ", press='" + press + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}