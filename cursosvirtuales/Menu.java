/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursosvirtuales;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Niki
 */
public class Menu {
    
    Scanner  sc = new Scanner(System.in);
    
public void iniciar(){

    int option;

    do{

        System.out.println("\n----Menu Principal---");
        System.out.println("1. Administrador");
        System.out.println("2. Profesor");
        System.out.println("3. Estudiante");
        System.out.println("0. Salir");

        option = sc.nextInt();
        sc.nextLine();

        switch(option){

            case 1:
                menuAdmin();
                break;

            case 2:
                menuTeacher();
                break;

            case 3:
                menuStudent();
                break;

        }

    }while(option != 0);
}
    public void menuAdmin(){
        System.out.println("Identifiquese:");
        System.out.println("Ingrese sus datos");
                System.out.println("Nombre");
                String name= sc.nextLine();
                System.out.println("Email");
                String email = sc.nextLine();
                System.out.println("Password");
                String password = sc.nextLine();
                Admin admin= new Admin(name,email,password);

    int option;

    do{

        System.out.println("--Menu Administrador--");
        System.out.println("1. Crear curso");
        System.out.println("2. Crear Modulo");
        System.out.println("3. Agregar Contenido");
        System.out.println("4. Agregar Leccion nueva");
        System.out.println("5. Ver cursos");
        System.out.println("-----");
        System.out.println("6. Asignar cursos");
        System.out.println("0. Salir");

        option = sc.nextInt();
        sc.nextLine();

        switch(option){

            case 1:
                System.out.println("Ingrese el nombre del curso");
                String title = sc.nextLine();
                Course course = CourseManager.getInstance().createCourse(title);
                System.out.println("Curso creado: " + title);
                break;
                
            case 2: 
                System.out.println("Ingrese el nombre del Modulo");
                String title0 = sc.nextLine();
                Module module = new Module(title0);
                Iterator it = CourseManager.getInstance().createIterator();
                Course c = (Course) it.next();
                c.addModule(module);
                System.out.println("El modulo creado: " +title0);
                for( Student student : c.getStudents()){
                     c.registerObserver(student);
                 }
                 c.notifyObservers();
                
                break;
                
            case  3:
                 System.out.println("Ingrese el nombre del contenido");
                 String title2= sc.nextLine();
                 Content content= new Content(title2);
                 System.out.println("Contenido creado" +title2);
                  
                 Iterator it2= CourseManager.getInstance().createIterator(); //uso del singleton y iterator
                 Course c2 = (Course) it2.next();
                 Module m= c2.getModules().get(0);
                 m.addContent(content);
                 for( Student student : c2.getStudents()){
                     m.registerObserver(student);
                 }
                 m.notifyObservers();
                 break;
                 
            case 4:
                 System.out.println("Ingrese el nombre de la leccion");
                 String title3= sc.nextLine();
                 System.out.println("Ingrese la URL del video");
                 String url= sc.nextLine();
                 System.out.println("Leccion creada" +title3);
                 Lesson lesson = new Lesson(title3,url);
                 Iterator it3= CourseManager.getInstance().createIterator(); //uso del singleton y iterator
                 Course c3 = (Course) it3.next();
                 Module m2 = c3.getModules().get(0);
                 Content con= m2.getContents().get(0);
                 con.addLesson(lesson);
                 for(Student student : c3.getStudents()) {
                 con.registerObserver(student);
                }
                 con.notifyObservers();

                 break;

                 
            case 5:
                mostrarCursos();
                break;
                
            case 6: 
                System.out.println("Cursos disponibles");
                List<Course>  listCourses = CourseManager.getInstance().getCourses();
                for(int i = 0; i < listCourses.size(); i++){
                System.out.println((i+1) + ". " + listCourses.get(i).getTitle());
                }
                System.out.println("Elija el curso");
                int choose = sc.nextInt();
                sc.nextLine();
                Course course1 = listCourses.get(choose - 1 );
                System.out.println("Profesores");
                List<Teacher>  listTeachers = course1.getTeachers();
                for(int i = 0; i < listTeachers.size(); i++){
                System.out.println((i+1) + ". " + listTeachers.get(i).getName());
                }
                System.out.println("Elija al profesor");
                int choose2 = sc.nextInt();
                sc.nextLine();
                Teacher teacher = listTeachers.get(choose2 -1);
                admin.assignTeacher(teacher, course1);
                
        }
        

    }while(option != 0);

}
     
    
    public void menuTeacher(){
        System.out.println("Identifiquese:");
        System.out.println("Ingrese sus datos");
                System.out.println("Nombre");
                String name= sc.nextLine();
                System.out.println("Email");
                String email = sc.nextLine();
                System.out.println("Password");
                String password = sc.nextLine();
                Teacher teacher= new  Teacher(name,email,password);
        int option;
    do{
        System.out.println("--Menu Profesor--");
        System.out.println("1. Ver cursos");
        System.out.println("2. Inscribirse a curso");
        System.out.println("3.Salir");
        option = sc.nextInt();
        sc.nextLine();
        switch(option){
            case 1: 
                mostrarCursos();
                break;
            case 2:
                System.out.println("Inscripcion a curso");
                System.out.println("--cursos disponibles--");
                List<Course>  listCourses = CourseManager.getInstance().getCourses();
                for(int i = 0; i < listCourses.size(); i++){
                System.out.println((i+1) + ". " + listCourses.get(i).getTitle());
                }
                System.out.println("Elija el curso");
                int choose = sc.nextInt();
                Course course = listCourses.get(choose - 1 );
                teacher.enroll(course);
                System.out.println(name +"quedo inscrito al curso ");
                break;
        }
        
        }while(option != 3);
    }
    
