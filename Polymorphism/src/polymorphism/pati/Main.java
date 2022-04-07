/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.pati;

/**
 *
 * @author mac
 */
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 3, 4); // upcast
        /*
        run the overridden method from Rectangle class
        */
        System.out.println(s1.toString());
        System.out.println(s1.getArea());
        
        Shape s2 = new Triangle("blue", 5, 6); // upcast
        /*
        run the overridden method from Triangle class
        */
        System.out.println(s2.toString());
        System.out.println(s2.getArea());
        
        
    }
}
