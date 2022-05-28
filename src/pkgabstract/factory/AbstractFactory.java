
package pkgabstract.factory;


public class AbstractFactory {

    public static void main(String[] args)throws Exception {
        
        System.out.println("Test");
        
        String dosya = "Masaustu/Odev.doc";
        // A, B, C
        // yanlış kullanım
        for(int i=1; i<1000; i++){
            Zip zip = new Zip(".zip");    
            Rar rar = new Rar(".rar");
            zip.compString(dosya);
            zip.compString(dosya);
        }
        
              
        
        Factory factory = new Factory();
        
        //Tek istek dosya sıkıştırmaksa tek satırda kullanıyoruz
        factory.sikistirmaYontemi("zip").compString(dosya);
        factory.sikistirmaYontemi("rar").compString(dosya);
        
        // Dosya sıkıştırıldıktan sonra o sıkıştırılan dosyayla işimiz bitmeyecekse 
        // bu şekilde kodluyoruz. Bu sayede zip2 olarak tutulması devam ediyor
        // fakat fazla performans harcıyor
    
        
        Zip zip2 = (Zip) factory.sikistirmaYontemi("zip");
        Rar rar2 = (Rar) factory.sikistirmaYontemi("rar");
        zip2.compString(dosya);
        rar2.compString(dosya);
    }
    
}
