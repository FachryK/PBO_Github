class Person {
    private String nama;
    private int usia;

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
}

class Mahasiswa extends Person {
    private String nim;

    public String getNim() {
        return nim;
    }

    public Mahasiswa(String nama, int usia, String nim) {
        super(nama, usia);
        this.nim = nim;
    }
}

class Dosen extends Person {
    private String nip;
    private MataKuliah mkList;

    public String getNip() {
        return nip;
    }

    public MataKuliah getMkList() {
        return mkList;
    }

    public Dosen(String nama, int usia, String nip, MataKuliah mkList) {
        super(nama, usia);
        this.nip = nip;
        this.mkList = mkList;
    }
}

class MataKuliah {
    private String kodeMK;
    private String namaMK;

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public MataKuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }
}

class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public Ruangan(String kodeRuangan, String namaRuangan) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
    }
}

class Jadwal {
    private String hari;
    private MataKuliah mataKuliah;
    private Ruangan ruangan;
    private Dosen dosenPengampu;

    public Jadwal(String hari, MataKuliah mataKuliah, Ruangan ruangan, Dosen dosenPengampu) {
        this.hari = hari;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
        this.dosenPengampu = dosenPengampu;
    }

    public String getJadwal() {
        return "Hari: " + hari + ", Mata Kuliah: " + mataKuliah.getNamaMK() + ", Ruangan: " + ruangan.getNamaRuangan() + ", Dosen: " + dosenPengampu.getNama();
    }
}

public class akademik {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswaList = new Mahasiswa[10];
        mahasiswaList[0] = new Mahasiswa("Hafiz", 20, "231511077");
        mahasiswaList[1] = new Mahasiswa("Jupri", 19, "231511085");
        mahasiswaList[2] = new Mahasiswa("Dzaki", 21, "231511083");
        mahasiswaList[3] = new Mahasiswa("Restu", 19, "231511088");
        mahasiswaList[4] = new Mahasiswa("Wildan", 19, "231511089");
        mahasiswaList[5] = new Mahasiswa("Yanto", 19, "231511081");
        mahasiswaList[6] = new Mahasiswa("Ojan", 19, "231511075");
        mahasiswaList[7] = new Mahasiswa("Rifqi", 19, "231511090");
        mahasiswaList[8] = new Mahasiswa("Alqan", 19, "231511066");
        mahasiswaList[9] = new Mahasiswa("Afrija", 19, "231511065");
        
        MataKuliah mk1 = new MataKuliah("21IF2015", "Komputer Grafik");
        MataKuliah mk2 = new MataKuliah("21IF2014", "Aljabar Linear");
        MataKuliah mk3 = new MataKuliah("21IF2016", "Proyek 3");
        MataKuliah mk4 = new MataKuliah("21IF2011", "Pemrograman Berbasis Objek");
        MataKuliah mk5 = new MataKuliah("21IF2012", "Basis Data");
        
        Dosen[] dosenList = new Dosen[10];
        dosenList[0] = new Dosen("Yudi Widhiyasana ", 45, "KO013N", mk1);
        dosenList[1] = new Dosen("Muhammad Rizqi S", 40, "KO074N", mk2);
        dosenList[2] = new Dosen("Trisna Gelar A", 38, "KO078N", mk3);
        dosenList[3] = new Dosen("Zulkifli Arsyad", 38, "KO061N", mk4);
        dosenList[4] = new Dosen("Ade Hodijah", 38, "KO060N", mk5);

        Ruangan r1 = new Ruangan("D217-Kelas", "D217");
        Ruangan r2 = new Ruangan("D101-Kelas", "D101");
        Ruangan r3 = new Ruangan("D102-Lab. MT", "Lab MT");
        Ruangan r4 = new Ruangan("D106-Lab. SDB", "Lab SDB");
        
        Jadwal[] jadwalList = new Jadwal[5];
        jadwalList[0] = new Jadwal("Senin", mk1, r1, dosenList[0]);
        jadwalList[1] = new Jadwal("Selasa", mk2, r2, dosenList[1]);
        jadwalList[2] = new Jadwal("Rabu", mk3, r3, dosenList[2]);
        jadwalList[3] = new Jadwal("Kamis", mk4, r4, dosenList[3]);
        jadwalList[4] = new Jadwal("Jumat", mk5, r4, dosenList[4]);

        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            if (mhs != null) {
                System.out.println("Nama: " + mhs.getNama() + ", NIM: " + mhs.getNim());
            }
        }

        System.out.println("\nData Dosen:");
        for (Dosen dsn : dosenList) {
            if (dsn != null) {
                System.out.println("Nama: " + dsn.getNama() + ", NIP: " + dsn.getNip() + ", Mengampu: " + dsn.getMkList().getNamaMK());
            }
        }

        System.out.println("\nJadwal Perkuliahan:");
        for (Jadwal j : jadwalList) {
            System.out.println(j.getJadwal());
        }
    }
}