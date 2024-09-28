/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan4;

/**
 *
 * @author User
 */
public class aksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //memanggil class kubus dan balok trus mengubah namanya dengan nama baru dan memberi nilai parameternya
        kubus kbs = new kubus(6);
        kubus kbs2 = new kubus(8);
        balok blk = new balok(5,4,3);
        
        //hasil perhitungan 1
        System.out.println("--PERHITUNGAN KUBUS 1--");
        System.out.println("Volume Kubus: " + kbs.volume());
        System.out.println("Luas_Permukaan Kubus: " + kbs.luas());
        
        //hasil perhitungan 2 overloading
        System.out.println("\n--PERHITUNGAN KUBUS 2--");
        System.out.println("Volume Kubus: " + kbs2.volume());
        System.out.println("Luas_Permukaan Kubus: " + kbs2.luas());
        
        //hasil perhitungan 1 balok
        System.out.println("\n--PERHITUNGAN BALOK--");
        System.out.println("Volume Balok: " + blk.volume());
        System.out.println("Luas_Permukaan Balok: " +blk.luas());
    }
    
}
