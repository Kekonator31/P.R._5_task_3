package com.taskmanager.models;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    public String name;
    public String info;
    public Date date;
    private static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public Task(String name, String info, Date date) {
        this.name = name;
        this.info = info;
        this.date = date;
    }

    public Task(String name, String info) {
        this(name, info, new Date());
    }

    public Task(String name) {
        this(name, "No information", new Date());
    }

    public String getName() {return name;}
    public String getInfo() {return info;}
    public String getDate() {return format.format(date);}
}
