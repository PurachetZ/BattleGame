/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 * @version 1
 *เป็น classที่จะทำการสุ้มเลขเเละส่งค่าให้กัยclass ที่เรียกใช้ class นี้เพื่อนำมาคำนวณในโปรเเกรม
 * @author mark
 */

import java.util.Random;

public class Randomsm {
private Random rc = new Random();
    private int ran,player;

    /**
     *@return ส่งค่า randomตั้งเเต่ 1-6 เพื่อนำไปคิดค่า cri
     */
    
    public int ranDom() {
        ran = rc.nextInt(6) + 1;
        return ran;
    }

    /**
     *@return ส่งค่า randomตั้งเเต่ 1-4 เพื่อนำไปคิดสุ่ม skill เวลาเล่นคนเดียว
     */
    
    public int ranDomSkill(){
     player= rc.nextInt(4)+1;
    return player;
    }
}
