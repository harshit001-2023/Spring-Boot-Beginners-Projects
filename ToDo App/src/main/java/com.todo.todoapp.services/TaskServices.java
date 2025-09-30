package com.todo.todoapp.services;

import com.todo.todoapp.model.Task;
import com.todo.todoapp.repository.TaskRepository;

import java.util.List;

public class TaskServices {
    private final TaskRepository taskRepository;
    public TaskServices(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }
    public void createTask(String title){
        Task task = new Task();
        task.setTitle(title);
        task.setComplicated(false);
        taskRepository.save(task);
    }
}
