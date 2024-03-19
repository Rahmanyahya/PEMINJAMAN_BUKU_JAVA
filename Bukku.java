import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bukku {
  private ArrayList<Integer> id = new ArrayList<Integer>();
  private ArrayList<String> judulBuku = new ArrayList<String>();
  protected ArrayList<Integer> stok = new ArrayList<Integer>();
  private ArrayList<Integer> hargaBuku = new ArrayList<Integer>();
  private String judulbuku;
  private int stokBuku, HargaBuku, i;
  private Scanner input = new Scanner(System.in);

  // crud buku

  void getAll() {
    if (judulBuku.isEmpty())
      System.out.println("Kosong");
    else {
      System.out.println("=========================== BUKU =============================");
      System.out.println("   Id\tJudul\tStok\tHarga");
      System.out.println("===============================================================");

      for (int i = 0; i < judulBuku.size(); i++) {
        System.out.println(
            id.get(i) + "   " + judulBuku.get(i) + "   " + stok.get(i) + "   " + hargaBuku.get(i));
      }

    }
  }

  void tambahBuku() {

    System.out.print("Masukan Judul Buku : ");
    judulbuku = input.nextLine();
    System.out.print("Masukan Stok Buku : ");
    stokBuku = input.nextInt();
    while (stokBuku <= 0) {
      System.out.print("Masukan Stok Buku : ");
      stokBuku = input.nextInt();
    }
    System.out.print("MasuKan Harga Buku : ");
    HargaBuku = input.nextInt();
    while (HargaBuku <= 0) {
      System.out.print("MasuKan Harga Buku : ");
      HargaBuku = input.nextInt();
    }
    i++;
    id.add(i);
    judulBuku.add(judulbuku);
    stok.add(stokBuku);
    hargaBuku.add(HargaBuku);

  }

  
  void deleteBuku() {
     getAll();
    // MEMASUKAN data
    System.out.println("MASUKAN ID YANG AKAN DIHAPUS : ");
    int idToDelete;
   
    idToDelete = Integer.parseInt(input.next());
      while (idToDelete <= 0) {
        System.out.println("MASUKAN ID YANG AKAN DIHAPUS : ");
        idToDelete = Integer.parseInt(input.next());
      }
    
    // Validasi ID
    if (!id.contains(idToDelete)) {
      System.out.println("Data tidak valid!");
      deleteBuku();
    }

    // Mencari index ID
    int index = id.indexOf(idToDelete);

    // Menghapus data pada array list
    id.remove(index);
    judulBuku.remove(index);
    stok.remove(index);
    hargaBuku.remove(index);

    System.out.println("Data berhasil dihapus!");
  }
  

}
