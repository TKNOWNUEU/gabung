/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

/**
 *
 * @author GESIT
 */
public class kalab extends dosen {
    private String laboratorium;
    
    //inisisalisasi
    kalab(String namaX, String nikX, String jurX, String labX){
        super(namaX, nikX, jurX);
        laboratorium = labX;
    }
    
    //menampilakn informasi
    public void viewKalab(){
        System.out.println("Laboratirum     : " + laboratorium);
    }
}
