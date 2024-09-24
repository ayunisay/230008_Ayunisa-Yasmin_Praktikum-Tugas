/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan4;

/**
 *
 * @author User
 */
public class balok extends kubus{
    private int l;
    private int t;

    // konstruktor denga parameter
    public balok(int s, int l, int t) {
        super(s);//diambil dari class kubus
        this.l = l;
        this.t = t;
    }
    //overriding dari kubus
    @Override
    public int volume(){
        return s*l*t;
    }
    //overriding dari kubus
    @Override
    public int luas(){
        return 2*s*l + 2*s*t + 2*l*t;
    }
}
