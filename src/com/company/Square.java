/* Module 2. Task 4
 * Classname: Square
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

public class Square implements IGeometry {
    private int sideA;
    //constructor
    public Square(int sideA) {
        this.sideA = sideA;
    }
//getter
    public int getSideA() {
        return sideA;
    }
//setter
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
//Implemented method area
//@param sideA
    @Override
    public double getArea() {
        return sideA * sideA;
    }
//implemented method perimetr
//@param sideA
    @Override
    public double getLength() {
        return sideA * 4;
    }
//to string method
    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                "perimetr=" + getLength()+
                "area=" + getLength()+
                '}';
    }
}
