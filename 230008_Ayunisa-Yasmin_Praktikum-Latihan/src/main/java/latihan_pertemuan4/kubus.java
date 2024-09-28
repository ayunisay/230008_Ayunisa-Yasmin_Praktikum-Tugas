/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan4;

/**
 *
 * @author User
 */
public class kubus {
//deklarasi variabel
int s;
double a;

//konstruktor 1
    public kubus(int s){
        this.s=s;
    }
    //overloading
    public kubus(double a){
        this.a=a;
    }
    //perhitungan 1
    public int volume(){
        return s*s*6;
    }
    //perhitungan 1
    public int luas(){
        return s*s*s;
    }
    //perhitungan 2 overloading
    public double volume2(){
        return a*a*6;
    }
    //perhitungan 2 overloading
    public double luas2(){
        return a*a*a;
    }
}
