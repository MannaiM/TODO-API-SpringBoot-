package com.example.todo.model;

import java.util.Date;

public class Todo {


    private String title;
    private String description;
    private Date dateechange;
    private boolean completed ;
    private  Date createdAt ;
    private  Date updatedAt ;

    public Todo() {
    }

    public Todo(String title, String description, Date dateechange, boolean completed, Date createdAt, Date updatedAt) {
        this.title = title;
        this.description = description;
        this.dateechange = dateechange;
        this.completed = completed;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateechange() {
        return dateechange;
    }

    public void setDateechange(Date dateechange) {
        this.dateechange = dateechange;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
