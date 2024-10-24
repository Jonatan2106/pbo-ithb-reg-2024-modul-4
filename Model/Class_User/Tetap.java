package Model.Class_User;

import java.util.ArrayList;

class Tetap extends Dosen{
    private int salary;

    public Tetap(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nik, String departemen,
            ArrayList<Matkulajar> matkulDiajar, int salary) {
        super(nama, alamat, tempatTanggalLahir, noTelp, nik, departemen, matkulDiajar);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}