package com.cmepps.listaTareas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmepps.listaTareas.model.toDo;

public interface ItoDoRepository extends JpaRepository < toDo, Long > {
    List < toDo > findByUserName(String user);
}
