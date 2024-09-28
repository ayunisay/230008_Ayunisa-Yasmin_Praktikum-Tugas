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
public class hitung_bb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String berat;//deklarasi variabel berat untuk menampung nilai berat
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n--PERHITUNGAN BERAT BADAN--");//print judul program
        System.out.print("\nMasukkan Berat Badan Anda: ");//meminta user untuk menginput data
        double bb = scan.nextDouble();//menyimpan input didalm bb
        System.out.print("\nMasukkan Tinggi Badan Anda: ");//meminta user untuk menginput data
        double tt = scan.nextDouble();//menyimpan input didalm bb
        
        double hitung = bb/tt*tt;//perhitungan 
                
        //percabangan untuk menentukan keterangan yang dikeluarkan
        if(hitung >= 40){
            berat = "Sangat Gemuk";
        }else if(hitung >= 30){
            berat = "Gemuk";
        }else if(hitung >= 25){
            berat = "Berat Badan Lebih";
        }else if(hitung >= 18.5){
            berat = "Berat Badan Ideal";
        }else{
            berat = "Barat Badan Kurang";
        }
        System.out.println("Keterangan: "+berat);//print untuk menampilkan keterangan yang didapat
    }
    
}
