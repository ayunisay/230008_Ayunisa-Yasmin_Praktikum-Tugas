/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author User
 */
public class circle {
       double x, y, r;
       //apabila tipe data nya sama maka harus di jelaskan klo masing" variable adalah itu
       
       //konstruktor 
       //overloading
       public circle(double x, double y, double r){
           this.x=x;
           this.y=y;
           this.r=r;
       }
       public circle(double x, double y){
           this.x=x;
           this.y=y;
           r=1;
       }
       //perhitungan lingkaran 1
       public double kl(){
           return 2*3.14*r;
       }
       //perhitungan lingkaran 2
       public double luas(){
           return 3.14*r*r;
       }
    
}
