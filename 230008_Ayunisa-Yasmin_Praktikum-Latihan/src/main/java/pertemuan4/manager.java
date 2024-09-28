/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author User
 */
public class manager extends employee {
    private String dept;
    public manager (String name, double salary, String dept){
    super (name, salary);
    this.dept = dept;
    }
    public String getDept(){
    return dept;
    }
    public String getDetails(){
    return super.getDetails()+"”\\nDepartment : "+getDept();
    }
    public void cetak(){
    System.out.println("Percobaan di Class Manager");
    }
}
