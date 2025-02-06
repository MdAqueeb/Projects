package com.example.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface  DAOtodo extends JpaRepository<Modeltodo,Integer> {
    @Query("select t from Modeltodo t where t.id = :id")
    public Modeltodo findBy(int id);
    
}
