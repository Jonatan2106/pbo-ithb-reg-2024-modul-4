import java.sql.Date;
import java.time.LocalTime;
import java.util.ArrayList;

import Model.Class_Enum.Status;
import Model.Class_User.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Presensi> listPresensi1 = new ArrayList<>();
        Presensi presensi1 = new Presensi(Date.valueOf("2024-10-01"), 1); // Hadir
        Presensi presensi2 = new Presensi(Date.valueOf("2024-10-08"), 0); // Tidak Hadir
        Presensi presensi3 = new Presensi(Date.valueOf("2024-10-15"), 1); // Hadir
        listPresensi1.add(presensi1);
        listPresensi1.add(presensi2);
        listPresensi1.add(presensi3);

        ArrayList<Presensi> listPresensi2 = new ArrayList<>();
        presensi1 = new Presensi(Date.valueOf("2024-10-01"), 1); // Hadir
        presensi2 = new Presensi(Date.valueOf("2024-10-08"), 1); // Hadir
        presensi3 = new Presensi(Date.valueOf("2024-10-15"), 1); // Hadir
        listPresensi2.add(presensi1);
        listPresensi2.add(presensi2);
        listPresensi2.add(presensi3);
        
        Matakuliah matkul1 = new Matakuliah("IF-103", 3, "Pemrograman Berorientasi Objek");
        Matakuliah matkul2 = new Matakuliah("IF-104", 2, "Algoritma");
        Matakuliah matkulPil = new Matkulpilihan("IF-304", 2, "AI", 15);
        ArrayList<Matkulambil> matkulSarjana = new ArrayList<>();
        Matkulambil matkulAmbilSarjana1 = new Matkulambil(matkul1, listPresensi1, 80.5, 85.0, 90.0);
        Matkulambil matkulAmbilSarjana2 = new Matkulambil(matkul2, listPresensi2, 80, 88.0, 90.0);
        Matkulambil matkulAmbilSarjana3 = new Matkulambil(matkulPil, listPresensi2, 90, 90.0, 95.0);

        matkulSarjana.add(matkulAmbilSarjana1);
        matkulSarjana.add(matkulAmbilSarjana2);
        matkulSarjana.add(matkulAmbilSarjana3);

        ArrayList<Sarjana> mahasiswaSarjana = new ArrayList<>();
        Sarjana mahasiswaSarjana1 = new Sarjana("Boston", "Permata Biru", "Medan 2004-12-15", "081234567890", "1123039", "Informatika", matkulSarjana);
        Sarjana mahasiswaSarjana2 = new Sarjana("Jochal", "Dipatiukur", "Bandung 2004-09-17", "081234567891", "1123015", "Informatika", matkulSarjana);
        mahasiswaSarjana.add(mahasiswaSarjana1);
        mahasiswaSarjana.add(mahasiswaSarjana2);

        ArrayList<Matkulambil> matkulMagister = new ArrayList<>();
        Matakuliah matkul3 = new Matakuliah("IF-201", 3, "Jaringan Komputer");
        Matakuliah matkul4 = new Matakuliah("IF-202", 4, "Basis Data");
        Matakuliah matkul5 = new Matakuliah("IF-203", 2, "Sistem Operasi");
        Matkulambil matkulAmbilMagister1 = new Matkulambil(matkul3, listPresensi2, 80.5, 85.0, 90.0);
        Matkulambil matkulAmbilMagister2 = new Matkulambil(matkul4, listPresensi1, 80, 88.0, 90.0);
        Matkulambil matkulAmbilMagister3 = new Matkulambil(matkul5, listPresensi2, 80, 88.0, 90.0);
        matkulMagister.add(matkulAmbilMagister1);
        matkulMagister.add(matkulAmbilMagister2);
        matkulMagister.add(matkulAmbilMagister3);

        ArrayList<Magister> mahasiswaMagister = new ArrayList<>();
        Magister magister1 = new Magister("Calvin", "Jl. Aceh", "Bandung 2004-09-15", "082122221111", "112340", "Magister Informatika", matkulMagister, "ALOKASI MEMORI EKSTRA");
        Magister magister2 = new Magister("Felix", "Jl. Jakarta", "Medan 2004-08-29", "081234567891", "1123015", "Magister Informatika", matkulMagister, "ALGORITMA PENAWARAN EDGE PADA BIPARTITE GRAPH");
        mahasiswaMagister.add(magister1);
        mahasiswaMagister.add(magister2);

        ArrayList<Doktor> mahasiswaDoktor = new ArrayList<>();
        Doktor doktor1 = new Doktor("Dewi Kusuma", "Jl. Merdeka No. 10", "1990-05-15", "081234567890", "1124002", "Teknik Elektro", "Penerapan Deep Learning pada Pengolahan Sinyal", 90, 92, 91);
        Doktor doktor2 = new Doktor("Budi Santoso", "Jl. Sudirman No. 22", "1988-07-20", "081987654321", "1124002", "Teknik Elektro", "Penerapan Deep Learning pada Pengolahan Sinyal", 88, 92, 89);
        Doktor doktor3 = new Doktor("Siti Rahma", "Jl. Diponegoro No. 5", "1991-09-10", "081223344556", "1124003", "Teknik Mesin", "Simulasi Dinamika Fluida untuk Sistem Pendingin", 90, 87, 91);

        mahasiswaDoktor.add(doktor1);
        mahasiswaDoktor.add(doktor2);
        mahasiswaDoktor.add(doktor3);

        ArrayList<Presensistaff> presensiStaffs = new ArrayList<>();
        Date date1 = Date.valueOf("2024-10-01");
        Date date2 = Date.valueOf("2024-10-15");
        Date date3 = Date.valueOf("2024-10-20");

        Presensistaff presensiStaff1 = new Presensistaff(date1, Status.HADIR, LocalTime.of(9, 0)); // 9:00 AM
        Presensistaff presensiStaff2 = new Presensistaff(date2, Status.ALPHA, LocalTime.of(13, 30)); // 1:30 PM
        Presensistaff presensiStaff3 = new Presensistaff(date3, Status.HADIR, LocalTime.of(8, 45)); // 8:45 AM 

        presensiStaffs.add(presensiStaff1);
        presensiStaffs.add(presensiStaff2);
        presensiStaffs.add(presensiStaff3);

        ArrayList<Karyawan> karyawan = new ArrayList<>();
        Karyawan karyawan1 = new Karyawan("Ipnul", "Jl. Soekarno", "Jakarta 1985-11-12", "082112345671", "123456789", 3000000, "32014567891");
        Karyawan karyawan2 = new Karyawan("Joko", "Jl. Jalan", "Pontianak 1991-05-02", "082112345672", "23456789" ,2500000, "32023678912");
        Karyawan karyawan3 = new Karyawan("Budi", "Jl. Cipadung", "Aceh 1999-05-02", "082112345673", "3456789" ,2500000, "32032789123");
        karyawan.add(karyawan1);
        karyawan.add(karyawan2);
        karyawan.add(karyawan3);

        ArrayList<Matkulajar> matkulajars1 = new ArrayList<>();
        ArrayList<Matkulajar> matkulajars2 = new ArrayList<>();
        ArrayList<Matkulajar> matkulajars3 = new ArrayList<>();
        Matkulajar matkulajar1 = new Matkulajar(matkul1, presensiStaffs);
        Matkulajar matkulajar2 = new Matkulajar(matkul2, presensiStaffs);
        matkulajars1.add(matkulajar1);
        matkulajars1.add(matkulajar2);
        Matkulajar matkulajar3 = new Matkulajar(matkul3, presensiStaffs);
        matkulajars2.add(matkulajar3);
        Matkulajar matkulajar4 = new Matkulajar(matkul4, presensiStaffs);
        Matkulajar matkulajar5 = new Matkulajar(matkul5, presensiStaffs);
        matkulajars3.add(matkulajar4);
        matkulajars3.add(matkulajar5);

        ArrayList<Dosen> dosens = new ArrayList<>();
        Dosen dosen1 = new Dosen("Prof. Budi Santoso", "Jl. Diponegoro No. 5", "1965-03-12", "081234567890", "32014567891", "Teknik Informatika", matkulajars1);
        Dosen dosen2 = new Dosen("Dr. Siti Rahmawati", "Jl. Gatot Subroto No. 10", "1973-07-05", "081987654321", "32023678912", "Teknik Elektro", matkulajars2);               
        Dosen dosen3 = new Dosen("Dr. Ahmad Fauzi", "Jl. Sudirman No. 20", "1980-11-22", "081223344556", "32032789123", "Teknik Mesin", matkulajars3);
        dosens.add(dosen1);
        dosens.add(dosen2);
        dosens.add(dosen3);
        
        for (Mahasiswa mhsSarjana : mahasiswaSarjana) {
            String msg = mhsSarjana.toString();
            System.out.println(msg);
            System.out.println("====================================================================");
        }
        for (Mahasiswa mhsMagister : mahasiswaMagister) {
            String msg = mhsMagister.toString();
            System.out.println(msg);
            System.out.println("====================================================================");
        }
        for (Mahasiswa mhsDoktor : mahasiswaDoktor) {
            String msg = mhsDoktor.toString();
            System.out.println(msg);
            System.out.println("====================================================================");
        }
        for (Staff _karyawan : karyawan) {
            String msg = _karyawan.toString();
            System.out.println(msg);
            System.out.println("====================================================================");
        }
        for (Staff _dosen : dosens) {
            String msg = _dosen.toString();
            System.out.println(msg);
            System.out.println("====================================================================");
        }
    }
}