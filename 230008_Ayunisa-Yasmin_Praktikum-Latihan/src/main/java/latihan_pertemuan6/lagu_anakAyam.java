/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan6;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class lagu_anakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah;//deklarasi variabel
        Scanner scan = new Scanner(System.in);//membuat objek baru dengan nama scan
        
        //membuat input untuk jumlah ayam yg diinginkan
        System.out.print("Masukkan jumlah anak ayam: ");
        jumlah = scan.nextInt();//disimpan dalam jumlah
        
        System.out.println("\ntek kotek kotek kotek, anak ayam turun berkotek");
        //perulangan untuk mengulang nilai 
        for (int i=jumlah; i>1; i--){
            System.out.print("Anak ayam turunlah " +jumlah);
            jumlah = i-1;//jumlah anak ayam dikurangi 1
            System.out.println(", Mati satu tinggalah " +jumlah);
        }
        System.out.println("Anak ayam turunlah 1, Mati satu tinggalah induknya");
    }
    
}
