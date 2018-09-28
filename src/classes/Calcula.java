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
      
    public Double calcularAnguloX(double x , double y) {
       return Math.toDegrees(Math.acos(Math.toRadians((Math.pow(x, 2) + Math.pow(y, 2) - Math.pow(braco1, 2) - Math.pow(braco2, 2)))/
               (2*braco1*braco2))); 
    }
    
    public Double calcularAnguloY(double x , double y) {
       return Math.toDegrees(Math.asin(Math.toRadians((y * (braco1 + braco2 * Math.toRadians(calcularAnguloX(x, y))) - x*braco2*Math.sqrt(1 - Math.pow(Math.toRadians(calcularAnguloX(x, y)), 2 ))) / (Math.pow(x, 2) + Math.pow(y, 2))))); 
    }
    
}
