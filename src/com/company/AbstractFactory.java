/* Module 2. Task 4
 * Classname: AbstractFactory
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

public class AbstractFactory {
    public static Object create(int sideA, Figure figure) {
        switch (figure) {
            //Identifying type of object
            case TRIANGLE:
                return new EquilateralTriangle(sideA);
            case CUBE:
                return new Cube(sideA);
            case SQUARE:
                return new Square(sideA);
            default:
                return null;
        }
    }
}
