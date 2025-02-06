package com.example.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
@RequestMapping("/todo")
public class Controllertodo {
    @Autowired
    Servicetodo serve;
    @GetMapping("/get_alltask")
    public ResponseEntity<List<Modeltodo>>  get_alltask(){
        return ResponseEntity.ok(serve.get_alltask());
    }
    @GetMapping("/get_task/{id}")
    public ResponseEntity<Modeltodo>  get_alltask(@PathVariable int id){

        return ResponseEntity.ok(serve.get_task(id));
    }
    @PostMapping("/create_task")
    public ResponseEntity<Modeltodo> create_task(@RequestBody Modeltodo task){
        return ResponseEntity.ok(serve.create_task(task));
    }
    @PutMapping("/update_task/{id}")
    @Transactional
    public ResponseEntity<Modeltodo> update_task(@PathVariable int id,@RequestBody Modeltodo task){
        return ResponseEntity.ok(serve.update_task(id,task));
    }
    @DeleteMapping("/delete_task/{id}")
    public ResponseEntity<String> delete_task(@PathVariable int id){
        return ResponseEntity.ok(serve.delete_task(id));
    }
}
