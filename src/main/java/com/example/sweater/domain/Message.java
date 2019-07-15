package com.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tag;

    public Message() {

    }

    public Message(String text, String teg) {
        this.text = text;
        this.tag = teg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTeg() {
        return tag;
    }

    public void setTeg(String teg) {
        this.tag = teg;
    }
}
