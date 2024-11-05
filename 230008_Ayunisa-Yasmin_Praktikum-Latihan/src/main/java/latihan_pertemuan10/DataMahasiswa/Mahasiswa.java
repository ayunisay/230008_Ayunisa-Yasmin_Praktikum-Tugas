/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan10.DataMahasiswa;
// selamat datang di sistem perhitungan mahasiswa
/**
 *
 * @author 
 */
// clss mahasiswa yang didalamnya terdapat variabel yang dibutuhkan
public class Mahasiswa {
    public String nim, nama, alamat, matkul;
    public double nilai1, nilai2, nilai3, nilai4, nilai5;

    //kosntraktor mahasiswa
    public Mahasiswa(String nim, String nama, String alamat, String matkul, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.matkul = matkul;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }
    // mengambil nim
    public String getNIM() {
        return nim;
    }

    // mengambil nama
    public String getNama() {
        return nama;
    }

    // mengambil alamat
    public String getAlamat() {
        return alamat;
    }
    
    // mengambil matakuliah
    public String getMataKuliah() {
        return matkul;
    }
    
    // mengambil nilai1
    public double getNilai1() {
        return nilai1;
    }
    
    // mengambil nilai2
    public double getNilai2() {
        return nilai2;
    }
    
    // mengambil nilai3
    public double getNilai3() {
        return nilai3;
    }
    
    // mengambil nilai4
    public double getNilai4() {
        return nilai4;
    }
    
    // mengambil nilai5
    public double getNilai5() {
        return nilai5;
    }
    
    // menghitung nilai akhir dengan mengambil semua nilai
    public double getNilaiAkhir() {
        return (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35);
    }
}
