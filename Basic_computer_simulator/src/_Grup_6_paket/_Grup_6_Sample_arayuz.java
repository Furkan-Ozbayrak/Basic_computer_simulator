
package _Grup_6_paket;

import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;


public class _Grup_6_Sample_arayuz extends javax.swing.JFrame {

    
    public _Grup_6_Sample_arayuz() {
        initComponents();
    }

    
        DefaultListModel listmodel = new DefaultListModel();
        DefaultListModel listmodel2 = new DefaultListModel();
        DefaultListModel listmodel3 = new DefaultListModel();
        DefaultListModel listmodel4 = new DefaultListModel();
        DefaultListModel listmodel5 = new DefaultListModel();
        DefaultListModel listmodel6 = new DefaultListModel();
        DefaultListModel listmodel7 = new DefaultListModel();
        DefaultListModel listmodel8 = new DefaultListModel();
        
        ArrayList<String> dizi = new ArrayList<>();
        ArrayList<String> dizi2 = new ArrayList<>();
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        textMicro = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("_Grup_6_Sample_arayuz");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setToolTipText("");
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Dosyayı Oku");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Memories"));

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        jLabel3.setText("Label");

        jLabel4.setText("Memory");

        jLabel5.setText("Binary");

        jLabel6.setText("Hexadecimal");

        jList7.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(jList7);

        jList8.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jList8);

        jLabel7.setText("Decimal");

        jLabel8.setText("Octal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );

        jButton3.setText("Geri Dön");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("İlerlet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Micro Operations"));

        textMicro.setColumns(20);
        textMicro.setRows(5);
        jScrollPane7.setViewportView(textMicro);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(259, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton3)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

        
        try (FileReader f = new FileReader("Sample.asm")) {
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
        
        
        
        

        for(int i=0;i<dizi.size();i++)

        for(i=0;i<dizi.size();i++){
            String y= dizi.get(i);
            
            for(int j=0;j<y.length()-1;j++){
                

                char[] karakter = y.toCharArray();
                

                if(karakter[j]==('/')){

                    

                    for(j=j;j<y.length();j++){
                        
                        karakter[j]=' ';
                       

                    }
                } else{
                   
                }
                y = String.valueOf(karakter);

            }
            
            dizi2.add(y);
        }
        for(int i=0;i<dizi.size();i++){
            listmodel.addElement(dizi.get(i));
        }
        jList1.setModel(listmodel);

        for(int i=0;i<dizi2.size();i++)
        {        listmodel2.addElement(dizi2.get(i));
        }
        jList2.setModel(listmodel2);
        
        
        for(int i=0;i<dizi2.size();i++){
     
            String x= dizi2.get(i);
            if(x.substring(1,2).equals(",")){
               
                
                
                listmodel3.addElement(x);
    
                jList3.setModel(listmodel3);
     } }
        
     _Grup_6_islemler_sinifi islem = new _Grup_6_islemler_sinifi();   
     
       for(int i=0;i<dizi2.size();i++){
       
           String x= dizi2.get(i);
           
           
switch (x.substring(0,3)) {
  
    case "ORG":
    System.out.println("ORG");
   
    islem.ORG(Integer.parseInt(x.substring(4,5)));
    
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6);  
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);            
                
    
    break;
    
    case "LDA":
    System.out.println("LDA");


    String a= dizi2.get(5);
        System.out.println("7,9 substring: "+a.substring(7,9));
    islem.LDA(Integer.parseInt(a.substring(7,9)));

    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);            

    break;
    case "ADD":
    System.out.println("ADD");
   
    a= dizi2.get(6);
    System.out.println("7,10 substring: "+a.substring(7,10));
    islem.ADD(Integer.parseInt(a.substring(7,10)));
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);
                
    break;
    
    
    case "STA":
    System.out.println("STA");
    islem.STA();
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);
                
    break;
    
    case "HLT":
    System.out.println("HLT");
    islem.HLT();
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);
                
    break;
    
    case "A, ":
    System.out.println("A, ");
         
    listmodel4.addElement(x.substring(0,3)+" "+islem.sira);
    
                jList4.setModel(listmodel4);
            
                
    islem.binary=83; 
    islem.hexadecimal="53";
    islem.Dondurme();
    islem.decimal=83;
    islem.octal=123;
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);            
                
    islem.sira++;;
    break;
    
    case "B, ":
    System.out.println("B, ");
         
    listmodel4.addElement(x.substring(0,3)+" "+islem.sira);
    
                jList4.setModel(listmodel4);
                
    islem.binary=-23; 
    islem.hexadecimal="-17";
    islem.Dondurme();
    islem.decimal=-23;
    islem.octal=-27;
                
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
    
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);
                
    islem.sira++;
    break;
    
    case "C, ":
    System.out.println("C, ");
         
    listmodel4.addElement(x.substring(0,3)+" "+islem.sira);
    
                jList4.setModel(listmodel4);
    
    islem.binary=0; 
    islem.hexadecimal="0";
    islem.Dondurme();
    islem.decimal=0;
    islem.octal=0;
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);            
                
    islem.sira++;
    break;
    
    case "END":
    System.out.println("END");
    islem.END1();
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6); 
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);            
                
    break;
    
  default:
    System.out.println("DEFAULT"+i);
    
    break;
}
 File myObj = new File("Output.txt");
 try {
            if (myObj.createNewFile()) {
               
            } else {
              
                
            
               
                
 
            } } catch (IOException ex) {
            Logger.getLogger(_Grup_6_Sample_arayuz.class.getName()).log(Level.SEVERE, null, ex);
        }
        

       }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
           
   

        
        _Grup_6_giris_arayuz giris = new _Grup_6_giris_arayuz();
        
        giris.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
            int ilerletme =0;
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
      
       
        
        try {
            PrintWriter pr = new PrintWriter("Output.txt");
            
            jList2.setSelectedIndex(ilerletme);
        
       
        
        switch(jList2.getSelectedValue().substring(0, 3)){
        
          case "ORG":
    textMicro.setText("");
    
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append("Execute");
              textMicro.append ("    ");
              
              pr.println ("ORG");
              pr.println ("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println("Execute");
              pr.println ("    ");

              pr.close();
             
              break;

   
    case "LDA":
        
        textMicro.setText("");
        
               
        
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              textMicro.append ("    ");
              textMicro.append ("D2T4:");
              textMicro.append ("    ");
              textMicro.append ("DR <- M[AR]\n");
              textMicro.append ("    ");
              textMicro.append ("D2T5: ");
              textMicro.append ("     ");
              textMicro.append ("AC <- DR, SC <- 0\n");

              pr.println("LDA");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
            pr.println ("Execute");
              pr.println ("    ");
              pr.println ("D2T4:");
              pr.println ("    ");
              pr.println ("DR <- M[AR]\n");
              pr.println ("    ");
              pr.println ("D2T5: ");
              pr.println("     ");
             pr.println ("AC <- DR, SC <- 0\n");

               pr.close();
              
              jList2.setSelectedIndex(5);
    break;
   
              case "ADD":
    textMicro.setText("");
        
               
                
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              textMicro.append ("    ");
              textMicro.append ("D1T4:");
              textMicro.append ("    ");
              textMicro.append ("DR <- M[AR]\n");
              textMicro.append ("    ");
              textMicro.append ("D1T5: ");
              textMicro.append ("     ");
              textMicro.append ("AC <- AC + DR, E <- Cout, SC <- 0\n");
              
              pr.println("ADD");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println ("Execute");
              pr.println ("    ");
              pr.println ("D1T4:");
              pr.println ("    ");
              pr.println ("DR <- M[AR]\n");
              pr.println ("    ");
              pr.println ("D1T5: ");
              pr.println ("     ");
              pr.println ("AC <- AC + DR, E <- Cout, SC <- 0\n");

               pr.close();
              
              jList2.setSelectedIndex(6);
    break;
    
    
    case "STA":
    textMicro.setText("");
    
    
                
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              textMicro.append ("    ");
              textMicro.append ("D3T4:");
              textMicro.append ("    ");
              textMicro.append ("M[AR] <- AC, SC <- 0\n");
              
              pr.println("STA");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println ("Execute");
              pr.println ("    ");
              pr.println ("D3T4:");
              pr.println ("    ");
              pr.println ("M[AR] <- AC, SC <- 0\n");

               pr.close();
              
              jList2.setSelectedIndex(7);
    break;
   
    case "HLT":
    textMicro.setText("");
    
    
                
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              textMicro.append ("    ");
              textMicro.append ("rB0:");
              textMicro.append ("    ");
              textMicro.append ("S <- 0\n");
              
              pr.println("HLT");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println ("Execute");
              pr.println ("    ");
              pr.println ("rB0:");
              pr.println ("    ");
              pr.println ("S <- 0\n");

               pr.close();
              
    break;
    
    case "A, ":
        
         textMicro.setText("");
        
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              
              pr.println("A");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println("Execute");
              pr.println ("    ");

               pr.close();
    break;
    
    case "B, ":
         textMicro.setText("");
        
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              
              pr.println("B");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println("Execute");
              pr.println ("    ");

               pr.close();
    break;
    
    case "C, ":
         textMicro.setText("");
        
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              
              pr.println("C");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println("Execute");
              pr.println ("    ");

               pr.close();
              
    case "END":
        textMicro.setText("");
        
              textMicro.append("Fetch");
              textMicro.append ("    ");
              textMicro.append ("R'T0:");
              textMicro.append ("    ");
              textMicro.append ("AR <- PC\n");
              textMicro.append ("R'T1:");
              textMicro.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro.append("Decode");
              textMicro.append ("    ");
              textMicro.append ("R'T2:");
              textMicro.append ("    ");
              textMicro.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro.append ("                        ");
              textMicro.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro.append ("Execute");
              
              pr.println("END");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println ("R'T0:");
              pr.println ("    ");
              pr.println ("AR <- PC\n");
              pr.println ("R'T1:");
              pr.println ("IR <- M[AR], PC <- PC + 1\n");
              
              pr.println("Decode");
              pr.println ("    ");
              pr.println ("R'T2:");
              pr.println ("    ");
              pr.println ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              pr.println ("                        ");
              pr.println ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              pr.println("Execute");
              pr.println ("    ");

               pr.close();
                
    break;
    
  default:
    
    
    break;
        }
      
       
       if(ilerletme==8){
            ilerletme=0;
            
         
        }
        else{
        ilerletme++;
        }
        
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(_Grup_6_Sample_arayuz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_6_Sample_arayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jList7;
    private javax.swing.JList<String> jList8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea textMicro;
    // End of variables declaration//GEN-END:variables
}
