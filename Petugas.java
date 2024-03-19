import java.util.ArrayList;
import java.util.Scanner;

public class Petugas implements User {
 protected ArrayList<Integer> id = new ArrayList<Integer>();
 protected ArrayList<String> nama = new ArrayList<String>();
 protected ArrayList<String> alamat = new ArrayList<String>();
 protected ArrayList<String> telepon = new ArrayList<String>();
 private int i = 0, setId;
 private String setNama, setAlamat, setTelepon;
 private Scanner input = new Scanner(System.in);

  //  ======================================== CRUD PETUGAS ================================================
   void add() {
     // INPUT DATAl
     i++;
    System.out.print("MASUKAN NAMA : ");
    setNama = input.nextLine();
    System.out.print("MASUKAN ALAMAT : ");
    setAlamat = input.nextLine();
    System.out.print("MASUKAN TELEPON : ");
    setTelepon = input.nextLine();

    // MEMASUKAN DATA DALAM ARRAY LIST
   
      this.id.add(i);
      this.nama.add(setNama);
      this.alamat.add(setAlamat);
      this.telepon.add(setTelepon);
    
  }

  void getAll() {
    
    if (nama.isEmpty()) throw new IllegalArgumentException("data kosong"); 
    else { // LOOPING ARRAY LIST
      System.out.println("NAMA \t ALAMAT \t TELEPON  ");
      for (int i = 0; i < nama.size(); i++) {
        System.out.println(nama.get(i) + "\t" + alamat.get(i) + "\t" + telepon.get(i));
      }
    }
  }

  void delete() {
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
    if (!id.contains(idToDelete)) {
      System.out.println("Data tidak valid!");
      return;
    }

    // Mencari index ID
    int index = id.indexOf(idToDelete);

    // Menghapus data pada array list
    id.remove(index);
    nama.remove(index);
    alamat.remove(index);
    telepon.remove(index);

    System.out.println("Data berhasil dihapus!");
  }
  
  // ==================================================================== END ==========================================
}
