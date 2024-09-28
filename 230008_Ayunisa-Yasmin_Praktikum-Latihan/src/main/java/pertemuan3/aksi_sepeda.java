/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author User
 */
public class aksi_sepeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sepedaGunung spd = new sepedaGunung();
        
        spd.setGir(5);
        System.out.println(spd.getGir());
        spd.setSadel(10);
        System.out.println(spd.getSadel());
    }
    
}
