package pbo_8;

/**
 *
 * @author Raka IF
 */
public class Geometris {
    private String warna;
    private boolean terisi;
    
    public Geometris(){
    warna = "putih";
    terisi = false;
}
    
    public Geometris (String warna, boolean terisi){
        this.warna = warna;
        this.terisi = terisi;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public boolean getTerisi(){
        return terisi;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setTerisi(boolean terisi){
        this.terisi = terisi;
    }
    
    public String toString(){
        return "Segitiga berwarna : "+ warna + "dan terisi : " + terisi;
    }
    
}

