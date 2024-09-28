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
public class swit_ch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan pilihan: ");
        int pilihan = scan.nextInt();
        
        switch(pilihan){
        case 1:
            System.out.println("Soto Ayam");
        break;
        case 2:
            System.out.println("GuleKambing");
        break;
        case 3:
            System.out.println("NasiGoreng");
        break;
        default:
            System.out.println("SilakanPilih 1, 2 atau 3");
        }
    }
    
}
