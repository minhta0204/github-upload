package polymorphism.pati;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mac
 */
public class Shape {

    private String color;
    
    public Shape(String color){
        this.color = color;
    }

    public double getArea() {
        // need to return something
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }
    
    
}
