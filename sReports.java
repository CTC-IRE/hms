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
import java.lang.Object;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import static hms.pro.Payments.printComponentToPrinter;


public class sReports extends javax.swing.JPanel {
    int txxno = 0;
    String sDAte ="";
    String eDAte = "";
    int pAmnts = 0;
    int cAmnts = 0;
    double pTots = 0;
    double cTots = 0;
    int numTmp =0;    
    DecimalFormat cashFormer = new DecimalFormat("#,##0.00");
    
    
    public sReports() {
        initComponents();
        
        DateFill();
        
        
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sReports().setVisible(true);
            }
        });
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        butPrint = new javax.swing.JButton();
        cmboRepMonths = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        rbMonthly = new javax.swing.JRadioButton();
        rbDates = new javax.swing.JRadioButton();
        rbDate = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblTxnsDis = new javax.swing.JTable();
        btnSearchtxns = new javax.swing.JButton();
        ftxtFrom = new javax.swing.JFormattedTextField();
        ftxtTo = new javax.swing.JFormattedTextField();
        pantxxns = new javax.swing.JPanel();
        txtChkin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtChkout = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRptHead = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDateDis = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taInv = new javax.swing.JTextPane();
        txtRptHead1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/pro/img/reports.png"))); // NOI18N
        butPrint.setText("PRINT");
        butPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPrintActionPerformed(evt);
            }
        });
        add(butPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, 120, 80));

        cmboRepMonths.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        add(cmboRepMonths, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 115, -1));

        jLabel4.setText("To:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 30, 24));

        buttonGroup1.add(rbMonthly);
        rbMonthly.setSelected(true);
        rbMonthly.setText("Monthly");
        add(rbMonthly, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 130, -1));

        buttonGroup1.add(rbDates);
        rbDates.setText("Date Range");
        add(rbDates, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 170, -1));

        buttonGroup1.add(rbDate);
        rbDate.setText("Single Date (From)");
        add(rbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 130, -1));

        jtblTxnsDis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TXN", "DATE", "RES ID", "ROOM", "METHOD", "AMNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblTxnsDis.setColumnSelectionAllowed(true);
        jtblTxnsDis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jtblTxnsDis);
        jtblTxnsDis.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtblTxnsDis.getColumnModel().getColumnCount() > 0) {
            jtblTxnsDis.getColumnModel().getColumn(0).setResizable(false);
            jtblTxnsDis.getColumnModel().getColumn(0).setPreferredWidth(32);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 680, 520));

        btnSearchtxns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/pro/img/search x30.png"))); // NOI18N
        btnSearchtxns.setText("SEARCH");
        btnSearchtxns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchtxnsActionPerformed(evt);
            }
        });
        add(btnSearchtxns, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 120, 80));

        ftxtFrom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/y"))));
        add(ftxtFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 115, -1));

        ftxtTo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/y"))));
        add(ftxtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 610, 115, -1));

        pantxxns.setBackground(new java.awt.Color(255, 255, 255));
        pantxxns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtChkin.setEditable(false);
        txtChkin.setBorder(null);
        pantxxns.add(txtChkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 100, 20));

        jLabel8.setText("To:");
        pantxxns.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 40, 20));

        txtChkout.setEditable(false);
        txtChkout.setBorder(null);
        pantxxns.add(txtChkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 100, 20));

        jLabel13.setText("From:");
        pantxxns.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 40, 20));

        txtRptHead.setEditable(false);
        txtRptHead.setBorder(null);
        pantxxns.add(txtRptHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 260, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TRANSACTION REPORT");
        pantxxns.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtDateDis.setEditable(false);
        txtDateDis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDateDis.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtDateDis.setBorder(null);
        pantxxns.add(txtDateDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, 20));

        taInv.setEditable(false);
        taInv.setBackground(new java.awt.Color(255, 255, 255));
        taInv.setBorder(null);
        taInv.setAutoscrolls(false);
        taInv.setCaretColor(new java.awt.Color(204, 204, 204));
        taInv.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        taInv.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane3.setViewportView(taInv);

        pantxxns.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 470, 530));

        txtRptHead1.setEditable(false);
        txtRptHead1.setBorder(null);
        pantxxns.add(txtRptHead1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 260, -1));

        add(pantxxns, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 630));
    }// </editor-fold>//GEN-END:initComponents
       

    
    private void btnSearchtxnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchtxnsActionPerformed
            taInv.setText("");
       
        try{
            sDAte = ftxtFrom.getText();
            eDAte = ftxtTo.getText();
            
            if (sDAte.isEmpty() == true){
                sDAte = LocalDate.now().getYear()+"-01-01";
            }
            if (eDAte.isEmpty() == true){
                eDAte =  LocalDate.now().getYear() + "-12-31";
            }
            txtChkin.setText(sDAte);
            txtChkout.setText(eDAte);
                    
            DefaultTableModel dt13 = (DefaultTableModel) jtblTxnsDis.getModel();
            dt13.setRowCount(0);
            Statement s = db1.mycon1().createStatement();
            ResultSet rs =  s.executeQuery("SELECT txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth FROM txns WHERE  (((txns.type = 'Payment') OR (txns.type = 'RateCharge'))AND (txns.amtpay <> 0 ));");
            
            if (rbMonthly.isSelected() == true){
                int MonthSel = cmboRepMonths.getSelectedIndex();
                MonthSel = MonthSel+1;
                sDAte = LocalDate.now().getYear()+"-"+ MonthSel +"-01";
                eDAte = LocalDate.now().getYear()+"-"+ MonthSel +"-" +LocalDate.now().lengthOfMonth();
                rs =  s.executeQuery("SELECT txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth FROM txns WHERE ((((txns.created <= '" + eDAte + "') And (txns.created) >= '"+ sDAte +"'))  AND (txns.amtpay <> 0 ));");
            }
            if ((rbDate.isSelected() == true)&&(ftxtFrom.getText().isEmpty() == false)){
                rs =  s.executeQuery("SELECT txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth FROM txns WHERE ((txns.created == '" + sDAte + "') AND (txns.amtpay <> 0 )) ;");
            }
            if ((rbDates.isSelected() == true)&&(ftxtFrom.getText().isEmpty() == false)&&(ftxtTo.getText().isEmpty() == false)){
                rs =  s.executeQuery("SELECT txns.tx_id, txns.created, txns.type, txns.resv_no, txns.gu_rm_no, txns.gue_no, txns.rm_no, txns.details, txns.amtpay, txns.meth FROM txns WHERE ((((txns.created <= '" + eDAte + "') AND (txns.created) >= '"+ sDAte +"'))  AND (txns.amtpay <> 0 ));");
            }
            while (rs.next()) {              
           
                Vector v = new Vector();    
               
                v.add(rs.getString(1)); //TXN
                v.add(rs.getString(2)); //Datee
                v.add(rs.getString(6)); //REs ID
                v.add(rs.getString(7)); //Room
                v.add(rs.getString(10)); //Method 
                v.add(rs.getString(9)); //Amount
                txxno = Integer.valueOf(rs.getString(6));
                taInv.setText(taInv.getText()+"  " + rs.getString(2) +"  " + rs.getString(1) +"\t " + rs.getString(3) +"\t " + rs.getString(4) +"\t " + rs.getString(10) +"\t " + rs.getString(9) +"\t " );
                String tTyp = rs.getString(3);
                String  typeA =  "Payment";
                String  typeB = "RateCharge";
                
                if (tTyp.equals( typeA)){
                    pAmnts = pAmnts + 1;
                    pTots = pTots + rs.getInt(9);
                }
                if (tTyp.equals( typeB)){
                    cAmnts = cAmnts + 1;
                    cTots = cTots + rs.getInt(9);
                }
                
                dt13.addRow(v);
                }
                txtRptHead1.setText("Payments: \t"+ pAmnts + "\t Total: € "+pTots);
                txtRptHead.setText("Charges: \t" + cAmnts + "\t Total: €" +cTots);
         
        } catch (SQLException e) {
            System.out.println(e);
        }
      
        
    }//GEN-LAST:event_btnSearchtxnsActionPerformed

    private void butPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPrintActionPerformed
         try {
                    printComponentToPrinter(pantxxns, true);
                
            } catch (PrinterException exp) {
                 JOptionPane.showMessageDialog(null, "Printing Error","Missing Data Errors" , JOptionPane.ERROR_MESSAGE);
            }
            
        
        
    }//GEN-LAST:event_butPrintActionPerformed
    
    public void DateFill(){
            //Run once, hopefully
            sDAte = LocalDate.now().getYear()+"-"+ LocalDate.now().getMonthValue() +"-" +LocalDate.now().getDayOfMonth();
            eDAte =   LocalDate.now().getYear() + "-12-31";
            ftxtFrom.setText(sDAte);
            ftxtTo.setText(eDAte);
            txtDateDis.setText(sDAte);
       
    }
    
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
    private javax.swing.JButton btnSearchtxns;
    private javax.swing.JButton butPrint;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JComboBox<String> cmboRepMonths;
    private javax.swing.JFormattedTextField ftxtFrom;
    private javax.swing.JFormattedTextField ftxtTo;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtblTxnsDis;
    private javax.swing.JPanel pantxxns;
    private javax.swing.JRadioButton rbDate;
    private javax.swing.JRadioButton rbDates;
    private javax.swing.JRadioButton rbMonthly;
    private javax.swing.JTextPane taInv;
    private javax.swing.JTextField txtChkin;
    private javax.swing.JTextField txtChkout;
    private javax.swing.JTextField txtDateDis;
    private javax.swing.JTextField txtRptHead;
    private javax.swing.JTextField txtRptHead1;
    // End of variables declaration//GEN-END:variables
}
