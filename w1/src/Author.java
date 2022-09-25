package ru.mirea.it.java;

public class Author {
    private String mail, name;
    private char gender;

    public Author(String name, String mail, char gender) {
        this.name = name;
        this.mail = mail;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }


    public String getEmail() {
        return mail;
    }

    public void setEmail(String mail) {
        this.mail = mail;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + mail + '\'' +
                ", gender=" + gender +
                '}';
    }
}
