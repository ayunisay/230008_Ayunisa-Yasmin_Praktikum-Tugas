/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author User
 */
public class employee {
    private String name;
    private double salary;
    
    protected employee(String name, double salary){
    this.name = name;
    this.salary = salary;
    }
    protected String getDetails(){
    return "name : "+name+"\nsalary : "+salary;
    }
    public void cetak(){
    System.out.println("Percobaan di Class Employee");
    }
}
