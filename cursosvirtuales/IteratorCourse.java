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
public class IteratorCourse implements Iterator {
    private List<Course> courses;
    private int position =0;

    public IteratorCourse(List<Course> courses) {
        this.courses = courses;
    }

    @Override 
    public boolean hasNext(){
        return position < courses.size();
        
    }
    
    @Override 
    public Object next(){
        return courses.get(position++);
    }
    
    
    
}
