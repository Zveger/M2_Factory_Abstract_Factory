/* Module 2. Task 4
 * Classname: Cube
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

import java.util.Objects;

//Create new class
public class Cube{
    private int sideA;
    //Generate Constructor without parameter
    public Cube() {
    }
    //Generate Constructor with parameter
    public Cube(int sideA) {
        this.sideA = sideA;
    }
    //Generate Getter
    public int getSideA() {
        return sideA;
    }
    //Generate Setter
    public void setSideCube(int sideA) {
        this.sideA = sideA;
    }
    //Volume Method1
    //@param sideA
    public double getVolume(){
        return Math.pow(this.getSideA(),3);
    }
    //Area Method2
    //@param sideA
    public double getArea(){
        return 6 * Math.pow(this.getSideA(),2);
    }
    //Length Method3
    //@param sideA
    public double getLength(){
        return 12 * this.getSideA();
    }
    //Diagonal Method4
    //@param sideA
    public double getDiagonalCube(){
        return this.getSideA() * Math.sqrt(3);
    }
    //Radius Method5
    //@param sideA
    public double getRadiusSphereInCube(){
        return this.getSideA()/2;
    }
    //To Strtig() Method
    @Override
    public String toString() {
        return "Cube{" +
                " sideCube=" + this.getSideA() +
                " volume=" + this.getVolume() +
                " area=" + this.getArea() +
                " length=" + this.getLength()+
                " diagonal=" + this.getDiagonalCube() +
                " radius=" + this.getRadiusSphereInCube()+
                '}';
    }
//Equals Method

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cube)) return false;
        Cube cube = (Cube) o;
        return getSideA() == cube.getSideA();
    }
    //HashCode Method
    @Override
    public int hashCode() {
        return Objects.hash(getSideA());
    }
}