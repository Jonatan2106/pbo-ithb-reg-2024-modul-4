package Model.Class_User;

import java.util.Date;

import Model.Class_Interface.Action;

public class Presensi implements Action{
    private Date tanggal;
    private int status;

    public Presensi(){

    }
    
    public Presensi(Date tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String toString(){
        return "Tanggal: " + getTanggal() + "\nStatus: " + getStatus();
    }
}
