/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_pertemuan3.matematika;

/**
 *
 * @author User
 */
public class matematika_inheritance{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //memanggil class matematika2 diubah menjadi mtk
        matematika2 mtk = new matematika2();
        
        //memanggil method yang ada di class matematika dan matematika2
        mtk.modulus(59, 5);
        mtk.pertambahan(40, 5);
        mtk.pengurangan(30,5);
        mtk.perkalian(20, 5);
        mtk.pembagian(100, 5);
    }
    
}
