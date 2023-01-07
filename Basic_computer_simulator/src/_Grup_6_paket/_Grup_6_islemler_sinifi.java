
package _Grup_6_paket;

import java.util.Random;


public class _Grup_6_islemler_sinifi {
    
    
    
    public String[] bellek_sira= new String[100];
    public String[] bellek_ad=new String[2];
    
    public int sira=0;
    public String sira_adi=null;
    int sira_adi_gecici=0;
    public int Accumluator=0;
    public int ram=0;
    public int binary=0;
    public String hexadecimal=null;
    public String bin = null;
    public int decimal = 0;
    public int octal = 0;
    
    
    public void Dondurme(){
    this.bin = Integer.toBinaryString(binary);
    }
    
    public void ORG (int x, String y){
    int sira_adi_gecici=0;
    this.sira=x;
    this.sira_adi=y;
    this.bellek_ad[sira_adi_gecici]=sira_adi;
    this.sira_adi_gecici++;
    
    this.binary = 0;
    this.decimal = 0;
    this.octal = 0;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "0";
    }
    
    public void ORG (int x){
    int sira_adi_gecici=0;
    this.sira=x;
    this.bellek_ad[sira_adi_gecici]=sira_adi;
    this.sira_adi_gecici++;
    System.out.println("Sira no: "+sira);
    
    this.binary = 0;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "0";
    this.decimal = 0;
    this.octal = 0;
    }
    
    public void LDA(int x){
     
    this.Accumluator=x;
    
    this.bellek_sira[sira]="LDA";
    
    sira++;
    System.out.println("Sira no: "+sira);
    
    this.binary = 5;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "5";
    this.decimal = 5;
    this.octal = 5;
    }
    
    public void CMA(){
     System.out.println("ac ilk değer: "+this.Accumluator);   
    int x;

    x=this.Accumluator;
    
    int bit_sayilari =(int)(Math.floor(Math.log(x)/Math.log(2))) + 1;
        this.Accumluator= ((1 << bit_sayilari) - 1) ^ x;
  
        System.out.println("ac tümlenen değeri: "+this.Accumluator);    
    this.bellek_sira[sira]="CMA";
    sira++; 
    
    this.binary = 4;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "4";
    this.decimal = 4;
    this.octal = 4;
    }
    
    public void INC(){
    System.out.println("ac ilk değeri: "+this.Accumluator);
    this.Accumluator++;
        
    this.bellek_sira[sira]="LDA";
    System.out.println("ac artan değeri: "+this.Accumluator);
    sira++;    
    
    this.binary = 5;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "5";
    this.decimal = 5;
    this.octal = 5;
    }
    
    public void ADD(int x){
    
    this.Accumluator=this.Accumluator+x;
    
    this.bellek_sira[sira]="ADD";   
    sira++;
    System.out.println("Sira no: "+sira);
    
    this.binary = 4;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "4";
    this.decimal = 4;
    this.octal = 4;
    }
    
    public boolean SZA(){
        
    this.binary = 2;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "2";
    this.decimal = 2;
    this.octal = 2;
    
    this.bellek_sira[sira]="SZA";
    sira++;
    
    if(this.Accumluator==0)
    {return true;
    
    }
    else{
        return false;}
    
    
    }
    
    public void STA(){
    
    this.ram=this.Accumluator;
    
    this.bellek_sira[sira]="STA";
            
    sira++;
    System.out.println("Sira no: "+sira);
    
    this.binary = 6;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "6";
    this.decimal = 6;
    this.octal = 6;
    }
    
    public void CLA(){
        
    this.bellek_sira[sira]="CLA";
    sira++;
    
    this.binary = 1;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "1";
    this.decimal = 1;
    this.octal = 1;
    }
    
    public void LOP(){
        
    this.bellek_sira[sira]="LOP";
    sira++;
    
    }
    
    public void ISZ(){
        
    this.bellek_sira[sira]="ISZ";
    sira++;
    
    this.binary = 15;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "F";
    this.decimal = 15;
    this.octal = 17;
    }
    
    public void BUN(){
        
    this.bellek_sira[sira]="BUN";
    sira++;
    
    this.binary = 8;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "8";
    this.decimal = 8;
    this.octal = 10;
    }
    
    public void HLT(){
        
    this.bellek_sira[sira]="HLT";
    sira++;
    System.out.println("Islemler bitti labellara geçildi. "+"Sira no: "+sira);
    
    this.binary = 9;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "9";
    this.decimal = 9;
    this.octal = 11;
    }
    
    public void PUSH(){
        
    this.bellek_sira[sira]="PUSH";
    sira++;    
    
    int rastgele_sayi =0;
    Random rastgele = new Random();
    
    
    rastgele_sayi = rastgele.nextInt(1-0+1) + 0;
    if(rastgele_sayi==1){
    this.binary = 1;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "1";
    this.decimal = 1;
    this.octal = 1;
    
        }
    else {
    
    this.binary = 8;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "8";
    this.decimal = 10;
    this.octal = 10;
        
    }
    }
    
    public void SZFULL(){
        
    this.bellek_sira[sira]="SZFULL";
    sira++;
    int rastgele_sayi =0;
    Random rastgele = new Random();
    
    
    rastgele_sayi = rastgele.nextInt(1-0+1) + 0;
    if(rastgele_sayi==1){
    this.binary = 1;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "1";
    this.decimal = 1;
    this.octal = 1;
    
        }
    else {
    this.binary = 8;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "8";
    this.decimal =8;
    this.octal = 10;
        
    }
    }
    
    public void POP(){
        
    this.bellek_sira[sira]="POP";
    sira++;
    
    int rastgele_sayi =0;
    Random rastgele = new Random();
    
    
    rastgele_sayi = rastgele.nextInt(1-0+1) + 0;
    if(rastgele_sayi==1){
    this.binary = 2;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "2";
    this.decimal = 2;
    this.octal = 2;
    
        }
    else {
    this.binary = 2;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "10";
    this.decimal = 2;
    this.octal = 2;
        
    }
    }
    
    public void SZEmpty(){
        
    this.bellek_sira[sira]="SZEMPTY";
    sira++;
    
    int rastgele_sayi =0;
    Random rastgele = new Random();
    
    
    rastgele_sayi = rastgele.nextInt(1-0+1) + 0;
    if(rastgele_sayi==1){
    this.binary = 3;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "3";
    this.decimal = 3;
    this.octal = 3;
    
        }
    else {
    this.binary = 11;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "11";
    this.decimal = 11;
    this.octal = 13;
    }
    }
    
    public void END(){
  
     
    this.bellek_sira[sira]="END";
    sira++;
    
        System.out.println("ramdeki değer: "+this.ram+"  "+"Ac deki değer: " +this.Accumluator+"    "+"Sira no: "+this.sira +" "+" Sira adi: "+this.sira_adi); 
    
    this.binary = 0;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "0";
    this.decimal = 0;
    this.octal = 0;
        
    }
   
    public void END1(){
  
     
    this.bellek_sira[sira]="END1";
    sira++;
    
    
   
        System.out.println("ramdeki değer: "+this.ram+"  "+"Ac deki değer: " +this.Accumluator+"    "+"Sira no: "+this.sira);
    
    this.binary = 0;
    this.bin = Integer.toBinaryString(binary);
    this.hexadecimal = "0";
    this.decimal = 0;
    this.octal = 0;
  
    
    }
}
    
    
    
    
    
    

