/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan6;

/**
 *
 * @author User
 */
public class bilangan_GanjilGenap {
    public static void main(String[] args) {
        System.out.println("Deret Bilangan dari 0 sampai 20:");
        
        System.out.println("\n\nBilangan Genap: ");
        //perulangan akan trus berlanjut apabilanilai masih kurang dari sama dengan 20
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0){//akan memerikasa apakah i habis dibagi 2, jika habis dibagi 2 maka bilang tersebut adalah genap
                System.out.println(i+" ");
            }
        }
        System.out.println("\n\nBilangan Ganjil: ");
        //perulangan akan trus berlanjut apabilanilai masih kurang dari sama dengan 20
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0){//akan memerikasa apakah i tidak habis dibagi 2, jika tidak habis dibagi 2 maka bilang tersebut adalah ganjil
                System.out.println(i+" ");
            }
        }
    }
}
