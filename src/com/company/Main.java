/* Module 2. Task 4
 * Classname: Main
 *
 * Version 1
 *
 * Herman Zviertsev, NTU KhPI
 *
 * Develop for your class
1. Factory.
2. Abstract factory.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        Cube cube1 = CubeFactory.create(3);
        System.out.println(cube1);
        //Create object by Abstract Factory
        IGeometry triangle1 = (IGeometry) AbstractFactory.create(4, Figure.TRIANGLE);
        System.out.println(triangle1);


    }
}