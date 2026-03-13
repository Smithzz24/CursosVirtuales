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
public class Module implements Subject{
    private String title;
    private List<Content> contents;
    private List <Observer> observers;

    public Module(String title) {
        this.title = title;
        this.contents = new ArrayList<>();
        this.observers = new ArrayList<>();
    }
    
    public Content addContent(Content content){
        contents.add(content);
        notifyObservers();
        return content;
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
            observer.update(new Notification("Nuevo contenido disponible"));
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Content> getContents() {
        return contents;
    }

    public List<Observer> getObservers() {
        return observers;
    }
    
    
    
    
    
    
    
}
