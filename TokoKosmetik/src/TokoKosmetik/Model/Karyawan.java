package TokoKosmetik.Model;

public class Karyawan {
    private String kode;
    private String nama;
    private String email;
    private String jabatan;

    public Karyawan(String kode, String nama, String email, String jabatan) {
        this.kode = kode;
        this.nama = nama;
        this.email = email;
        this.jabatan = jabatan;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

   
}
