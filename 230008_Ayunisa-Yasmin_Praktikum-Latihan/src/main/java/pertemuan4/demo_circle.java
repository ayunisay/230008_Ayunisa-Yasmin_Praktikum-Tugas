/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author User
 */
public class demo_circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //memanggil class circle dan diubah nama method menjadi cl dan crl
        circle cl = new circle(2,3,5); //yang didalam kurung parameter
        circle crl = new circle(2,3);
        
        //sout memanggil method yang ada di class circle 
        System.out.println("Lingkaran Konstruktor 3 Parameter");
        System.out.println("Keliling Lingkaran : "+cl.kl());
        System.out.println("Luas Lingkaran : "+cl.luas());
        System.out.println("\nLingkaran Konstruktor 2 Parameter");
        System.out.println("Keliling Lingkaran : "+crl.kl());
        System.out.println("Luas Lingkaran : "+crl.luas());
        
    }
    
}
