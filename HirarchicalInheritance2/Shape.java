/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HirarchicalInheritance2;

/**
 *
 * @author Fahim
 */
public class Shape extends Box{
    void show(){
        System.out.println("Width of Box: "+width);
        System.out.println("Height of Box: "+height);
        System.out.println("Depth of Box: "+depth);
    }
}
