/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.subtitutability;

/**
 *
 * @author mac
 */
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius,double height) {
        super(radius);
        this.height = height;
    }

    

    public double getHeight() {
        return height;
    }
    
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2.0 * Math.PI * super.getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[height=" + height + "," + super.toString() + "]";
    }
    
    
    
}
