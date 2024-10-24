package Model.Class_User;

public abstract class Mahasiswa extends User {
    private String nim;
    private String nama;

    public Mahasiswa(){

    }

    public Mahasiswa(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nim, String nama2) {
        super(nama, alamat, tempatTanggalLahir, noTelp);
        this.nim = nim;
        this.nama = nama2;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNIM : " + getNim() + "\nNama : " + getNama();
    }
}
