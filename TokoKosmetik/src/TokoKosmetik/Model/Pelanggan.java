package TokoKosmetik.Model;

public class Pelanggan {
    private String kode;
    private String nama;
    private String email;

    public Pelanggan(String kode, String nama, String email) {
        this.kode = kode;
        this.nama = nama;
        this.email = email;
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

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
