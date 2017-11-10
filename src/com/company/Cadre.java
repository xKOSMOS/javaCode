package com.company;

public class Cadre extends Person {

    private int ancien;
    private String function;

    public Cadre(String cin, String nom, String prenom, int age, String adresse, int ancien, String function) {
        super(cin, nom, prenom, age, adresse);
        this.ancien = ancien;
        this.function = function;
    }

    public int getAncien() {
        return ancien;
    }

    public void setAncien(int ancien) {
        this.ancien = ancien;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getInfo() {
        return this.getNom() + " " + this.getPrenom();
    }

    public void increment() {
        int age = this.getAge();
        int ageN = age + 1;
        this.setAge(ageN);
        this.ancien++;
    }

    @Override
    public String toString() {
        return super.toString()+", " +
                "ancien=" + ancien +
                ", function='" + function + '\'' +
                '}';
    }
}
