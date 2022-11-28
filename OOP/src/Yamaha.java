/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gefy
 */
public class Yamaha {
    public static void main (String[]args){
        SepedaMotor motor= new SepedaMotor ();
        motor.InputMerk("Yamaha");
        System.out.println("Merk motor ini adalah "+motor.tampilMerk());
    }
}
