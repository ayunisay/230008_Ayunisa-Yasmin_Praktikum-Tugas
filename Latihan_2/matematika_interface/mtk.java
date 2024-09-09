/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum2;

/**
 *
 * @author User
 */
public class mtk implements matematika2 {
    int a,b;
    
    @Override
    public void pertambahan(int a, int b) {
        int jumlah = a+b;
        System.out.println("Pertambahan: 20+10= " +jumlah);
    }

    @Override
    public void pengurangan(int a, int b) {
        int kurang = a-b;
        System.out.println("Pengurangan: 10-5= " +kurang);
    }

    @Override
    public void perkalian(int a, int b) {
        int kali = a*b;
        System.out.println("Perkalian: 10*3= " +kali);
    }

    @Override
    public void pembagian(int a, int b) {
        int bagi = a/b;
        System.out.println("Pembagian: 21/2= " +bagi);
    }
    
}
