import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman extends Bukku {
  private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
  private ArrayList<Integer> idBuku = new ArrayList<Integer>();
  private ArrayList<Integer> banyakBuku = new ArrayList<Integer>();
  private Scanner input = new Scanner(System.in);
  private Siswa siswa = new Siswa();

  void getAll() {
    if (idSiswa.isEmpty())
      System.out.println("Data transaksi kosong");
    else {
      System.out.println("\t\tData Transaksi");
      System.out.println("idSiswa\tidBuku\tbanyakBuku");
      for (int i = 0; i < idSiswa.size(); i++) {
        System.out.println(idSiswa.get(i) + "\t" + idBuku.get(i) + "\t" + banyakBuku.get(i));
      }
    }
  }

  void pinjam(Bukku buku) {

    System.out.print("Masukan id Siswa");
    int id = input.nextInt();
    idSiswa.add(id);
    System.out.print("Masukan Id Buku : ");
    int bukuId = input.nextInt();
    idBuku.add(bukuId);
    int stok = buku.stok.get(bukuId - 1);
    System.out.println(stok);
    if (stok == 0) {
      System.out.println("Maaf Buku Telah Habis");
      return;
    }
    System.out.print("Masukan Jumlah Buku Yang Akan Dipinjam : ");
    int jumlahPeminjaman = input.nextInt();
    if (jumlahPeminjaman > stok) {
      System.out.println("Stok tida mencukupi");
      return;
    } else
      buku.stok.set(bukuId - 1, stok - jumlahPeminjaman);
    siswa.status.set(id - 1, false);

    banyakBuku.add(jumlahPeminjaman);

    System.out.println("Buku berhasil di pinjam");

  }

  void pengembalian(Bukku buku) {
    try {
      System.out.print("Masukan id Siswa");
      int id = input.nextInt();
      if (siswa.status.get(id - 1) == true)
        System.out.println("tidak ada bukku");
      System.out.print("Masukan Id Buku : ");
      int bukuId = input.nextInt();
      int stok = buku.stok.get(bukuId - 1);
      if (stok == 0) {
        System.out.println("Maaf Pastikan Yangg anda masukan bilangan bulat");
        return;
      }
      System.out.print("Masukan Jumlah Buku Yang Dipinjam : ");
      int jumlahPeminjaman = input.nextInt();

      buku.stok.set(bukuId - 1, stok + jumlahPeminjaman);
      siswa.status.set(id - 1, true);

    } catch (Exception e) {
      return;
    } finally {
      System.out.println("Buku berhasil di kembalikan");
    }
  }
}
