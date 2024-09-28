/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan5;

//import scanner
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int potongan;//deklarasi variabel untuk menampunng nilai diskon yang diberikan
        
        Scanner scan = new Scanner(System.in);//inisialisasi scanner
        System.out.println("\n--PERHITUNGAN PEMBELIAN--");//print judul program
        System.out.print("\nTotal pembelian: Rp. ");//meminta user untuk menginput data
        int jumlah = scan.nextInt();//menyimpan input didalam jumlah
        
        //percabangan untuk menentukan diskon
        if(jumlah >= 50000){
            potongan = jumlah / 5;
        }else{
            potongan = jumlah / 20;
        }
        //perhitungan total yang harus dibayarkan yang ditampung dalam variabel hitung
        int hitung = jumlah - potongan;
        
        //print untuk menampilkan diskon yang didapatkan
        System.out.println("Besarnya Potongan Rp. "+potongan);
        //print untuk menampilkan jumlah yang harus dibayar
        System.out.println("Jumlah yang harus dibayarkan "+hitung);

        
    }
    
}
