package com.theironyard.entities;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    boolean isGood;

    @Column(nullable = false)
    int lecturerId;

    public Review() {
    }

    public Review(String author, String text, boolean isGood, int lecturerId) {
        this.author = author;
        this.text = text;
        this.isGood = isGood;
        this.lecturerId = lecturerId;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean isGood) {
        this.isGood = isGood;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

}
