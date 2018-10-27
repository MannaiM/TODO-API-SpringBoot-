package com.example.todo.dao;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface TadoRepository {

    public List<Todo> findAll();
    public Todo findByid(int id);
    public Boolean addtodo(Todo todo);
    public Todo updatelist(Todo todo,int id);
    public Todo delete(int id);

}
