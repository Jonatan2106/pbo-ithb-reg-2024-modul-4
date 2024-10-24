package Model.Class_User;

import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<Matkulambil> listMatKul = new ArrayList<>();
    private String judulTesis;

    public Magister(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nim, String nama2,
            ArrayList<Matkulambil> matkulMagister, String judulTesis) {
        super(nama, alamat, tempatTanggalLahir, noTelp, nim, nama2);
        this.listMatKul = matkulMagister;
        this.judulTesis = judulTesis;
    }

    public ArrayList<Matkulambil> getListMatKul() {
        return listMatKul;
    }

    public void setListMatKul(ArrayList<Matkulambil> listMatKul) {
        this.listMatKul = listMatKul;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    public String toString(){
        return super.toString() + "\nList Matkul : " + getListMatKul() + "\nJudul Tesis : " + getJudulTesis();
    }
}
