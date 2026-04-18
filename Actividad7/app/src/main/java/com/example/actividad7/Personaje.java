package com.example.actividad7;

public class Personaje {
    String name;
    String description;
    String photo;
    Integer attack;
    Integer defense;

    public Personaje(String name, String description, String photo, Integer attack, Integer defense) {
        this.name = name;
        this.description = description;
        this.photo = photo;
        this.attack = attack;
        this.defense = defense;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getPhoto() { return photo; }
    public Integer getAttack() { return attack; }
    public Integer getDefense() { return defense; }
}