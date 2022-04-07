/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism.subtitutability;

/**
 *
 * @author mac
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Substitute a subclass instance to a superclass reference
        Circle c1 = new Cylinder(1.1, 2.2);
        
        // invoke superclass Circle's method
        System.out.println(c1.getRadius());
        
        /* cannot invoke method in Cylinder as c1 is a Circle reference
        c1 - a reference to the parent class, don't know about methods in subclass
        Although :
        c1 - reference to Circle(parent class) but holds an object of Cylinder(sub-class)
        => c1 retains its internal identity
        -> invoke override method like toString, getArea, it will invoke the version in
        sub-class because c1 in fact holding a Cylinder(sub-class) object internally
        */
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        
    }
    
}
