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
public class satuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan NPM Anda: ");
        String npm = scan.nextLine();
        
        System.out.println("\nNama Anda: "+ nama);
        System.out.println("NPM Anda: "+ npm);
    }
    
}
