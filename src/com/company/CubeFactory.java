/* Module 2. Task 4
 * Classname: CubeFactory
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

public class CubeFactory {
    //Method to creation cubes objects
    //@param sideA
    public static Cube create(int sideA) {
        //CHECK is cube exists
        if (sideA != 0 && sideA > 0) {
            Cube cube = new Cube(sideA);
            return cube;
        } else {
            return null;
        }
    }
}

