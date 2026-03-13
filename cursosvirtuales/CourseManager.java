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

public class CourseManager {

    static CourseManager instance;
    private List<Course> courses;

    private CourseManager() {
        courses = new ArrayList<>();
    }

    public static CourseManager getInstance() {
        if (instance == null) {
            instance = new CourseManager();
        }
        return instance;
    }

    public Course createCourse(String title) {

        Course course = new Course(title);
        courses.add(course);
        return course;

    }

    public Iterator createIterator() {
        return new IteratorCourse(courses);
    }

    public List<Course> getCourses() {
        return courses;
    }
}