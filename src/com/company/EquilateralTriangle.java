/* Module 2. Task 4
 * Classname: EquilateralTriangle
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

public class EquilateralTriangle implements IGeometry {
    private int sideA;
//Constructor with parametr
    public EquilateralTriangle(int sideA) {
        this.sideA = sideA;
    }
//Getter
    public int getSideA() {
        return sideA;
    }
//Setter
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
//Implemented Method Area
//@param sideA
    @Override
    public double getArea() {
        return (Math.pow(sideA,2) * Math.sqrt(3))/4;
    }
//Implemented Method Perimetr
//@param sideA
    @Override
    public double getLength() {
        return 3 * sideA;
    }
//To string method
    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideA=" + sideA +
                "Perimetr =" + getLength() +
                "Area =" + getArea() +

                '}';
    }
}

