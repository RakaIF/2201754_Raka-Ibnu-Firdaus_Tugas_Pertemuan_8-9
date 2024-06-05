package pbo_9;

public class Student extends Person {

  private int status;

  public final static int TAHUN_PERTAMA = 1;
  public final static int TAHUN_KEDUA = 2;
  public final static int TAHUN_KETIGA = 3;
  public final static int TAHUN_AKHIR = 4;

  public Student(String nama, String alamat, String telepon,
                    String surel, int status) {
    super(nama, alamat, telepon, surel);
    this.status = status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getStatus() {
    switch (status) {
      case 1 : return "Mahasiswa Baru"; 
      case 2 : return "tahun kedua";
      case 3 : return "tahun ketiga";
      case 4 : return "Mahasiswa Akhir";
      default: return "Tidak Dikenal";
    }
  }

  @Override
  public String toString() {
    return super.toString() + "\nStatus: " + getStatus();
  }
}