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
public class perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();
        System.out.print("Hasil perkalian: " +
        (bilangan1 * bilangan2));
    }
    
}
