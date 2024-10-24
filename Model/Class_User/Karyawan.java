package Model.Class_User;

public class Karyawan extends Staff {
    private int salary;
    private String listPresensiStaff;
    
    public Karyawan(String nama, String alamat, String tempatTanggalLahir, String noTelp, String nik, int salary,
            String listPresensiStaff) {
        super(nama, alamat, tempatTanggalLahir, noTelp, nik);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }
    
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getListPresensiStaff() {
        return listPresensiStaff;
    }
    public void setListPresensiStaff(String listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    public String toString(){
        return super.toString() + "\nSalary : " + getSalary() + "\nList Presensi Staff : " + getListPresensiStaff();
    }
}
