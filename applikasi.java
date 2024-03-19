import java.util.Scanner;

public class applikasi {
  public static int pilihan;
  public static Scanner input = new Scanner(System.in);

 public static Siswa siswa = new Siswa();
 public static Bukku buku = new Bukku();
 public static Petugas petugas = new Petugas();
 public static Peminjaman peminjaman = new Peminjaman();

 public static void main(String[] args) {

  do {
   System.out.println("======= LOGIN SEBAGAI =======");
   System.out.print("1. Petugas\n2. Siswa\nPilihan : ");
   pilihan = input.nextInt();
 } while (pilihan <= 0 || pilihan > 3);

 switch (pilihan) {
  case 1:
    petugas();
    break;
  case 2:
    siswa();
    break;
  default:
    break;
 }
    
 }
  
 public static void petugas () {

   do {
     System.out.println("\n================== Petugas ==================");
     System.out.println("1. Tambah Buku\n2. Tampilkan Buku\n3.Hapus Buku");
     System.out.println("4. Tambah Siswa\n5. Tampilkan Siswa\n6.Hapus Siswa");
     System.out.println("\n7. Tambah Petugas\n8. Tampilkan Petugas\n9.Hapus Petugas");
     System.out.println("10.Lihat Peminjaman\n11.Keluar");
     System.out.print("Pilihan : ");
     pilihan = input.nextInt();
   } while (pilihan <= 0 || pilihan > 12);
   switch (pilihan) {
     case 1:
      buku.tambahBuku();
       petugas();
       break;
     case 2:
       buku.getAll();
       petugas();
       break;
     case 3:
       buku.deleteBuku();
       petugas();
       break;
     case 4:
       siswa.add();
       petugas();
       break;
     case 5:
       siswa.getAll();
       petugas();
       break;
     case 6:
       siswa.delete();
       petugas();
       break;
     case 7:
       petugas.add();
       petugas();
       break;
     case 8:
       petugas.getAll();
       petugas();
       break;
     case 9:
       petugas.delete();
       petugas();
       break;
     case 10:
       peminjaman.getAll();
       petugas();
       break;
     case 11:
       applikasi.main(null);
       break;
     default:
       System.out.println("Silahkan Inputkan Angka Fitur Tersedia!!");
   }
 }
    
 public static void siswa() {
  do {
    System.out.println("============= SISWA =============");
    System.out.println("1. Pinjam Buku\n2. Mengembalikan Buku\n3. Keluar\nPilihan");
    pilihan = input.nextInt();
  } while (pilihan <= 0 || pilihan > 3);

  if (pilihan == 1) {
    peminjaman.pinjam(buku);
    siswa();
  } else if (pilihan == 2) {
    peminjaman.pengembalian(buku);
    siswa();
  } else {
    applikasi.main(null);
  }
 }

 }
