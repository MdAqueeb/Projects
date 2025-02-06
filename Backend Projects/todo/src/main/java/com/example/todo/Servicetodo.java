package com.example.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Servicetodo {
    @Autowired
    DAOtodo repo;
    public List<Modeltodo> get_alltask(){
        
        return repo.findAll();
    }
    @Transactional
    public Modeltodo update_task(int id,Modeltodo task){
        Optional<Modeltodo> existingTask = repo.findById(id);
        task.setId(id);
        if (existingTask.isPresent()) {
            return repo.save(task);
        }
        throw new RuntimeException("Task not found");
    }
    public Modeltodo create_task(Modeltodo task){
        return repo.save(task);
    }
    public String delete_task(int id){
        Optional<Modeltodo> existingTask = repo.findById(id);
        if (existingTask.isPresent()) {
            repo.deleteById(id);
            return "The task is deleted!";
        }
        throw new RuntimeException("Task not found");
    }
    public Modeltodo get_task(@PathVariable int id){
        return repo.findBy(id);
    }
}
