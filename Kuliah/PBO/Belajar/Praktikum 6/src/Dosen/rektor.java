/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dosen;

/**
 *
 * @author GESIT
 */
public class rektor extends dosen{
    private int th_mulai;
    private int jabatan_ke;
    
    //inisalisasi
    rektor(String namaX, String nikX, String jurX, int thX, int keX){
        super(namaX, nikX, jurX);
        th_mulai = thX;
        jabatan_ke = keX;
    }
    
    //Menampilkan informasi
    public void viewRektor(){
        System.out.println("Th mulai jabatan    : " + th_mulai);
        System.out.println("Jabatan rektor ke-  : " + jabatan_ke);
    }
    
    /**
     * @return the th_mulai
     */
    public int getTh_mulai() {
        return th_mulai;
    }

    /**
     * @param th_mulai the th_mulai to set
     */
    public void setTh_mulai(int th_mulai) {
        this.th_mulai = th_mulai;
    }

    /**
     * @return the jabatan_ke
     */
    public int getJabatan_ke() {
        return jabatan_ke;
    }

    /**
     * @param jabatan_ke the jabatan_ke to set
     */
    public void setJabatan_ke(int jabatan_ke) {
        this.jabatan_ke = jabatan_ke;
    }
    
}
