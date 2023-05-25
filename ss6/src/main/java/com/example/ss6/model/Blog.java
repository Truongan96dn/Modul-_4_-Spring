package com.example.ss6.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    private String title;
    @NonNull
    @Column(name="content",columnDefinition = "LONGTEXT")
    private String content;
    @NonNull
    private String writer;
    @NonNull
    @Column(name = "dateCreate",nullable = false,updatable = false,columnDefinition = "TIMESTAMP DEFAULT now()")
    @CreationTimestamp
    private LocalDateTime dateCreate;
    @Column(name="dateUpdate",nullable = false,columnDefinition = "TIMESTAMP DEFAULT now()")
    @UpdateTimestamp
    private LocalDateTime dateUpdate;

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Blog() {
    }

    public Blog(@NonNull String title, @NonNull String content, @NonNull String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public Blog(@NonNull String title, @NonNull String content, @NonNull String writer, @NonNull LocalDateTime dateCreate) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.dateCreate = dateCreate;
    }

    public Blog(Integer id, @NonNull String title, @NonNull String content, @NonNull String writer) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public Blog(Integer id, @NonNull String title, @NonNull String content, @NonNull String writer, @NonNull LocalDateTime dateCreate, LocalDateTime dateUpdate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getContent() {
        return content;
    }

    public void setContent(@NonNull String content) {
        this.content = content;
    }

    @NonNull
    public String getWriter() {
        return writer;
    }

    public void setWriter(@NonNull String writer) {
        this.writer = writer;
    }

    @NonNull
    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(@NonNull LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }
}
