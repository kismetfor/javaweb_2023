package com.liutao;
// Book.java
public class Book {
    private int id;
    private String name;
    private String author;
    private String press;
    private int amount;

    public Book() {
    }

    public Book(int id, String name, String author, String press, int amount) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.press = press;
        this.amount = amount;
    }

    // 各个属性的 Getter 和 Setter 方法（你可以在你的 IDE 中生成它们）

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", amount=" + amount +
                '}';
    }
}
