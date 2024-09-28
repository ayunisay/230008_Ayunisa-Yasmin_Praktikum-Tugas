package pertemuan2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class persegi_panjang {
    int panjang, lebar;
    
    //konstruktor
    public persegi_panjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void info(){
        System.out.println("Panjang persegi: " + panjang);
        System.out.println("Lebar persegi: " + lebar);
        System.out.println("panjang x lebar: " + lebar * panjang);
    }
}
