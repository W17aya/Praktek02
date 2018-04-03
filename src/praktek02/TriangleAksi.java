package praktek02;

public class TriangleAksi {
    public static void main(String[]args){
        Triangle t1 = new Triangle();
        t1.panjang  = 20;
        t1.tinggi   = 10;
        
        t1.cetakinfo();
        System.out.println("Keliling triangle ="+t1.hitungKeliling());
        t1.cetakKeliling();
        
        
        Triangle t2 = new Triangle();
        t2.cetakinfo();
        
        Triangle t3 = new Triangle(30,50);
        t3.cetakinfo();
        
        }
}
