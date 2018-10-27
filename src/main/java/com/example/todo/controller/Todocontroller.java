package com.example.todo.controller;


import com.example.todo.dao.TadoRepository;
import com.example.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Todocontroller {

    @Autowired
   private TadoRepository tadoRepository;

    @CrossOrigin("*")
    @GetMapping("/todo/{id}")
    public Todo findbyid(@PathVariable int id){
        return tadoRepository.findByid(id);
    }
    @CrossOrigin("*")
    @GetMapping("/todo")
    public List<Todo> findall(){
        return tadoRepository.findAll();
    }
    @CrossOrigin("*")
    @PostMapping("/todo")
    public Boolean addtodo(@Valid @RequestBody Todo todo){

        return tadoRepository.addtodo(todo);
    }

    @CrossOrigin("*")

    @DeleteMapping("/todo/{id}")
    public boolean deletetodo(@PathVariable int id){
       tadoRepository.delete(id);
        return true;
    }

    @PutMapping("/todo/{id}")
    public Todo update(@PathVariable int id, @Valid @RequestBody Todo todo){
         tadoRepository.updatelist(todo,id);
         return  todo;
    }

}
