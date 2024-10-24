package Model.Class_User;

import java.util.ArrayList;

public class Matkulajar {
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
}