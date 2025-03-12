package com.taskmanager.app;
import com.taskmanager.services.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class app {
    public static void main(String[] args) {

        TaskService taskService = new TaskService();

        taskService.addTask("Go to technic", "Wait for bus and go to school", new Date(125, Calendar.MARCH, 11, 6, 0, 0));

        taskService.addTask("Learn in technic", "Learn many thinks in technic");

        taskService.addTask("Go home and repeat");

        taskService.printTasks();
    }

}