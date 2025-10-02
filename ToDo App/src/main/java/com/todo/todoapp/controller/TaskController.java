package com.todo.todoapp.controller; // Changed package to controller

import com.todo.todoapp.models.Task;
import com.todo.todoapp.services.TaskServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/") // Add this to map all methods to root path
public class TaskController {
    private final TaskServices taskService;

    public TaskController(TaskServices taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model){
        List<Task> tasks = taskService.getAllTask();
        model.addAttribute("tasks", tasks); // Changed "Tasks" to "tasks" (lowercase)
        return "index"; // Changed from "tasks" to "index"
    }

    @PostMapping
    public String createTasks(@RequestParam String title){
        taskService.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable long id){
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle")
    public String toggleTask(@PathVariable long id){
        taskService.toggleTask(id);
        return "redirect:/";
    }
}