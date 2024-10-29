package lat_pertemuan8;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        // Data barang yang tersedia
        final String[] DAFTAR_KODE = {"A001", "A002", "A003"};
        final String[] DAFTAR_NAMA = {"Buku", "Pensil", "Pulpen"};
        final int[] DAFTAR_HARGA = {3000, 4000, 5000};
        
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("=======================");
        
        // Input jumlah item
        int jumlahItem;
        do {
            System.out.print("Masukkan Item Barang  : ");
            while (!masukan.hasNextInt()) {
                System.out.println("Mohon masukkan angka yang valid!");
                System.out.print("Masukkan Item Barang  : ");
                masukan.next();
            }
            jumlahItem = masukan.nextInt();
            if (jumlahItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0!");
            }
        } while (jumlahItem <= 0);
        
        // Inisialisasi array
        String[] kodeBarang = new String[jumlahItem];
        String[] namaBarang = new String[jumlahItem];
        int[] hargaBarang = new int[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] totalBayar = new int[jumlahItem];
        
        // Input data barang
        for (int i = 0; i < jumlahItem; i++) {
            boolean barangDitemukan = false;
            
            do {
                System.out.println("\nData ke " + (i + 1));
                System.out.print("Masukkan Kode         : ");
                kodeBarang[i] = masukan.next().toUpperCase();
                
                // Cek kode barang
                for (int j = 0; j < DAFTAR_KODE.length; j++) {
                    if (kodeBarang[i].equals(DAFTAR_KODE[j])) {
                        namaBarang[i] = DAFTAR_NAMA[j];
                        hargaBarang[i] = DAFTAR_HARGA[j];
                        barangDitemukan = true;
                        break;
                    }
                }
                
                if (!barangDitemukan) {
                    System.out.println("Kode barang tidak ditemukan! Silakan masukkan kode yang valid.");
                }
            } while (!barangDitemukan);
            
            // Input jumlah beli
            do {
                System.out.print("Masukkan Jumlah Beli  : ");
                while (!masukan.hasNextInt()) {
                    System.out.println("Mohon masukkan angka yang valid!");
                    System.out.print("Masukkan Jumlah Beli  : ");
                    masukan.next();
                }
                jumlahBeli[i] = masukan.nextInt();
                if (jumlahBeli[i] <= 0) {
                    System.out.println("Jumlah beli harus lebih dari 0!");
                }
            } while (jumlahBeli[i] <= 0);
            
            totalBayar[i] = hargaBarang[i] * jumlahBeli[i];
        }
        
        // Cetak struk
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("======================");
        System.out.println("No  Kode Barang  Nama Barang  Harga    Jumlah Beli  Jumlah Bayar");
        System.out.println("=================================================================");
        
        int totalHarga = 0;
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-3d %-12s %-12s %-8d %-12d %-12d%n",
                    (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], totalBayar[i]);
            totalHarga += totalBayar[i];
        }
        
        System.out.println("=================================================================");
        System.out.printf("Total Bayar%45d%n", totalHarga);
        System.out.println("=================================================================");
        
        masukan.close();
    }
}