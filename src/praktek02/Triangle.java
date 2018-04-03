package praktek02;
public class Triangle {
            double panjang;
            double tinggi;
            
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
}
