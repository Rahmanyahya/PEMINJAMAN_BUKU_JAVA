import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siswa extends Petugas {
  private Scanner input = new Scanner(System.in);
  protected ArrayList<Boolean> status = new ArrayList<Boolean>();
  private Petugas siswa = new Petugas();
 

  @Override
  void getAll() {
    if (siswa.nama.isEmpty()) System.out.println("Kosong"); 
    System.out.println("=========================== SISWA =============================");
    System.out.println("   ID\tNAMA\tALAMAT\tTELP\tSTATUS");
    System.out.println("===============================================================");

    for (int i = 0; i < siswa.nama.size(); i++) {
      System.out.println(
          siswa.id.get(i) + "   " + siswa.nama.get(i) + "   " + siswa.alamat.get(i) + "   " + siswa.telepon.get(i)
              + "  " + status.get(i));
    }

  }

  @Override
  void add() {
    siswa.add();
    this.status.add(true);
  }


  @Override 
  
  void delete() {
    getAll();
    // MEMASUKAN data
    System.out.println("MASUKAN ID YANG AKAN DIHAPUS : ");
    int idToDelete;
    try {
      idToDelete = Integer.parseInt(input.next());
    } catch (NumberFormatException e) {
      System.out.println("ID harus berupa angka!");
      return;
    }

    // Validasi ID
    if (!siswa.id.contains(idToDelete)) {
      System.out.println("Data tidak valid!");
      return;
    }

    // Mencari index ID
    int index = siswa.id.indexOf(idToDelete);

    // Menghapus data pada array list
    siswa.id.remove(index);
    siswa.nama.remove(index);
    siswa.alamat.remove(index);
    siswa.telepon.remove(index);

    System.out.println("Data berhasil dihapus!");
  }
}
