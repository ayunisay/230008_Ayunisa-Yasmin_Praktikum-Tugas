/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan3.matematika;
//mengambil package dari latihan_2.matematika
import Latihan_2.matematika.*;
/**
 *
 * @author User
 */
//mewarisi class matematika dari package latihan_2.matematika
public class matematika2 extends matematika {
    //membuuat method modulus  dengan paarameter int a dan b
    public void modulus(int a, int b){
        //membuat wadah unntuk hasil modulus dari operasi modulus
        int kurang = a % b;
        System.out.println("Modulus: 59 % 5= " +kurang);
    }
    
}
