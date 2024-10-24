package Model.Class_User;

public class Matkulpilihan extends Matakuliah {
    private int jumlahMinMahasiswa;

    public Matkulpilihan(String kode, int sks, String nama, int jumlahMinMahasiswa) {
        super(kode, sks, nama);
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    public int getJumlahMinMahasiswa() {
        return jumlahMinMahasiswa;
    }

    public void setJumlahMinMahasiswa(int jumlahMinMahasiswa) {
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    public String toString(){
        return super.toString() + "\nJumlah minimal mahasiswa : " + getJumlahMinMahasiswa();
    }

}
