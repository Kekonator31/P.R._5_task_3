package com.taskmanager.services;
import com.taskmanager.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public  void addTask(String name, String info, Date date){
        Task task = new Task(name, info, date);
        tasks.add(task);
    }

    public  void addTask(String name, String info){
        tasks.add(new Task(name, info));

    }

    public  void addTask(String name){
        tasks.add(new Task(name));
    }

    public  void printTasks(){
        String check;
        for(Task s : tasks) {
            System.out.println("Name:" + s.getName());
            check = s.getInfo();
            if(!Objects.equals(check, "")){
                System.out.println("Information: " + check);
            }
            System.out.println("Deadline: " + s.getDate());
        }
    }
}
