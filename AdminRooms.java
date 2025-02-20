/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hms.pro;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.Locale;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.Year;
import java.time.MonthDay;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.Month; 
import java.time.temporal.ChronoField;
import java.lang.Object;
import java.lang.Enum;
import java.sql.SQLException;
import java.util.Formatter;
import java.text.DateFormat;
import javax.swing.*;

/**
 *
 * @author lt1
 */
public class AdminRooms extends javax.swing.JPanel {
    
    /**
     * Creates new form MainDesk
     */
    public AdminRooms() {
        initComponents();
        
        resListFreeRooms();
        calcRooms();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRmsDis = new javax.swing.JTable();

        jtblRmsDis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room", "Floor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblRmsDis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 708, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    public void resListFreeRooms(){
        try {
            DefaultTableModel dt5 = (DefaultTableModel) jtblRmsDis.getModel();
            dt5.setRowCount(0);
           
            String Sdate = LocalDate.now().getDayOfMonth() +"/"+ LocalDate.now().getMonthValue() +"/" + LocalDate.now().getYear();
            String Edate = "31/12/" + LocalDate.now().getYear();
            Statement s5 = db1.mycon1().createStatement();
            ResultSet rs2 =  s5.executeQuery("SELECT rooms.room_num, rooms.room_id, rooms.floor ,rooms.price FROM rooms");
             while (rs2.next()) {              
           
                Vector v = new Vector();    
                v.add(rs2.getString(1)); //num
                v.add(rs2.getString(3)); //floor 
                dt5.addRow(v);
            }
            
            
        }catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void calcRooms(){
        int cRoomCount = jtblRmsDis.getRowCount();
        
        
       
       
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblRmsDis;
    // End of variables declaration//GEN-END:variables
}
