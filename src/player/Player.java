/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 * @version 2
 *เป็น class ที่ทำการส่งข้อมูลของเลือกเเละอาชีพให้ไฟล์ class Battle
 * @author PurachetZ
 */
public class Player {
    private double maxHp;
    private Job job;

    /**
    *method นี้จะรับการจากการรับข้อมูลผ่านเเป้นพิมมาเเล้วนำมาเข้าเงื่อนไข switch 
    *เพื่อทำการเลือกตัวละครเเละเลือด
    *@param p1Job รับค่า int เข้ามาใช้ในคิด maxHp และอาชีพของ player
    */
    public Player(int p1Job) {
        switch (p1Job) {
            case 1:
                this.maxHp = 2500;
                this.job = Job.Swordman;
                break;
            case 2:
                this.maxHp = 2000;
                this.job = Job.Gunner;
                break;
            case 3:
                this.maxHp = 1900;
                this.job = Job.Magician;
                break;
            case 4:
                this.maxHp = 1800;
                this.job = Job.Boxing;
                break;
        }
        
    }
    
    /**
    *@return อาชีพของ player เป็น String 
    */
    
    public Job getJob(){
        return this.job;
    }
    
    /**
    *@return Hpสูงสุดของ player เป็น double
    */
    
    public double getMaxHp() {
        return this.maxHp;
    }
    
    
}
