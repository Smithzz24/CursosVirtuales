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
public class IteradorLesson implements Iterator {
    private List<Lesson> lessons;
    private int position =0;

    public IteradorLesson(List<Lesson> lessons) {
        this.lessons = lessons;
    }

   
    
    @Override 
    public boolean hasNext(){
        return position < lessons.size();
        
    }
    
    @Override 
    public Object next(){
        return lessons.get(position++);
    }
    
    
    
}
