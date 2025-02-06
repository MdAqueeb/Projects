package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
// 	Task Management:

// CRUD (Create, Read, Update, Delete) operations for tasks.
// Each task can have attributes like title, description, due date, status (e.g., pending, completed), and priority.
// Data Persistence:

// Store tasks in a database, allowing users to retrieve and manage their tasks.
// Categories or Tags:

// Ability to categorize tasks or tag them for better organization.
// Search and Filter:

// Implement search functionality to find tasks by title or description.
// Filtering options based on status, due date, or priority.
// Due Date Reminders:

// Notifications or reminders for tasks approaching their due dates
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		System.out.println("Project Started..");
	}

}
