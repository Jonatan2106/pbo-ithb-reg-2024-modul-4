package Model.Class_User;

import java.util.ArrayList;

class Honorer extends Dosen{
    private int honorPerSKS;
    
    public Honorer(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nik, String departemen,
            ArrayList<Matkulajar> matkulDiajar, int honorPerSKS) {
        super(nama, alamat, tempatTanggalLahir, noTelp, nik, departemen, matkulDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

}