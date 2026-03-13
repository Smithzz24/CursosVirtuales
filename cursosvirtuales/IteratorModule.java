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
public class IteratorModule implements Iterator {
    private List<Module> modules;
    private int position=0;

    public IteratorModule(List<Module> modules) {
        this.modules = modules;
    }
    
    @Override 
    public boolean hasNext(){
        
        return position < modules.size();
    }
    
    @Override 
    public Object next(){
        
        return modules.get(position++);
        
    }
    
    
}
