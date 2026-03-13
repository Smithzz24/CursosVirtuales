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
import java.util.ArrayList;
import java.util.List;

public class Content implements Subject {

    private String title;
    private List <Lesson> lessons;
    private List<Observer> observers;
    private List<Student> students;

    

    public Content(String title) {
        this.title = title;
        this.observers = new ArrayList<>();
        this.lessons = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    
     public Lesson addLesson(Lesson lesson){
        lessons.add(lesson);
        notifyObservers();
        return lesson;
        
    }
     
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    
     @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    
     @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(new Notification("Nueva leccion disponible"));
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public List<Observer> getObservers() {
        return observers;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    

}