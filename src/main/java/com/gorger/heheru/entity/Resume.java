package com.gorger.heheru.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "resumes")
public class Resume implements Comparable<Resume>, Serializable {
    // private static final long serialVersionUID = 1L;
    // Unique identifier
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "resume_id")
    private List<Contact> contacts;

    public Resume() {}

    public Resume(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        if (contacts == null) {
            contacts = new ArrayList<>();
        }
        contacts.add(contact);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resume)) return false;
        Resume resume = (Resume) o;
        return (getId() == resume.getId()) && getFullName().equals(resume.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFullName());
    }

    @Override
    public String toString() {
        return id + '(' + fullName + ')';
    }

    @Override
    public int compareTo(Resume o) {
        int cmp = fullName.compareTo(o.fullName);
        return cmp != 0 ? cmp : id - o.id;
    }
}