package TokoKosmetik.Model;

public class Pembelian {
    private Produk produk;
    private Pelanggan pelanggan;
    private Karyawan karyawan;
    private int jumlah;

    public Pembelian(Produk produk, Pelanggan pelanggan, Karyawan karyawan, int jumlah) {
        this.produk = produk;
        this.pelanggan = pelanggan;
        this.karyawan = karyawan;
        this.jumlah = jumlah;
    }

    public Produk getProduk() {
        return produk;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public int getJumlah() {
        return jumlah;
    }
}
