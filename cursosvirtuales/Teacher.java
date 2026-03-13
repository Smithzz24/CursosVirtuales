/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursosvirtuales;

/**
 *
 * @author Niki
 */
public class Teacher extends User{

    public Teacher(String name, String email, String password) {
        super(name, email, password);
    }
    
       public void enroll(Course course){
        course.assignTeacher(this);

    }    
}
