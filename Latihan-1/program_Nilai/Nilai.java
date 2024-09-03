//class nilai
public class Nilai {
    //deklarasi variabel
    String nim;
    String nama;
    double nilai_absen;
    double nilai_tugas;
    double nilai_uts;
    double nilai_uas;

    // method nilai
    public Nilai(String NIM, String nama, double nilai_absen, double nilai_tugas, double nilai_uts, double nilai_uas) {
        this.nim = NIM;
        this.nama = nama;
        this.nilai_absen = nilai_absen;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_uas = nilai_uas;
    }

    // Method untuk menampilkan nilai
    public void CetakNilai() {
        double nilaiAkhir = (nilai_absen * 0.1) + (nilai_tugas * 0.2) + (nilai_uts * 0.3) + (nilai_uas * 0.4);
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen[10%] : " + nilai_absen);
        System.out.println("Nilai Tugas [20%] : " + nilai_tugas);
        System.out.println("Nilai UTS [30%] : " + nilai_uts);
        System.out.println("Nilai UAS [40%] : " + nilai_uas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
