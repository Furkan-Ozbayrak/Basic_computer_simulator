
package _Grup_6_paket;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _Grup_6_proje_kod_denemeleri {
    
    public static void main(String[] args) {
    ArrayList<String> dizi = new ArrayList<>();
    ArrayList<String> dizi2 = new ArrayList<>();
    
    _Grup_6_islemler_sinifi islem = new _Grup_6_islemler_sinifi();
    
    String[][] gecici = new String[2][20];
    
    System.out.println("kod başladı");
try (FileReader f = new FileReader("CompareTwoNumbers_Indirect.basm")) {
    StringBuffer sb = new StringBuffer();
    while (f.ready()) {
        char c = (char) f.read();
        if (c == '\n') {
            dizi.add(sb.toString());
            sb = new StringBuffer();
        } else {
            sb.append(c);
        }
    }
    if (sb.length() > 0) {
        dizi.add(sb.toString());
    }
}       catch (FileNotFoundException ex) {       
            Logger.getLogger(_Grup_6_multiplier_arayuz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(_Grup_6_multiplier_arayuz.class.getName()).log(Level.SEVERE, null, ex);
        }       
            
            
        for(int i=0;i<dizi.size();i++){
     
            String y= dizi.get(i);
            
            System.out.println(y);
            
            System.out.println(i+" = döngü numarası");
            
            
            System.out.println("y nin 3 substringi");
            System.out.println(y.substring(0, 3));
            
            
            String j;
            String l;
                
            if(y.substring(0,3).equals("ORG")){
            
                System.out.println("IF BLOĞU İÇİ");
                
                System.out.println(y);
                
                System.out.println("y nin ortadaki substringi örnek org'C' 5");
                System.out.println(y.substring(4, 5));
                System.out.println("y nin ortadaki substringi örnek org c '5'");
                System.out.println(y.substring(6, 7));
                
                
                if(y.substring(4, 5).equals("C")){
                    
                    
           
                     j=y.substring(6, 7);
                     System.out.println("j="+j);
                     (islem.sira_adi)=y.substring(4, 5);
                     System.out.println("ISLEMLER CLASSI SIRA ADI= "+islem.sira_adi);    
                   
                }
                else{
                
                    j=y.substring(6, 7);
                    System.out.println("j="+j);
                    islem.sira_adi=y.substring(4, 5) ;
                    System.out.println("ISLEMLER CLASSI SIRA ADI= "+islem.sira_adi);        
                }
               
             
            }
           else if(y.substring(9,10).equals("2")){
                System.out.println("22222222222222222222222222222222");
                System.out.println("Y.SUBSTRING(9,10)= "+y.substring(9, 10));
            }
           else if(y.substring(9,10).equals("3")){
                System.out.println("3333333333333333333333333333");
                System.out.println("Y.SUBSTRING(9,10)= "+y.substring(9, 10));
           }
            else if(y.substring(3,4).equals(",")){
                System.out.println("VIRGUUUUUUUUUUUUUUUUUUUUUUUUUUL");
                System.out.println("Y.SUBSTRING(3,4)= "+y.substring(3, 4));
            }
            
                
                
     
                
                
        }
        
            System.out.println("GEÇİCİ DİZİ ELEMANI 1:");
            System.out.println(islem.bellek_ad[0]);
            System.out.println("GEÇİCİ DİZİ ELEMANI 2:");
            System.out.println(islem.bellek_ad[1]);
            
       
    }
}    