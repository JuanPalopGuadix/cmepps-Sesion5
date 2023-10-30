package com.cmepps.listaTareas.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cmepps.listaTareas.model.toDo;

public interface ItoDoService {
	List < toDo > getTodosByUser(String user);

    Optional < toDo > getTodoById(long id);

    void updateTodo(toDo todo);

    void addTodo(String name, String desc, Date targetDate, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(toDo todo);
}
