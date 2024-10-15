/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan7;
/**
 *
 * @author User
 */
public class bilangan_prima {
    public static void main(String[] args) {
        System.out.println("--- Deret Bilangan dari 0 sampai 20 ---");

        // Menggunakan perulangan for
        System.out.println("\nMenggunakan perulangan for:");
        for (int i = 0; i <= 20; i++) {
            if (prima(i)) {
                System.out.print(i + " (Prima)\n");
            } else {
                System.out.print(i + " (Bukan Prima)\n");
            }
        }

        // Menggunakan perulangan while
        System.out.println("\n\nMenggunakan perulangan while:");
        int j = 0;
        while (j <= 20) {
            if (prima(j)) {
                System.out.print(j + " (Prima)\n");
            } else {
                System.out.print(j + " (Bukan Prima)\n");
            }
            j++;
        }

        // Menggunakan perulangan do-while
        System.out.println("\n\nMenggunakan perulangan do-while:");
        int k = 0;
        do {
            if (prima(k)) {
                System.out.print(k + " (Prima)\n");
            } else {
                System.out.print(k + " (Bukan Prima)\n");
            }
            k++;
        } while (k <= 20);
    }

    // Fungsi untuk memeriksa apakah suatu bilangan adalah prima
    public static boolean prima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}