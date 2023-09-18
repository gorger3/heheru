package com.gorger.heheru.entity;

import javax.persistence.Entity;


public enum ContactType {

    PHONE("Телефон"),
    MAIL("Почта"),

    ADDRESS("Профиль GitHub"),
    LINKEDIN("Профиль LinkedIn"),
    GITHUB("Профиль GitHub");

    private String title;

    ContactType() {

    }

    ContactType(String title) {
        this.title = title;
    }


}
