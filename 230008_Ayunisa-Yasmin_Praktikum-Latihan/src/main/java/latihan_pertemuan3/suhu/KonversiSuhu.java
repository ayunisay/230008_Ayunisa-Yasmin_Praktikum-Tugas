/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan3.suhu;

/**
 *
 * @author User
 */
public class KonversiSuhu {
    //method untuk mengubah celcius ke fareinheit
    public void celciusToFahrenheit(double a){
        double cf = (9.0 / 5.0) * a + 32;
        System.out.println("40 Celcius= " + cf +" Fahreinheit");
    }
    //method untuk mengubah celcius ke reamur
    public void celciusToReamur(double a){
        double cr = (4.0 / 5.0) * a;
        System.out.println("50 Celcius= " +cr+ " Reamur");
    }
    
}
