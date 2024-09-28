/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class nilaiIFeLSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        int skorUjian= scan.nextInt(); 
        char nilai;
        
        if (skorUjian >= 90) {
         nilai = 'A';
        } else if (skorUjian >= 80) {
         nilai = 'B';
        } else if (skorUjian >= 70) {
         nilai = 'C';
        } else {
         nilai = 'D';
        }
        
        System.out.println("Nilai = " + nilai);
    }
    
}
