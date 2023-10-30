package com.cmepps.listaTareas.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmepps.listaTareas.model.toDo;
import com.cmepps.listaTareas.repository.ItoDoRepository;

@Service
public class toDoService implements ItoDoService{
	@Autowired
    private ItoDoRepository todoRepository;

    @Override
    public List < toDo > getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional < toDo > getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(toDo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
        todoRepository.save(new toDo(name, desc, targetDate, isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional < toDo > todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(toDo todo) {
        todoRepository.save(todo);
    }
}
