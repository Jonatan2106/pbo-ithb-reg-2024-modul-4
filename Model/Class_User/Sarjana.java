package Model.Class_User;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<Matkulambil> listMatakuliah = new ArrayList<>();

    public Sarjana(){

    }
    
    public Sarjana(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nim, String nama2,
            ArrayList<Matkulambil> listMatakuliah) {
        super(nama, alamat, tempatTanggalLahir, noTelp, nim, nama2);
        this.listMatakuliah = listMatakuliah;
    }

    public ArrayList<Matkulambil> getListMatakuliah() {
        return listMatakuliah;
    }

    public void setListMatakuliah(ArrayList<Matkulambil> listMatakuliah) {
        this.listMatakuliah = listMatakuliah;
    }

    @Override
    public String toString(){
        return super.toString() + "\nList Mata Kuliah : " + getListMatakuliah();
    }
}
