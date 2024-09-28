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
public class SalamKenal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = masukan.nextLine();
        System.out.println("Haii, Salam Kenal yaa "+ nama +"!!");
    }
    
}
 