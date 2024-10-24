package Model.Class_User;

import Model.Class_Interface.Action;

public class Matakuliah implements Action{
    private String kode;
    private int sks;
    private String nama;

    public Matakuliah(){

    }
    
    public Matakuliah(String kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }
    
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public int getSks() {
        return sks;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString(){
        return "Kode : " + getKode() + "\nSks : " + getSks() + "\nNama : " + getNama(); 
    }
    
}
