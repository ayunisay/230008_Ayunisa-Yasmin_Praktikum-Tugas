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
public class DataMahasiswa {
    
    //untuk menentukan nilai yang akan keluar 
    public static char setNilai(double nilaiA) {
        switch ((int) nilaiA) { // percabangan untuk menentukan nilai angka yang didapat
            case 8:
                return 'A';
            case 7:
                return 'B';
            case 6:
                return 'C';
            case 5:
                return 'D';
            default:
                return 'E';
        }
    }

    //untuk menentukan keterangan yang didapat
    public static String setKet(char nilai) {
        switch (nilai) {//percabangann untuk menentukan keterangan
            case 'A':
                return "ISTIMEWA";
            case 'B':
                return "BAIK";
            case 'C':
                return "CUKUP";
            case 'D':
                return "KURANG";
            default:
                return "KURANG SEKALI";
        }
    }

    public static void main(String[] args) {
        
        //menginisialisasi scanner menjadi scan
        Scanner scan  = new Scanner(System.in);
        
        System.out.println("\n--Masukkan Biodata Anda--");
        System.out.print("\nMasukkan NPM Anda: ");//meminta user untuk menginput data
        String npm = scan.nextLine();//menyimpan nilai yang sudah diinput kedalam npm
        System.out.print("Masukkan Nama Anda: ");//meminta user untuk menginput data
        String nama = scan.nextLine();//menyimpan nilai yang sudah diinput kedalam nama
        System.out.print("Masukkan Nilai Kehadiran: ");//meminta user untuk menginput data
        int nilaiK = scan.nextInt();//menyimpan nilai yang sudah diinput kedalam nilaiK
        System.out.print("Masukkan Nilai Tugas: ");//meminta user untuk menginput data
        int nilaiT = scan.nextInt();//menyimpan nilai yang sudah diinput kedalam nilaiT
        System.out.print("Masukkan Nilai UTS: ");//meminta user untuk menginput data
        int nilaiUts = scan.nextInt();//menyimpan nilai yang sudah diinput kedalam nilaiUts
        System.out.print("Masukkan Nilai UAS: ");//meminta user untuk menginput data
        int nilaiUas = scan.nextInt();//menyimpan nilai yang sudah diinput kedalam nilaiUas
                
        //untuk menghitung nilai akhir
        double nilaiA = (0.1 * nilaiK) + (0.2 * nilaiT) +(0.3 * nilaiUts) + (0.4 * nilaiUas);
        
        // untuk menampung nilai dan keterangan yang didaptkan
        char nilai = setNilai(nilaiA);
        String keterangan = setKet(nilai);

        
        System.out.println("\n-- DATA MAHASISWA --");
        System.out.println("NPM Mahasiswa: "+npm);//print npm yang sudah didapatkan
        System.out.println("Nama Mahasiswa: "+nama);//print nama yang sudah didapatkan
        System.out.println("Nilai Akhir : "+nilaiA);//print bilai akhir yang sudah didapatkan
        System.out.println("Nilai: " + nilai);//print nilai anngka yang sudah didapatkan
        System.out.println("Keterangan: " + keterangan);//print keterangan yang sudah didapatkan
        
  
    }
}
