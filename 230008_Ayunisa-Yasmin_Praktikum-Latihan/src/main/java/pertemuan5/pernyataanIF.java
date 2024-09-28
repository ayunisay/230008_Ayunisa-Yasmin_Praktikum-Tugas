/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author User
 */
public class pernyataanIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diskon =0, totalBelanja = 500000;
        
        if(totalBelanja>= 50000){
        diskon = totalBelanja/10;
        }else if(totalBelanja < 50000 && totalBelanja >= 30000){ 
            diskon = totalBelanja/20;
        }
        System.out.println("Diskon = " + diskon);
    }
    
}
