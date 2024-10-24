package Model.Class_User;

import java.util.ArrayList;

public class Matkulambil {
    private Matakuliah ambil;
    private ArrayList<Presensi> listPresensi = new ArrayList<>();
    private double n1;
    private double n2;
    private double n3;
    
    public Matkulambil(Matakuliah ambil, ArrayList<Presensi> listPresensi, double d, double n2, double n3) {
        this.ambil = ambil;
        this.listPresensi = listPresensi;
        this.n1 = d;
        this.n2 = n2;
        this.n3 = n3;
    }

    public Matakuliah getAmbil() {
        return ambil;
    }

    public void setAmbil(Matakuliah ambil) {
        this.ambil = ambil;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }
    
    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
}
