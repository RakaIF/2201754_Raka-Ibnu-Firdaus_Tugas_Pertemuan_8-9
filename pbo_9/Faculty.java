package pbo_9;

public class Faculty extends Employee {

  private String jamKantor; 
  private String pangkat;


  public Faculty (String nama, String alamat, String telepon, String surel,
               int kantor, double gaji, String jamKantor, String pangkat) {
    super(nama, alamat, telepon, surel, kantor, gaji);
    this.jamKantor = jamKantor;
    this.pangkat = pangkat;
  }

  public String getJamKantor() {
    return jamKantor;
  }

  public void setJamKantor(String jamKantor) {
    this.jamKantor = jamKantor;
  }

  public String getPangkat() {
    return pangkat;
  }

  public void setPangkat(String pangkat) {
    this.pangkat = pangkat;
  }

  @Override
  public String toString() {
    return super.toString() + "\nJam Kantor: " + jamKantor +
           "\nPangkat: " + pangkat;
  }
}

    