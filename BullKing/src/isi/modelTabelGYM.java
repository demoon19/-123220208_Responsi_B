/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isi;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Lab Informatika
 */
public class modelTabelGYM extends AbstractTableModel {
 List<dataGYM> db;
 public modelTabelGYM(List<dataGYM> db) {
     this.db = db;
 }
 
 @Override
 public int getRowCount(){
     return db.size();
 }
 
 @Override
 public int getColumnCount(){
     return 7;
 }
 
 @Override
 public String getColumnName(int column){
     switch(column){
         case 0:
             return "id";
         case 1:
             return "pemilik";
         case 2:
             return "alat";
         case 3:
             return "nomor";
         case 4:
             return "sewa";
         case 5:
             return "biaya";
         default:
             return null;
     }
 }
 @Override
 public Object getValueAt(int row, int column){
     switch(column){
     case 0:
        return db.get(row).getid();
     case 1:
         return db.get(row).getpemilik();
     case 2:
         return db.get(row).getalat();
     case 3:
         return db.get(row).getnomor();
     case 4:
         return db.get(row).getsewa();
     case 5:
         return db.get(row).getbiaya();
     default :
         return null;
 }
 }
}
