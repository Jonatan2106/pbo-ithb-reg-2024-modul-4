package Model.Class_User;

import java.util.ArrayList;

public class Dosen extends Staff {
    private String departemen;
    private ArrayList<Matkulajar> matkulDiajar = new ArrayList<>();

    public Dosen(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nik, String departemen,
            ArrayList<Matkulajar> matkulDiajar) {
        super(nama, alamat, tempatTanggalLahir, noTelp, nik);
        this.departemen = departemen;
        this.matkulDiajar = matkulDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<Matkulajar> getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(ArrayList<Matkulajar> matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDepartemen : " + getDepartemen() + "\nMatkul Diajar : " + getMatkulDiajar();
    }
}
