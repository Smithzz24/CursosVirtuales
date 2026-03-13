/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursosvirtuales;

/**
 *
 * @author Niki
 */
public class Admin extends User {

    public Admin(String name, String email, String password) {
        super(name, email, password);
    }

    public Course createCourse(String title){
        CourseManager manager = CourseManager.getInstance();
        return manager.createCourse(title);
    }
    
    public void assignTeacher( Teacher t , Course c){
        c.assignTeacher(t);
        
    }

}