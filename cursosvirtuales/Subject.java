/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursosvirtuales;

/**
 *
 * @author Niki
 */
interface Subject {
    
    void registerObserver( Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    
    
    
}
