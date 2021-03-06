/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Process.*;
/**
 *
 * @author HoangDuoc
 */
public class Thongke extends javax.swing.JInternalFrame {

    /**
     * Creates new form Thongke
     */
    public Thongke() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbslSach = new javax.swing.JRadioButton();
        btThongke = new javax.swing.JButton();
        rbslNgonngu = new javax.swing.JRadioButton();
        rbslTacgia = new javax.swing.JRadioButton();
        rbslLinhvuc = new javax.swing.JRadioButton();
        rdBtnDocumentLend = new javax.swing.JRadioButton();
        rdbtnDocumentTooDeadline = new javax.swing.JRadioButton();
        rdbtnReadersList = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Giao Diện Thống Kê");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiêu chí thống kê"));

        buttonGroup1.add(rbslSach);
        rbslSach.setText("Số lượng hiện có của mỗi cuốn ");

        btThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Notes.png"))); // NOI18N
        btThongke.setText("Thống Kê");
        btThongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongkeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbslNgonngu);
        rbslNgonngu.setText("Số lượng hiện có theo ngôn ngữ");

        buttonGroup1.add(rbslTacgia);
        rbslTacgia.setText("Số lượng hiện có của tác giả");

        buttonGroup1.add(rbslLinhvuc);
        rbslLinhvuc.setText("Số lượng hiên có theo lĩnh vực");

        buttonGroup1.add(rdBtnDocumentLend);
        rdBtnDocumentLend.setText("Các tài liệu đang cho mượn");
        rdBtnDocumentLend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnDocumentLendActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnDocumentTooDeadline);
        rdbtnDocumentTooDeadline.setText("Các tài liệu đến hạn nhưng chưa trả");
        rdbtnDocumentTooDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnDocumentTooDeadlineActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnReadersList);
        rdbtnReadersList.setText("Danh sách bạn đọc");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbslSach)
                    .addComponent(rbslNgonngu)
                    .addComponent(rbslTacgia))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbslLinhvuc)
                    .addComponent(rdBtnDocumentLend)
                    .addComponent(rdbtnDocumentTooDeadline))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbtnReadersList))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbslSach)
                    .addComponent(rbslLinhvuc)
                    .addComponent(rdbtnReadersList))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbslNgonngu)
                            .addComponent(rdBtnDocumentLend))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbslTacgia)
                            .addComponent(rdbtnDocumentTooDeadline))
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThongke, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Báo cáo "));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Stocks.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongkeActionPerformed
        if(rbslSach.isSelected()){
            loadThongke.loadTensach(table);
        }else if(rbslNgonngu.isSelected()){
            loadThongke.loadNgonngu(table);
        }else if(rbslTacgia.isSelected()){
            loadThongke.loadTacgia(table);
        }else if(rdBtnDocumentLend.isSelected()){
            loadThongke.loadDocumentLending(table);
        }else if(rdbtnDocumentTooDeadline.isSelected()){
            loadThongke.loadDocumentOutOfDate(table);
        }else if(rdbtnReadersList.isSelected()){
            loadThongke.loadReadersList(table);
        }
    }//GEN-LAST:event_btThongkeActionPerformed

    private void rdBtnDocumentLendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnDocumentLendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdBtnDocumentLendActionPerformed

    private void rdbtnDocumentTooDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnDocumentTooDeadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnDocumentTooDeadlineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThongke;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbslLinhvuc;
    private javax.swing.JRadioButton rbslNgonngu;
    private javax.swing.JRadioButton rbslSach;
    private javax.swing.JRadioButton rbslTacgia;
    private javax.swing.JRadioButton rdBtnDocumentLend;
    private javax.swing.JRadioButton rdbtnDocumentTooDeadline;
    private javax.swing.JRadioButton rdbtnReadersList;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
