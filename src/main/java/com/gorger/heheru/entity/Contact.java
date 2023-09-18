package com.gorger.heheru.entity;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String text;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resume_id")
    private Resume resume;

    public Contact() {
    }

    public Contact(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
