
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


public class _Grup_6_CompareTwoNumbers_arayuz extends javax.swing.JFrame {

    
    public _Grup_6_CompareTwoNumbers_arayuz() {
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
        jScrollPane9 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textMicro1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("_Grup_6_CompareTwoNumbers_arayuz");

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

        jList7.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jList7);

        jList8.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane10.setViewportView(jList8);

        jLabel11.setText("Decimal");

        jLabel8.setText("Memory");

        jLabel10.setText("Hexadecimal");

        jLabel9.setText("Binary");

        jLabel12.setText("Octal");

        jLabel7.setText("Label");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addGap(93, 93, 93)
                .addComponent(jLabel8)
                .addGap(84, 84, 84)
                .addComponent(jLabel9)
                .addGap(68, 68, 68)
                .addComponent(jLabel10)
                .addGap(68, 68, 68)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7))
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jButton3.setText("Geri Dön");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Micro Operations"));

        textMicro1.setColumns(20);
        textMicro1.setRows(5);
        jScrollPane8.setViewportView(textMicro1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );

        jButton2.setText("İlerlet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> dizi = new ArrayList<>();
        ArrayList<String> dizi2 = new ArrayList<>();

        
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
            if(x.substring(3,4).equals(",")||x.substring(1,2).equals(",")){
              
                listmodel3.addElement(x);
    
                jList3.setModel(listmodel3);
     }       
       }
        
         _Grup_6_islemler_sinifi islem = new _Grup_6_islemler_sinifi();   
     
       for(int i=0;i<dizi2.size();i++){
       
           String x= dizi2.get(i);
           
           
switch (x.substring(0,3)) {
     case "ORG":
    System.out.println("ORG");
    
    islem.ORG(Integer.parseInt(x.substring(6,7)),x.substring(4,5));
    
    
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
    
    String a= dizi2.get(10);
       
    islem.LDA(Integer.parseInt(a.substring(9,10)));
    
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
   
    a= dizi2.get(9);
    
    islem.ADD(Integer.parseInt(a.substring(9,10)));
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6);
                
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);             
    break;
    
    case "SZA":
    System.out.println("SZA");
    if(islem.SZA()){
        i++;
    }
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6);
                
  listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);      
                
    break;
    
    case "CMA":
    System.out.println("STA");
    islem.CMA();
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6);
                
  listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);             
                
    break;
    
    case "INC":
    System.out.println("INC");
    islem.INC();
    
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
    
    case "WD1":
    System.out.println("WD1");
    System.out.println("WD1 TUTULDUĞU YER: "+islem.sira_adi+islem.sira);
    
    listmodel4.addElement(x.substring(0,3)+" "+islem.sira_adi+" "+islem.sira);
    
                jList4.setModel(listmodel4);
                
                
    islem.sira++;
    
    islem.binary=2;
    islem.hexadecimal="2";
    islem.Dondurme();
    islem.decimal=2;
    islem.octal=2;
    
    listmodel5.addElement(islem.bin);
                jList5.setModel(listmodel5);
                
    listmodel6.addElement(islem.hexadecimal);
                jList6.setModel(listmodel6);
    
    listmodel8.addElement(islem.octal);
                jList8.setModel(listmodel8);
                
    listmodel7.addElement(islem.decimal);
                jList7.setModel(listmodel7);              
    
    break;
    
    case "WD2":
    System.out.println("WD2");
    System.out.println("WD2 TUTULDUĞU YER: "+islem.sira_adi+islem.sira);
     
    listmodel4.addElement(x.substring(0,3)+" "+islem.sira_adi+" "+islem.sira);
    
                jList4.setModel(listmodel4);
                
    islem.binary=3;
    islem.hexadecimal="3";
    islem.Dondurme();
    islem.decimal=3;
    islem.octal=3;
    
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
    
    case "DEC":
    System.out.println("DEC");
    
    islem.binary=3;
    islem.hexadecimal="3";
    islem.Dondurme();
    islem.decimal=3;
    islem.octal=3;
    
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
    
    case "RES":
    System.out.println("RES");
    System.out.println("RES TUTULDUĞU YER: "+islem.sira_adi+islem.sira);
     
    listmodel4.addElement(x.substring(0,3)+" "+islem.sira_adi+" "+islem.sira);
    
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
    islem.END();
    
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
File myObj = new File("Output2.txt");
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
            PrintWriter pr = new PrintWriter("Output2.txt");
        
        jList2.setSelectedIndex(ilerletme);
        
       
        
        switch(jList2.getSelectedValue().substring(0, 3)){
        
          case "ORG":
    textMicro1.setText("");
        
               
        
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              textMicro1.append ("D2T4:");
              textMicro1.append ("    ");
              textMicro1.append ("DR <- M[AR]\n");
              textMicro1.append ("    ");
              textMicro1.append ("D2T5: ");
              textMicro1.append ("     ");
              textMicro1.append ("AC <- DR, SC <- 0\n");

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
              
              break;

   
    case "LDA":
   textMicro1.setText("");
        
               
        
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              textMicro1.append ("D2T4:");
              textMicro1.append ("    ");
              textMicro1.append ("DR <- M[AR]\n");
              textMicro1.append ("    ");
              textMicro1.append ("D2T5: ");
              textMicro1.append ("     ");
              textMicro1.append ("AC <- DR, SC <- 0\n");

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
              
      jList2.setSelectedIndex(10);
    
    break;
    
    case "ADD":
   
     textMicro1.setText("");
        
               
                
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              textMicro1.append ("D1T4:");
              textMicro1.append ("    ");
              textMicro1.append ("DR <- M[AR]\n");
              textMicro1.append ("    ");
              textMicro1.append ("D1T5: ");
              textMicro1.append ("     ");
              textMicro1.append ("AC <- AC + DR, E <- Cout, SC <- 0\n");
              
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
              
      jList2.setSelectedIndex(9);
    break;
    
    case "SZA":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              textMicro1.append ("rB2:");
              textMicro1.append ("    ");
              textMicro1.append ("If(AC = 0) then (PC <- PC + 1)\n");
              
              
              
              pr.println("SZA");
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
              pr.println ("rB2:");
              pr.println ("    ");
              pr.println ("If(AC = 0) then (PC <- PC + 1)\n");
              pr.close();
              
              
      
    break;
    
    case "CMA":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              textMicro1.append ("rB9:");
              textMicro1.append ("    ");
              textMicro1.append ("AC <- AC'\n");
              
              pr.println("CMA");
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
              pr.println("rB9:");
              pr.println ("    ");
              pr.println ("AC <- AC'\n");
              pr.close();
              
              
      
    break;
    
    case "INC":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              textMicro1.append ("rB5:");
              textMicro1.append ("    ");
              textMicro1.append ("AC <- AC + 1\n");
              
              
              pr.println("INC");
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
              pr.println ("rB5:");
              pr.println ("    ");
              pr.println ("AC <- AC + 1\n");
              pr.close();
              
      
    break;
    
    case "STA":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              textMicro1.append ("D3T4:");
              textMicro1.append ("    ");
              textMicro1.append ("M[AR] <- AC, SC <- 0\n");
              
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

              
              
      jList2.setSelectedIndex(13);
    break;
    
    case "HLT":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append ("Execute");
              textMicro1.append ("    ");
              
              
              
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
    
    case "WD1":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append("Execute");
              textMicro1.append ("    ");
              
              
              pr.println("WD1");
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
    
    case "WD2":
   textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append("Execute");
              textMicro1.append ("    ");
              
              
              pr.println("WD2");
              pr.println("Fetch");
              pr.println ("    ");
              pr.println("R'T0:");
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
    
    case "DEC":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append("Execute");
              textMicro1.append ("    ");
              
              
              pr.println("DEC");
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
    
    case "RES":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append("Execute");
              textMicro1.append ("    ");
              
              
              pr.println("RES");
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
    
    case "END":
    textMicro1.setText("");
    
              textMicro1.append("Fetch");
              textMicro1.append ("    ");
              textMicro1.append ("R'T0:");
              textMicro1.append ("    ");
              textMicro1.append ("AR <- PC\n");
              textMicro1.append ("R'T1:");
              textMicro1.append ("IR <- M[AR], PC <- PC + 1\n");
              
              textMicro1.append("Decode");
              textMicro1.append ("    ");
              textMicro1.append ("R'T2:");
              textMicro1.append ("    ");
              textMicro1.append ("D0, ..., D7 <- Decode IR(12 ~ 14),\n");
              textMicro1.append ("                        ");
              textMicro1.append ("AR <- IR(0 ~ 11), I <- IR(15)\n");
              
              textMicro1.append("Execute");
              textMicro1.append ("    ");
              
              
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
      
       if(ilerletme==14){
            ilerletme=0;
            
         
        }
        else{
        ilerletme++;
        }
         }
        catch (FileNotFoundException ex) {
            Logger.getLogger(_Grup_6_Sample_arayuz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Grup_6_CompareTwoNumbers_arayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jList7;
    private javax.swing.JList<String> jList8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea textMicro1;
    // End of variables declaration//GEN-END:variables
}
