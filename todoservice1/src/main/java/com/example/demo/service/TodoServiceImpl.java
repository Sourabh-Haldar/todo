package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;
import com.example.demo.repo.TodoRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService{
	public  TodoRepository todoRepository;
	@Override
	public void createTodo(Todo todo) {
		// TODO Auto-generated method stub
		todoRepository.save(todo);
	}

	@Override
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public Todo findById(Integer id) {
		// TODO Auto-generated method stub
		return todoRepository.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		todoRepository.deleteById(id);
	}

	

}
