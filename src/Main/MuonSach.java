/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Process.MuonTra;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author nguyenthienbao
 */
public class MuonSach extends javax.swing.JInternalFrame {

    /**
     * Creates new form MuonSach
     */
    public MuonSach(String msnv) {
        this.msnv = msnv;
        initComponents();
        txt_MSS.setEnabled(false);
        txt_TenSach.setEnabled(false);
        bon_TimSach.setEnabled(false);
        //table.addMouseListener(this);
    }
    
   
    //Tìm người sử dụng
    public void findUser(){
        ArrayList<String> array = MuonTra.getMSND();
        String str = txt_MSND.getText();
        int size = array.size();
        for (int i = 0; i < size; i = i + 2){
            if (array.get(i).equals(str)){
                txt_MSS.setEnabled(true);
                txt_TenSach.setEnabled(true);
                bon_TimSach.setEnabled(true);
                txt_MSND.setEnabled(false);
                bon_TimND.setEnabled(false);
                lbl_NSD.setText(array.get(i+1));
                lbl_MSND.setText(array.get(i));
                strNumber = array.get(i);
                lbl_Count.setText(""+(6 - MuonTra.getCount(strNumber)));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Không tồn tại MSND");
        txt_MSND.setText("");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_MSND = new javax.swing.JTextField();
        txt_MSS = new javax.swing.JTextField();
        bon_TimND = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_TenSach = new javax.swing.JTextField();
        bon_TimSach = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pel_Table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbl_NSD = new javax.swing.JLabel();
        lbl_MSND = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Count = new javax.swing.JLabel();
        lbl_Notifi = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Mượn Sách");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mượn Sách"));

        jLabel1.setText("Nhập MSND:");

        txt_MSND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MSNDActionPerformed(evt);
            }
        });

        bon_TimND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_48.png"))); // NOI18N
        bon_TimND.setText("Người Dùng");
        bon_TimND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bon_TimNDActionPerformed(evt);
            }
        });

        jLabel3.setText("Nhập Tên Sách:");

        bon_TimSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dilai.png"))); // NOI18N
        bon_TimSach.setText("Tìm Sách");
        bon_TimSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bon_TimSachActionPerformed(evt);
            }
        });

        jLabel4.setText("Nhập MSS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_MSND, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(txt_MSS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bon_TimND)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(txt_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bon_TimSach)
                .addGap(284, 284, 284))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bon_TimND)
                    .addComponent(txt_MSND, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_MSS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bon_TimSach))
        );

        pel_Table.setBorder(javax.swing.BorderFactory.createTitledBorder("Kết quả"));

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "MS", "Tên Sách", "Ngôn Ngữ", "Lĩnh Vực", "Mượn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setToolTipText("");
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout pel_TableLayout = new javax.swing.GroupLayout(pel_Table);
        pel_Table.setLayout(pel_TableLayout);
        pel_TableLayout.setHorizontalGroup(
            pel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        pel_TableLayout.setVerticalGroup(
            pel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        lbl_NSD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_NSD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_MSND.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_MSND.setForeground(new java.awt.Color(255, 51, 0));
        lbl_MSND.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Số sách có thể mượn:");

        lbl_Count.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_Count.setForeground(new java.awt.Color(255, 51, 0));
        lbl_Count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_Notifi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_Notifi.setForeground(new java.awt.Color(255, 51, 0));
        lbl_Notifi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Notifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MSND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(lbl_NSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lbl_Count, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_NSD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_MSND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Count, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_Notifi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_ok.png"))); // NOI18N
        jButton1.setText("Mượn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button_cancel.png"))); // NOI18N
        jButton2.setText("Hủy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shutdown.png"))); // NOI18N
        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pel_Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pel_Table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bon_TimNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bon_TimNDActionPerformed
        // TODO add your handling code here:
        findUser();
    }//GEN-LAST:event_bon_TimNDActionPerformed

    private void txt_MSNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MSNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MSNDActionPerformed

    private void bon_TimSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bon_TimSachActionPerformed
        // TODO add your handling code here:
//        record = MuonTra.layDuLieu(txt_TenSach.getText(), txt_MSS.getText());
//        table.setModel(new DefaultTableModel(record,title));
        String mss = txt_MSS.getText();
        String tensach = txt_TenSach.getText();
        MuonTra.loadtableTen(tensach, mss,table);
        //System.out.println(record.size());
        
    }//GEN-LAST:event_bon_TimSachActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txt_MSND.setText("");
        txt_MSS.setText("");
        txt_MSS.setEnabled(false);
        txt_TenSach.setEnabled(false);
        bon_TimND.setEnabled(true);
        bon_TimSach.setEnabled(false);
        txt_MSND.setEnabled(true);
        lbl_NSD.setText("");
        lbl_MSND.setText("");
        lbl_Count.setText("");
        lbl_Notifi.setText("");
        MuonTra.xoaDuLieu(table);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int numberSize = table.getRowCount();
        for (int i = 0; i < numberSize; i++){
            
            if (table.getValueAt(i, 5).equals(true)){
                checkValue.addElement((String) table.getValueAt(i, 1));
            }
        }
        
        int size = checkValue.size();
        
        int sizeInt = Integer.parseInt("0" + lbl_Count.getText());
        
        System.out.println(size);
        if (size > sizeInt){
            JOptionPane.showMessageDialog(null, "Bạn mượn quá số sách cho phép");
            checkValue.removeAllElements();
            checkValue.removeAllElements();
            return;
        }
        else if (size <= 0){
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn sách sẽ mượn");
            checkValue.removeAllElements();
            return;
        }
        MuonTra.updateValue(checkValue,"NV004",lbl_MSND.getText());
        lbl_Count.setText(""+(6 - MuonTra.getCount(lbl_MSND.getText())));
        checkValue.removeAllElements();
        MuonTra.loadtableTen(txt_TenSach.getText(), txt_MSS.getText(),table);
        lbl_Notifi.setText("Bạn đã mượn được sách");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private String msnv = "";
    private String strNumber = "";
    private Vector<String> checkValue = new Vector<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bon_TimND;
    private javax.swing.JButton bon_TimSach;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Count;
    private javax.swing.JLabel lbl_MSND;
    private javax.swing.JLabel lbl_NSD;
    private javax.swing.JLabel lbl_Notifi;
    private javax.swing.JPanel pel_Table;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt_MSND;
    private javax.swing.JTextField txt_MSS;
    private javax.swing.JTextField txt_TenSach;
    // End of variables declaration//GEN-END:variables

    

    
}