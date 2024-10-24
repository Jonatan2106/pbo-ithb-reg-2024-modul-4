package Model.Class_User;

public abstract class Staff extends User {
    private String nik;

    public Staff(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nik) {
        super(nama, alamat, tempatTanggalLahir, noTelp);
        this.nik = nik;
    }

    public String getNik(){
        return nik;
    }

    public void setNik(String nik){
        this.nik = nik;
    }
}
