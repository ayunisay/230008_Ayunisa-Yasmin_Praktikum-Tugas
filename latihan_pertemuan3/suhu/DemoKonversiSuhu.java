/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan3.suhu;

/**
 *
 * @author User
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //memanggil konversisuhu2 diubah menjadi ks
        KonversiSuhu2 ks = new KonversiSuhu2();
        
        //memanggil method yang ada di class konversisuhu dan konversi suhu2 yang diubah menajdi ks
        ks.celciusToFahrenheit(40);
        ks.celciusToReamur(40);
        ks.fahrenheitToReamur(212);
    }
    
}
