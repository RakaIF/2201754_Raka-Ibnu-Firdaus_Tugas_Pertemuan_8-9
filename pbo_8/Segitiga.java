package pbo_8;

/**
 *
 * @author Raka IF
 */
public class Segitiga extends Geometris {
    
    public double side1;
    public double side2;
    public double side3;
    
    public Segitiga(){
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    
    public Segitiga(double side1, double side2, double side3, String warna, boolean terisi){
        super(warna, terisi);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }
    
    public void setSide1(double side1){
        this.side1 = side1;
    }
    
    public void setSide2(double side1){
        this.side2 = side2;
    }
    
    public void setSide3(double side1){
        this.side3 = side3;
    }
    
    @Override
    public String toString(){
    return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;    
    }
}