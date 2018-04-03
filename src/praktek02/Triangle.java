package praktek02;
public class Triangle {
            double panjang;
            double tinggi;

    public Triangle() {
        panjang=5;
        tinggi=2;
    }

    public Triangle(double panjang, double tinggi) {
        this.panjang = panjang;
        this.tinggi = tinggi;
    }
    
    
            
   void cetakinfo(){
       System.out.println("=====================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Tinggi  : "+tinggi);
        System.out.println("=====================");
    }
   double hitungKeliling(){
       double keliling;
       keliling=panjang*panjang*panjang;
       return keliling;
       
   }
   
   void cetakKeliling(){
       System.out.println("Kelilingnya adalah:  "+hitungKeliling());
   }
}
