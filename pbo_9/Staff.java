package pbo_9;


public class Staff extends Employee { 

  private String jabatan;

  public Staff(String nama, String alamat, String telepon,String surel, int kantor, double gaji, String jabatan) {
    super(nama, alamat, telepon, surel, kantor, gaji);
    this.jabatan = jabatan;
  }

  public String getJabatan() {
    return jabatan;
  }

  public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
  }

  @Override
  public String toString() {
    return super.toString() + "\nJabatan: " + jabatan;
  }
}
