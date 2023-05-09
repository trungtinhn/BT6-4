package com.example.test;

public class Student {
    private String Name;
    private String Date;
    private String Class;

    private int idImage;
    private String[] ListSubject;
    public Student(String Name,String Date, String Class, String[] ListSubject)
    {
        this.Name = Name;
        this.Date = Date;
        this.Class = Class;
        this.ListSubject = ListSubject;
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
    public String getDate()
    {
        return Date;
    }
    public void setDate(String Date)
    {
        this.Date = Date;
    }
    public String getclass()
    {
        return Class;
    }
    public void setClass(String Class)
    {
        this.Class = Class;
    }
    public int getId()
    {
        return idImage;
    }
}

