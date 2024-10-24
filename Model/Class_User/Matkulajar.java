package Model.Class_User;

import java.util.ArrayList;

import Model.Class_Interface.Action;

public class Matkulajar implements Action{
    private Matakuliah diajar;
    private ArrayList<Presensistaff> ngajar = new ArrayList<>();
    
    public Matkulajar(Matakuliah diajar, ArrayList<Presensistaff> ngajar) {
        this.diajar = diajar;
        this.ngajar = ngajar;
    }

    public Matakuliah getDiajar() {
        return diajar;
    }

    public void setDiajar(Matakuliah diajar) {
        this.diajar = diajar;
    }

    public ArrayList<Presensistaff> getNgajar() {
        return ngajar;
    }

    public void setNgajar(ArrayList<Presensistaff> ngajar) {
        this.ngajar = ngajar;
    }

    public String toString(){
        return "\nMatkulajar diajar=" + getDiajar() + " \nNgajar : " + getNgajar(); 
    }
}