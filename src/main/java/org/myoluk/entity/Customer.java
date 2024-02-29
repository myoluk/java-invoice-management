package org.myoluk.entity;

import org.myoluk.general.BaseEntity;

import java.time.LocalDate;

public class Customer implements BaseEntity {
    private final Long id;
    private final LocalDate registerDate;
    private String name;
    private String surname;
    private String sector;

    public Customer(Long id, LocalDate registerDate, String name, String surname, String sector) {
        this.id = id;
        this.registerDate = registerDate;
        this.name = name;
        this.surname = surname;
        this.sector = sector;
    }

    @Override
    public Long getId() {
        return id;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "* " + name + " " + surname +
                " from " + sector +
                " (" + registerDate.toString() + ")";
    }
}
