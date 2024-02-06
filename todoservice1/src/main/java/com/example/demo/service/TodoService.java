package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Todo;

public interface TodoService {
	void createTodo(Todo todo);
	List<Todo>	getAllTodo();
	Todo findById(Integer id);
	void delete(Integer id);
	
}
