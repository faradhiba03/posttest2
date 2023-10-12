package TokoKosmetiik;

import TokoKosmetik.Model.Produk;
import TokoKosmetik.Model.Pelanggan;
import TokoKosmetik.Model.Karyawan;
import TokoKosmetik.Model.Pembelian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TokoKosmetikApp {

    public static void main(String[] args) {
        List<Produk> daftarProduk = new ArrayList<>();
        List<Pelanggan> daftarPelanggan = new ArrayList<>();
        List<Karyawan> daftarKaryawan = new ArrayList<>();
        List<Pembelian> daftarPembelian = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Edit Produk");
            System.out.println("3. Hapus Produk");
            System.out.println("4. Tambah Pelanggan");
            System.out.println("5. Edit Pelanggan");
            System.out.println("6. Hapus Pelanggan");
            System.out.println("7. Tambah Karyawan");
            System.out.println("8. Edit Karyawan");
            System.out.println("9. Hapus Karyawan");
            System.out.println("10. Tambah Pembelian");
            System.out.println("11. Tampilkan Data Produk");
            System.out.println("12. Tampilkan Data Pelanggan");
            System.out.println("13. Tampilkan Data Karyawan");
            System.out.println("14. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    Produk produk = tambahProduk(scanner);
                    daftarProduk.add(produk);
                    break;

                case 2:
                    editProduk(scanner, daftarProduk);
                    break;

                case 3:
                    hapusProduk(scanner, daftarProduk);
                    break;

                case 4:
                    Pelanggan pelanggan = tambahPelanggan(scanner);
                    daftarPelanggan.add(pelanggan);
                    break;

                case 5:
                    editPelanggan(scanner, daftarPelanggan);
                    break;

                case 6:
                    hapusPelanggan(scanner, daftarPelanggan);
                    break;

                case 7:
                    Karyawan karyawan = tambahKaryawan(scanner);
                    daftarKaryawan.add(karyawan);
                    break;

                case 8:
                    editKaryawan(scanner, daftarKaryawan);
                    break;

                case 9:
                    hapusKaryawan(scanner, daftarKaryawan);
                    break;

                case 10:
                    Pembelian pembelian = tambahPembelian(scanner, daftarProduk, daftarPelanggan, daftarKaryawan);
                    daftarPembelian.add(pembelian);
                    break;

                case 11:
                    tampilkanDataProduk(daftarProduk);
                    break;

                case 12:
                    tampilkanDataPelanggan(daftarPelanggan);
                    break;

                case 13:
                    tampilkanDataKaryawan(daftarKaryawan);
                    break;
            }
        } while (pilihan != 14);
    }

    // Fungsi tambahProduk
    private static Produk tambahProduk(Scanner scanner) {
        System.out.print("Kode Produk: ");
        String kode = scanner.next();
        System.out.print("Nama Produk: ");
        String nama = scanner.next();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();
        return new Produk(kode, nama, harga);
    }

    // Fungsi editProduk
    private static void editProduk(Scanner scanner, List<Produk> daftarProduk) {
        System.out.print("Kode Produk yang akan diubah: ");
        String kodeProduk = scanner.next();

        Produk produkToUpdate = null;
        for (Produk p : daftarProduk) {
            if (p.getKode().equals(kodeProduk)) {
                produkToUpdate = p;
                break;
            }
        }

        if (produkToUpdate != null) {
            System.out.print("Nama Produk baru: ");
            produkToUpdate.setNama(scanner.next());
            System.out.print("Harga baru: ");
            produkToUpdate.setHarga(scanner.nextDouble());
            System.out.println("Produk berhasil diubah.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    // Fungsi hapusProduk
    private static void hapusProduk(Scanner scanner, List<Produk> daftarProduk) {
        System.out.print("Kode Produk yang akan dihapus: ");
        String kodeProduk = scanner.next();

        Produk produkToDelete = null;
        for (Produk p : daftarProduk) {
            if (p.getKode().equals(kodeProduk)) {
                produkToDelete = p;
                break;
            }
        }

        if (produkToDelete != null) {
            daftarProduk.remove(produkToDelete);
            System.out.println("Produk berhasil dihapus.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    // Fungsi tambahPelanggan
    private static Pelanggan tambahPelanggan(Scanner scanner) {
        System.out.print("Kode Pelanggan: ");
        String kode = scanner.next();
        System.out.print("Nama: ");
        String nama = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        return new Pelanggan(kode, nama, email);
    }

    // Fungsi editPelanggan
    private static void editPelanggan(Scanner scanner, List<Pelanggan> daftarPelanggan) {
        System.out.print("Kode Pelanggan yang akan diubah: ");
        String kodePelanggan = scanner.next();

        Pelanggan pelangganToUpdate = null;
        for (Pelanggan p : daftarPelanggan) {
            if (p.getKode().equals(kodePelanggan)) {
                pelangganToUpdate = p;
                break;
            }
        }

        if (pelangganToUpdate != null) {
            System.out.print("Nama Pelanggan baru: ");
            pelangganToUpdate.setNama(scanner.next());
            System.out.print("Email baru: ");
            pelangganToUpdate.setEmail(scanner.next());
            System.out.println("Pelanggan berhasil diubah.");
        } else {
            System.out.println("Pelanggan tidak ditemukan.");
        }
    }

    // Fungsi hapusPelanggan
    private static void hapusPelanggan(Scanner scanner, List<Pelanggan> daftarPelanggan) {
        System.out.print("Kode Pelanggan yang akan dihapus: ");
        String kodePelanggan = scanner.next();

        Pelanggan pelangganToDelete = null;
        for (Pelanggan p : daftarPelanggan) {
            if (p.getKode().equals(kodePelanggan)) {
                pelangganToDelete = p;
                break;
            }
        }

        if (pelangganToDelete != null) {
            daftarPelanggan.remove(pelangganToDelete);
            System.out.println("Pelanggan berhasil dihapus.");
        } else {
            System.out.println("Pelanggan tidak ditemukan.");
        }
    }

    // Fungsi tambahKaryawan
    private static Karyawan tambahKaryawan(Scanner scanner) {
        System.out.print("Kode Karyawan: ");
        String kode = scanner.next();
        System.out.print("Nama: ");
        String nama = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Jabatan: ");
        String jabatan = scanner.next();
        return new Karyawan(kode, nama, email, jabatan);
    }

    // Fungsi editKaryawan
    private static void editKaryawan(Scanner scanner, List<Karyawan> daftarKaryawan) {
        System.out.print("Kode Karyawan yang akan diubah: ");
        String kodeKaryawan = scanner.next();

        Karyawan karyawanToUpdate = null;
        for (Karyawan k : daftarKaryawan) {
            if (k.getKode().equals(kodeKaryawan)) {
                karyawanToUpdate = k;
                break;
            }
        }

        if (karyawanToUpdate != null) {
            System.out.print("Nama Karyawan baru: ");
            karyawanToUpdate.setNama(scanner.next());
            System.out.print("Email baru: ");
            karyawanToUpdate.setEmail(scanner.next());
            System.out.print("Jabatan baru: ");
            karyawanToUpdate.setJabatan(scanner.next());
            System.out.println("Karyawan berhasil diubah.");
        } else {
            System.out.println("Karyawan tidak ditemukan.");
        }
    }

    // Fungsi hapusKaryawan
    private static void hapusKaryawan(Scanner scanner, List<Karyawan> daftarKaryawan) {
        System.out.print("Kode Karyawan yang akan dihapus: ");
        String kodeKaryawan = scanner.next();

        Karyawan karyawanToDelete = null;
        for (Karyawan k : daftarKaryawan) {
            if (k.getKode().equals(kodeKaryawan)) {
                karyawanToDelete = k;
                break;
            }
        }

        if (karyawanToDelete != null) {
            daftarKaryawan.remove(karyawanToDelete);
            System.out.println("Karyawan berhasil dihapus.");
        } else {
            System.out.println("Karyawan tidak ditemukan.");
        }
    }

    // Fungsi tambahPembelian
    private static Pembelian tambahPembelian(Scanner scanner, List<Produk> daftarProduk, List<Pelanggan> daftarPelanggan, List<Karyawan> daftarKaryawan) {
        System.out.print("Pilih Produk (Kode): ");
        String kodeProduk = scanner.next();
        Produk produk = null;
        for (Produk p : daftarProduk) {
            if (p.getKode().equals(kodeProduk)) {
                produk = p;
                break;
            }
        }

        System.out.print("Pilih Pelanggan (Kode): ");
        String kodePelanggan = scanner.next();
        Pelanggan pelanggan = null;
        for (Pelanggan p : daftarPelanggan) {
            if (p.getKode().equals(kodePelanggan)) {
                pelanggan = p;
                break;
            }
        }

        System.out.print("Pilih Karyawan (Kode): ");
        String kodeKaryawan = scanner.next();
        Karyawan karyawan = null;
        for (Karyawan k : daftarKaryawan) {
            if (k.getKode().equals(kodeKaryawan)) {
                karyawan = k;
                break;
            }
        }

        System.out.print("Jumlah Pembelian: ");
        int jumlah = scanner.nextInt();
        return new Pembelian(produk, pelanggan, karyawan, jumlah);
    }

    // Fungsi tampilkanDataProduk
    private static void tampilkanDataProduk(List<Produk> daftarProduk) {
        for (Produk produk : daftarProduk) {
            System.out.println("Kode Produk: " + produk.getKode());
            System.out.println("Nama Produk: " + produk.getNama());
            System.out.println("Harga: " + produk.getHarga());
            System.out.println();
        }
    }

    // Fungsi tampilkanDataPelanggan
    private static void tampilkanDataPelanggan(List<Pelanggan> daftarPelanggan) {
        for (Pelanggan pelanggan : daftarPelanggan) {
            System.out.println("Kode Pelanggan: " + pelanggan.getKode());
            System.out.println("Nama: " + pelanggan.getNama());
            System.out.println("Email: " + pelanggan.getEmail());
            System.out.println();
        }
    }

    // Fungsi tampilkanDataKaryawan
    private static void tampilkanDataKaryawan(List<Karyawan> daftarKaryawan) {
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println("Kode Karyawan: " + karyawan.getKode());
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Email: " + karyawan.getEmail());
            System.out.println("Jabatan: " + karyawan.getJabatan());
            System.out.println();
        }
    }
}
