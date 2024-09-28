/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author User
 */
public interface lampu {
    public static final int Keadaan_hidup = 1;
    public static final int Keadaan_mati = 0;
    public abstract  void hidupkan();
    public abstract  void matikan();
}
