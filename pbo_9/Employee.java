package pbo_9;

public class Employee extends Person {

  private int kantor;
  private double gaji;
  private Mydate tanggalDirekrut;

  public Employee(String nama, String alamat, String telepon,
                  String surel, int kantor, double gaji) {
    super(nama, alamat, telepon, surel);
    this.kantor = kantor;
    this.gaji = gaji;
    this.tanggalDirekrut = new Mydate(); 
  }

  public int getKantor() {
    return kantor;
  }

  public String getGaji() {
    return String.format("%.2f", gaji);
  }

  public String getTanggalDirekrut() {
    return tanggalDirekrut.getBulan() + "/" + tanggalDirekrut.getHari()
           + "/" + tanggalDirekrut.getTahun();
  }

  public void setKantor(int kantor) {
    this.kantor = kantor;
  }

  public void setGaji(double gaji) {
    this.gaji = gaji;
  }

  public void setTanggalDirekrut() {
    tanggalDirekrut = new Mydate();
  }

  @Override
  public String toString() {
    return super.toString() + "\nKantor: " + kantor +
           "\nGaji: Rp" + getGaji() + "\nTanggal Direkrut: " + getTanggalDirekrut();
  }
}
