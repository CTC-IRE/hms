/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hms.pro;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JOptionPane;



/**
 *
 * @author lt1
 */
public class Charges extends javax.swing.JPanel {
    int cycCount = 0;
    String txnsdetails = "";
    String txnlogs = "";
    public Charges() {
        initComponents();
        ResDis();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Charges().setVisible(true);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lineBorder1 = (javax.swing.border.LineBorder)javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0));
        btnConPay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPayments = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrevRun = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taInv = new javax.swing.JTextPane();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/img/invo.png"))); // NOI18N
        btnConPay.setText("APPLY CHARGES");
        btnConPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConPayActionPerformed(evt);
            }
        });
        add(btnConPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 180, 50));

        jtblPayments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Reservation", "Surname", "Name", "Room", "From", "To", "Notes", "Created", "Status", "Reference", "ClientNo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblPayments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jtblPayments.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jtblPayments);
        if (jtblPayments.getColumnModel().getColumnCount() > 0) {
            jtblPayments.getColumnModel().getColumn(0).setResizable(false);
            jtblPayments.getColumnModel().getColumn(0).setPreferredWidth(4);
            jtblPayments.getColumnModel().getColumn(1).setResizable(false);
            jtblPayments.getColumnModel().getColumn(1).setPreferredWidth(40);
            jtblPayments.getColumnModel().getColumn(2).setResizable(false);
            jtblPayments.getColumnModel().getColumn(2).setPreferredWidth(40);
            jtblPayments.getColumnModel().getColumn(3).setResizable(false);
            jtblPayments.getColumnModel().getColumn(3).setPreferredWidth(6);
            jtblPayments.getColumnModel().getColumn(4).setResizable(false);
            jtblPayments.getColumnModel().getColumn(4).setPreferredWidth(34);
            jtblPayments.getColumnModel().getColumn(5).setResizable(false);
            jtblPayments.getColumnModel().getColumn(5).setPreferredWidth(34);
            jtblPayments.getColumnModel().getColumn(6).setResizable(false);
            jtblPayments.getColumnModel().getColumn(6).setPreferredWidth(45);
            jtblPayments.getColumnModel().getColumn(7).setResizable(false);
            jtblPayments.getColumnModel().getColumn(7).setPreferredWidth(26);
            jtblPayments.getColumnModel().getColumn(8).setResizable(false);
            jtblPayments.getColumnModel().getColumn(8).setPreferredWidth(4);
            jtblPayments.getColumnModel().getColumn(9).setResizable(false);
            jtblPayments.getColumnModel().getColumn(10).setResizable(false);
            jtblPayments.getColumnModel().getColumn(10).setPreferredWidth(21);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1070, 270));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("RATE CHARGE ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 33));

        jLabel14.setText("Charges Details");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 20));

        jLabel15.setText("Previous Run Date:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 130, 30));
        add(txtPrevRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, 120, 30));

        taInv.setEditable(false);
        taInv.setBorder(null);
        taInv.setAutoscrolls(false);
        taInv.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        taInv.setMargin(new java.awt.Insets(8, 8, 2, 6));
        jScrollPane3.setViewportView(taInv);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 800, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConPayActionPerformed
        chgCommit();
        
    }//GEN-LAST:event_btnConPayActionPerformed
     public void ResDis(){
        String Sdate = LocalDate.now().getYear()+"-"+ LocalDate.now().getMonthValue() +"-" +LocalDate.now().getDayOfMonth();
        int tYerr = LocalDate.now().getYear();
        String Edate = (tYerr + 1) + "-12-31";
        try {
          int txnNum=0;
          DefaultTableModel dt1 = (DefaultTableModel) jtblPayments.getModel();
          dt1.setRowCount(0);
          taInv.setText("\n  Rate Charge List --- " + Sdate + "---\n");
          getCycle();
          Statement s19 = db1.mycon1().createStatement();
          ResultSet rs15 =  s19.executeQuery("SELECT txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth FROM txns ;");
          rs15.beforeFirst();
          while (rs15.next()){
                txnNum = txnNum + 1;
          }rs15.close();
          Statement s = db1.mycon1().createStatement();
          //                                                    1               2               3                       4                        5                      6                     7                       8                     9                   10               11         12                 13                   14                  
          ResultSet rs =  s.executeQuery("SELECT reservations.res_id, guests.LastName, guests.FirstName, reservations.room_no, reservations.date_start, reservations.date_end, reservations.notes, reservations.date_resmade, reservations.status, reservations.guest_id, guests.ID, guests.Reference, guests.LastDate, reservations.charge FROM guests INNER JOIN reservations ON guests.ID = reservations.guest_id WHERE ((((reservations.date_start) <= '" + Edate + "') ) AND  ((reservations.date_end) >= '" + Sdate + "') );");
           
            while (rs.next()) {              
           
                Vector v = new Vector();    
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(12));
                v.add(rs.getString(10));
           
                dt1.addRow(v);
                txnsdetails = ("LOG: " + rs.getString(1) + ": " + rs.getString(2) + ": " + rs.getString(3) + ": " + rs.getString(4) + ": " + rs.getString(5) + ": " + rs.getString(6) + ": " + rs.getString(7) + ": "+ rs.getString(8) +": " + rs.getString(9) + ": " + rs.getString(10) + ": "+ rs.getString(11) + ": " + rs.getString(12) + ": " + rs.getString(13) + ": " + rs.getString(14) + ":EOL:\n") ;
                String txnAdd1 = ("INSERT INTO txns ( txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth ) VALUES ");
                String txnAdd2 = ("('" + txnNum + "', '"+ Sdate + "', 'RateCharge', '" + rs.getString(1) + "', '" + rs.getString(4) + "', '"+ rs.getString(10) + "', '" + rs.getString(4) + "', '"+ String.valueOf(txnsdetails) + "', '-" + rs.getString(14) + "', '');");
                String toDB2 = txnAdd1 + txnAdd2;
                taInv.setText(taInv.getText()+ "  " + Sdate + "-Que>" + rs.getString(1) + "  "+ rs.getString(3) + "\t  " + rs.getString(2) + "\t  " + rs.getString(4)  + "\t  " + rs.getString(11) + "\t  " + rs.getString(14) + "\n");
                txnNum = txnNum + 1;
            }
            ///Display Only
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Res Display error","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    private void getCycle(){
        try{
            Statement s19 = db1.mycon1().createStatement();
            ResultSet rs15 =  s19.executeQuery("SELECT blilcycl.BillingCycl_id, blilcycl.Date_Run, blilcycl.ResevBilld, blilcycl.BillLogg, blilcycl.V1, blilcycl.V2, blilcycl.V3, blilcycl.LastRun FROM blilcycl ;");
            while(rs15.next()){
                cycCount = cycCount +1;
            }
            txtPrevRun.setText( rs15.getString(2).toString());
            
            rs15.close();
        }catch(SQLException billy){
            
            txtPrevRun.setText(LocalDate.now().getYear()+"-"+ LocalDate.now().getMonthValue() +"-" +LocalDate.now().getDayOfMonth());
        }
     
     }
     
    /////////////////add to DB
    
    public void chgCommit(){
      String Sdate = LocalDate.now().getYear()+"-"+ LocalDate.now().getMonthValue() +"-" +LocalDate.now().getDayOfMonth();
      int tYerr = LocalDate.now().getYear();
      String Edate = (tYerr + 1) + "-12-31";
      if  (txtPrevRun.getText().toString() != Sdate){
        try {
            int txnNum=0; 
            
            DefaultTableModel dt1 = (DefaultTableModel) jtblPayments.getModel();
            dt1.setRowCount(0);
            
            taInv.setText("\n  Rate Charge List --- " + Sdate + "---\n");
            Statement s19 = db1.mycon1().createStatement();
            ResultSet rs15 =  s19.executeQuery("SELECT txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth FROM txns ;");
            rs15.beforeFirst();
            while (rs15.next()){
                txnNum = txnNum + 1;
            }rs15.close();
          
            Statement s = db1.mycon1().createStatement();
            //                                                    1               2               3                       4                        5                      6                     7                       8                     9                   10               11         12                 13                   14                  
            ResultSet rs =  s.executeQuery("SELECT reservations.res_id, guests.LastName, guests.FirstName, reservations.room_no, reservations.date_start, reservations.date_end, reservations.notes, reservations.date_resmade, reservations.status, reservations.guest_id, guests.ID, guests.Reference, guests.LastDate, reservations.charge FROM guests INNER JOIN reservations ON guests.ID = reservations.guest_id WHERE ((((reservations.date_start) <= '" + Edate + "') ) AND  ((reservations.date_end) >= '" + Sdate + "') );");
           
            while (rs.next()) {              
                Vector v = new Vector();    
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(12));
                v.add(rs.getString(10));
           
                dt1.addRow(v);
                
                txnsdetails = ("LOG: " + rs.getString(1) + ": " + rs.getString(2) + ": " + rs.getString(3) + ": " + rs.getString(4) + ": " + rs.getString(5) + ": " + rs.getString(6) + ": " + rs.getString(7) + ": "+ rs.getString(8) +": " + rs.getString(9) + ": " + rs.getString(10) + ": "+ rs.getString(11) + ": " + rs.getString(12) + ": " + rs.getString(13) + ": " + rs.getString(14) + ":EOL:\n") ;
                txnlogs = txnlogs + txnsdetails;
                String txnAdd1 = ("INSERT INTO txns ( txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth ) VALUES ");
                String txnAdd2 = ("('" + cycCount + "', '"+ Sdate + "', 'RateCharge', '" + rs.getString(1) + "', '" + rs.getString(4) + "', '"+ rs.getString(10) + "', '" + rs.getString(4) + "', '"+ String.valueOf(txnsdetails) + "', '-" + rs.getString(14) + "', '');");
                String toDB2 = txnAdd1 + txnAdd2;
                taInv.setText(taInv.getText() + "  " + Sdate + "-Charged>" + rs.getString(1) + "  " +rs.getString(3) + "\t  " + rs.getString(2) + "\t  " + rs.getString(4)  + "\t  " + rs.getString(11) + "\t  " + rs.getString(14) + "\n");
                txnNum = txnNum + 1;
              
                Statement s99 = db1.mycon1().createStatement();
                try { 
                
                    s99.executeUpdate(toDB2);
                } catch (SQLException e) { 
                    JOptionPane.showMessageDialog(null, "TXN update error","ERROR", JOptionPane.ERROR_MESSAGE);
                }         
                 s99.close();             
            }
            /////Rec Cycle
            ///                                                               1                 2                   3               4               5               6           7           8            
                String txnAdd1 = ("INSERT INTO blilcycl ( blilcycl.BillingCycl_id, blilcycl.Date_Run, blilcycl.ResevBilld, blilcycl.BillLogg, blilcycl.V1, blilcycl.V2, blilcycl.V3, blilcycl.LastRun) VALUES ");
                String txnAdd2 = (" ('" + cycCount + "', '"+ Sdate + "','0' ,'"  + txnlogs + "','' ,'' ,'' ,'"+ (txtPrevRun.getText()) +"'); ");
                String toDB3 = txnAdd1 + txnAdd2;
                
                Statement s49 = db1.mycon1().createStatement();
                try { 
                
                    s49.executeUpdate(toDB3);
                } catch (SQLException e) { 
                    JOptionPane.showMessageDialog(null, "TXN update error","ERROR", JOptionPane.ERROR_MESSAGE);
                }         
                 s49.close(); 
             
            try {
                    printComponentToPrinter(taInv, true);
                
            } catch (PrinterException exp) {
                 
            }
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        }else{
             JOptionPane.showMessageDialog(null, "Charges Already Applied Today","ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }
   
    //Printing //////////////////////////////////////////////////////////////
    
    public static void printComponentToPrinter(JComponent comp, boolean fill) throws PrinterException {  
        String fileLoc = "";
        Paper paper = new Paper();
        paper.setSize(595, 842);
        paper.setImageableArea(1, 1, 595, 872);
        
        PageFormat pf = new PageFormat();
        pf.setPaper(paper);
       
        BufferedImage img = new BufferedImage(595, 872 ,BufferedImage.SCALE_SMOOTH);

        Graphics2D g2d = img.createGraphics();
        g2d.translate(pf.getImageableX(),pf.getImageableY());
        g2d.scale(1.2, 1);
        
        
        //Graphics2D graphics2D = img.getWidth()
        ComponentPrinter cp = new ComponentPrinter(comp, fill);
        PrinterJob  printJob = PrinterJob.getPrinterJob();

        printJob.setPrintable(cp);
        if(printJob.printDialog()) {
                printJob.print();
            }
            
       
        try {
            cp.print(g2d, pf, 0);
            
            
        } finally {
            g2d.dispose();
        }

        try {
            ImageIO.write(img, "png", new File("INVOICE_" + (LocalDate.now().format(DateTimeFormatter.ISO_DATE))   +".png"));
            fileLoc = ("INVOICE_" + (LocalDate.now().getDayOfMonth() +"-"+ LocalDate.now().getMonthValue() +"-" + LocalDate.now().getYear())   +".png");
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
       
            
        
    }
    
    public static class ComponentPrinter implements Printable {

        private JComponent comp;
        private boolean fill;

        public ComponentPrinter(JComponent comp, boolean fill) {
            this.comp = comp;
            this.fill = fill;
        }

        @Override
        public int print(Graphics g, PageFormat format, int page_index) throws PrinterException {

            if (page_index > 0) {
                return Printable.NO_SUCH_PAGE;
            }
            Paper paperq = new Paper();
            paperq.setSize(595, 872);
            paperq.setImageableArea(1, 1, 595, 872);
        
            PageFormat pf = new PageFormat();
            pf.setPaper(paperq);
            Graphics2D g2 = (Graphics2D) g;
            g2.translate(format.getImageableX(), format.getImageableY());

            double width = (int) Math.floor(format.getImageableWidth());
            double height = (int) Math.floor(format.getImageableHeight());

            if (!fill) {

                width = Math.min(width, comp.getPreferredSize().width) +200;/// HERERERERERER!!!!!!!
                height = Math.min(height, comp.getPreferredSize().height) ;

            }

            comp.setBounds(0, 0, (int) Math.floor(width), (int) Math.floor(height));
            if (comp.getParent() == null) {
                comp.addNotify();
            }
            comp.validate();
            comp.doLayout();
            comp.printAll(g2);
            if (comp.getParent() != null) {
                comp.removeNotify();
            }

            return Printable.PAGE_EXISTS;
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConPay;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jtblPayments;
    private javax.swing.border.LineBorder lineBorder1;
    private javax.swing.JTextPane taInv;
    private javax.swing.JTextField txtPrevRun;
    // End of variables declaration//GEN-END:variables
}
