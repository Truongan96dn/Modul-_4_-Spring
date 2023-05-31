package com.example.ss9.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "code_order")
    private int code;

    @Column(name = "date_order_book")
    private Date date;

    public Orders() {
    }

    public Orders(int id, int code, Date date) {
        this.id = id;
        this.code = code;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
