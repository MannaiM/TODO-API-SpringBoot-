package com.example.todo.metier;

import com.example.todo.dao.TadoRepository;
import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TodoRepositoryImp implements TadoRepository {


    private ArrayList<Todo> listodo= new ArrayList<>();
    @Override
    public List<Todo> findAll() {

        return this.listodo;
    }

    @Override
    public Todo findByid(int id) {

        return this.listodo.get(id);
    }

    @Override
    public Boolean addtodo(Todo todo) {
        return this.listodo.add(todo);

    }

    @Override
    public Todo updatelist(Todo todo,int id) {
        return this.listodo.set(id,todo);

    }

    @Override
    public Todo delete(int id) {
        return this.listodo.remove(id);
    }
}
