/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursosvirtuales;

import java.util.List;

/**
 *
 * @author Niki
 */
public class Student extends User implements Observer {
    
    private List<Course> courses;

    public Student( String name, String email, String password) {
        super(name, email, password);
        this.courses = courses;
    }

    
    public void enroll(Course course){
        course.addStudent(this);
        course.registerObserver(this);
    }

    @Override
    public void update(Notification notification) {
        System.out.println(getName() + " recibió: " + notification.getMensaje());
    }

    public List<Course> getCourses() {
        return courses;
    }
    
    
    

}