/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursosvirtuales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Niki
 */
public class Course implements Subject{
    
    private String title;
    private List <Module> modules;
    private List <Student> students;
    private List<Observer> observers;
    private List <Teacher> teachers;

    public Course(String title) {
        this.title = title;
        this.modules = new ArrayList <>();
        this.students = new ArrayList <>();
        this.observers = new ArrayList <>();
        this.teachers = new ArrayList <>();
    }
    
    public Module addModule(Module module){
    modules.add(module);
    return module;
}
    
    public void assignTeacher(Teacher t){
        teachers.add(t);
  
    }
    
    public void addStudent(Student student){
        notifyObservers();
        students.add(student);
    }
   
    
        @Override
        public void registerObserver(Observer o){ observers.add(o); }

        @Override
        public void removeObserver(Observer o){ observers.remove(o); }

        @Override
        public void notifyObservers(){
            Notification n = new Notification("Nuevo modulo : " + title);
            for(Observer o : observers){
                o.update(n);
            }
        }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    
    
        
        
    }


        

