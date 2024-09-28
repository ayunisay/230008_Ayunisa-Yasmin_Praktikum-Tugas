/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author User
 */
public class view {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee em = new employee("Dilan", 4000000);
        manager mn = new manager("Milea", 5000000, "Marketing");
        System.out.println("Data Employee : \n"+em.getDetails());
        em.cetak();
        System.out.println("\nData Manager : \n"+mn.getDetails());
        mn.cetak();
    }
    
}
