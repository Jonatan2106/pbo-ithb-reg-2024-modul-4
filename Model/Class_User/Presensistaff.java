package Model.Class_User;

import java.time.LocalTime;
import java.util.Date;
import Model.Class_Enum.*;

public class Presensistaff {
    private Date tanggal;
    private Status status;
    private LocalTime waktu;
    
    public Presensistaff(Date tanggal, Status status, LocalTime localTime) {
        this.tanggal = tanggal;
        this.status = status;
        this.waktu = localTime;
    }
    
    public Date getTanggal() {
        return tanggal;
    }
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public LocalTime getWaktu() {
        return waktu;
    }
    public void setWaktu(LocalTime waktu) {
        this.waktu = waktu;
    }
}
