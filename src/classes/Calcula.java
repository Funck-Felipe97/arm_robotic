/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.lang.Math;

/**
 *
 * @author a1743953
 */
public class Calcula {

    public double braco1 = 13.0;
    public double braco2 = 10.0;

    public Double calcularX(double anguloA, double anguloB) {
        return (braco1 * Math.cos(anguloA) + braco2 * Math.cos(anguloA + anguloB));
    }

    public Double calcularY(double anguloA, double anguloB) {
        return (braco1 * Math.sin(anguloA) + braco2 * Math.sin(anguloA + anguloB));
    }

    public Double calcularAnguloX(double x, double y) {
        Double p1 = (Math.pow(x, 2) + Math.pow(y, 2) - Math.pow(braco1, 2) - Math.pow(braco2, 2));
        Double p2 = (2 * braco1 * braco2);
        return Math.toDegrees(Math.acos(p1 / p2));
    }

    public Double calcularAnguloY(double x, double y) {
        Double p1 = (Math.pow(x, 2) + Math.pow(y, 2) - Math.pow(braco1, 2) - Math.pow(braco2, 2));
        Double p2 = (2 * braco1 * braco2);
        Double c = (p1 / p2);
        Double s2 = Math.sqrt((1 - Math.pow(c , 2)));
        
        Double t1 = (y * (braco1 + braco2*c) - x * braco2 * s2);
        Double t2 = (Math.pow(x, 2) + Math.pow(y, 2));
        return Math.toDegrees(Math.asin(t1 / t2));
    }

}
