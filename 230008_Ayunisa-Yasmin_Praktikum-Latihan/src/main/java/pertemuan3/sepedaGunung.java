/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author User
 */
public class sepedaGunung extends sepeda{
    private int sadel;
    void setSadel(int jumlah){
        sadel = getGir()-jumlah;
    }
    
    int getSadel(){
        return sadel;
    }
}
