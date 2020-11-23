/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 * @version 3
 *เป็น class ที่จะเก็บข้อมูลประวัติการเล่นในรูปแบบอาเร่
 * @author mark
 */
public class Record {

    private int ary=0;
    private String[] record = new String[3];
    private String[] save = new String[3];

   /**
    * method นี้เป็น method ที่จะทำการรับข้อมูล String มาจาก class Play รวมถึง ค่าตำเเหน่งของอาเร่
    * เพื่อนำมาทำการเซตค่าประวัติในการเล่น
    * @param score ผู้ชนะ รับเป็นค่าเป็น String ใช้เพื่อเก็บประวัติ
    */ 
    
    public void record(String score) {
        if (ary >= 3) {
            set();
            ary = 2;     
        }        
        
        record[ary] = score;
        ary++;
       
    }

    /**
     *เนื่องจากเราจะเเสดงประวัติการเล่นล่าสุด 3 อัน จะสร้าง method นี้เพื่อทำการย้ายตำเเหน่งของค่า
     * เเละจะได้รับค่าหรือประวัติการเล่นล่าสุดได้
     * เหตุที่ต้องทำอาเร่ อีกอันเพื่อเก็บค่าอันเก่าก่อนเเล้วจึงทำการลบข้อมูลเเล้วจึงเเทนข้อมูลใหม่อีกรอบ
     * เนื่องจากการให้ค่าของตัวเเปร1เท่ากับตัวเเปร2 ถ้าตัวเเปร1เปลี่ยนตัวเเปร2ก็จะเปลี่ยนด้วยจึงได้ทำวิธีนี้เพื่อ
     * เเก้ไขปัญหานั้น
     */
    
    public void set() {
        for (int i = 1; i < 3; i++) {
            save[i - 1] = record[i];
        }
        for (int i = 0; i < 3; i++) {
            record[i] = null;
        }
        for (int i = 0; i < 3; i++) {
            record[i] = save[i];
        }
             for (int i = 0; i < 3; i++) {
              save[i]= null;
        }
      }

    /**
     *จะทำการ print ค่าที่อยู่ในอาเร่ซื่งนั่นคือประวัติการเล่น
     */
    
    public void String() {
        for (int i = 0; i < 3; i++) {
            System.out.println(record[i]);
        }
        System.out.println("♚♚♚♚♚♚♚♚♚♚♚♚♚♚");
    }
}