    public void menuStudent(){
        int option;
        System.out.println("Identifiquese:");
        System.out.println("Ingrese sus datos");
                System.out.println("Nombre");
                String name= sc.nextLine();
                System.out.println("Email");
                String email = sc.nextLine();
                System.out.println("Password");
                String password = sc.nextLine();
                Student student= new Student(name,email,password);

        do{
        System.out.println("--Menu Estudiante--");
        System.out.println("1. Inscribirse a un curso");
        System.out.println("2. Ver cusos");
        System.out.println("3. inscripciones");
        System.out.println("4. Salir");
        option= sc.nextInt();
        sc.nextLine();
        switch(option){
            case 1: 
                System.out.println("Inscripcion a curso");
                System.out.println("--cursos disponibles--");
                List<Course>  listCourses = CourseManager.getInstance().getCourses();
                for(int i = 0; i < listCourses.size(); i++){
                System.out.println((i+1) + ". " + listCourses.get(i).getTitle());
                }
                System.out.println("Elija el curso");
                int choose = sc.nextInt();
                Course course = listCourses.get(choose - 1 );
                student.enroll(course);
                 for (Module m : course.getModules()) {
                        for (Content c : m.getContents()) {
                            c.registerObserver(student);
                        }
                    }
                System.out.println(name +"quedo inscrito al curso ");
                break;
            case 2:
                mostrarCursos();  
                break;
                
            case  3: 
                List<Course> misCursos = student.getCourses();
                break;
        }
       }while(option != 4);
    }
    
    public void mostrarCursos(){
        
                System.out.println("---Lista de cursos---");

                Iterator iterator = CourseManager.getInstance().createIterator();

                while(iterator.hasNext()){
                    Course course2 = (Course) iterator.next();
                    System.out.println("Curso: " + course2.getTitle());
                    for( Module modules: course2.getModules()){
                        System.out.println("Modulos: " + modules.getTitle());
                        for (Content contents: modules.getContents()){
                            System.out.println("Contenido: " + contents.getTitle());
                            for ( Lesson lessons : contents.getLessons()){
                                System.out.println("Lecciones: " + lessons.getTitle());
   
                            }
                        }
                    }
                    
                }
                
                

        
    }
 }
    
