/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan3.suhu;

/**
 *
 * @author User
 */
//mewarisi class konversisuhu
public class KonversiSuhu2 extends KonversiSuhu {
    //method untuk mengubah fahrenheit ke reamur
    public void fahrenheitToReamur(double a){
        double cr = (4.0 / 9.0) * (a - 32);
        System.out.println("212 Fahrenhait= " +cr+ " Reamur");
    }
}
