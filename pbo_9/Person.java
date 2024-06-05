package pbo_9;

public class Person {
  private String nama; 
  private String alamat; 
  private String telepon; 
  private String Email; 
  
  public Person() {
    this("Tidak Diketahui", "Tidak Diketahui", "Tidak Diketahui", "Tidak Diketahui");
  }

  public Person(String nama, String alamat, String telepon, String Email) {
    this.nama = nama;
    this.alamat = alamat;
    this.telepon = telepon;
    this.Email = Email;
  }

  public String getNama() {
    return nama;
  }

  public String getAlamat() {
    return alamat;
  }

  public String getTelepon() {
    return telepon;
  }

  public String getEmail() {
    return Email;
  }
 
  public void setNama(String nama) {
    this.nama = nama;
  }
  
  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }
  
  public void setTelepon(String telepon) {
    this.telepon = telepon;
  }

  public void setEmail(String Email) {
    this.Email = Email;
  }

      @Override
  public String toString() {
    return "\nNama: " + nama + "\nAlamat: " + alamat +
            "\nNomor Telepon: " + telepon + "\nAlamat Email: " + Email;
  }
}