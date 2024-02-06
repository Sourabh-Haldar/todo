package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Table(name="todo_table")
@NoArgsConstructor
@Data
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="todo_id")
	private int todoid;
	@JsonProperty
	@Column(name="isCompleted")
	private boolean isCompleted;
	@Column(name="completion_date")
	private String CompletionDate;
	@Column(name="todo_name")
	private Todoname todoname;
}
