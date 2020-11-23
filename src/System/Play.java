/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import player.Player;
import java.util.Scanner;

/**
 * @version 2
 *เป็นตัว class ที่จะรันตัว class อื่นๆในไฟล์ System
 * @author PurachetZ
 */
public class Play {
    private String wl;
    private Record rc = new Record();
    /**
    * method นี้จะเป็น method ที่ทำการเรียกใช้classต่างๆใน system โดยจะรับข้อมูลมาจากไฟล์Consoleคือจำนวนผู้เล่น
    *จากนั้นระบบจะทำการให้ userได้เลือกตัวละครของตนเเละคู่เเข่งของตน
    *จากนั้น class นี้จะส่งข้อมูลตัวที่ userเลือกไปยัง class Playerเพื่อให้ class playerส่งค่าของพลังชีวิตของเเต่ละตัวละครที่เลือดกลับมา
    *เเสดงให้userเห็นเเละส่งไปคิดคำนวณใน class ของ Battle จนกว่า จะมีคนที่พลังชีวิตเท่ากับหรือน้อยกว่า0 จึงทำการให้ ตัวเเปร wl 
    *เก็บประโยคที่บอกว่าเเพ้หรือชนะไว้ เเละให้ print ประโยคนั้นออกมาเเละส่งประโยคนั้นไปเก็บที่อาเร่ของ class Record เเละทำการเพิ่ม
    * ary ที่เอามาเป็นตำเเน่งของ ary เเละหลังจากจบระบบจะทำการเพิ่มต่า aryขึ้นหนึ่งเพื่อที่จะเก็บตำเเหน่งตัวต่อไป 
    *@param player รับค่า int เข้ามาใช้เพื่อกำหนดโหมดในการเล่น
     */
    public void playGame(int player) {
        int P1, P2;
        Scanner sc = new Scanner(System.in);
        String Character = 
                  "♚♚♚♚♚♚♚♚♚♚♚♚♚♚\n"
                +"1. Swordman \n"
                + "2. Gunner \n"
                + "3. Magician\n"
                + "4. Boxing\n"
                +"♚♚♚♚♚♚♚♚♚♚♚♚♚♚ ";
        do {
            System.out.println("P1 Choose");
            System.out.println(Character);
            System.out.print("Choose your character :\n");
            System.out.println("♚♚♚♚♚♚♚♚♚♚♚♚♚♚");
            P1 = sc.nextInt();
        } while (P1 != 1 && P1 != 2 && P1 != 3 && P1 != 4);

        do {
            System.out.println("P2 Choose");
            System.out.println(Character);
            System.out.print("Choose your character :\n");
            System.out.println("♚♚♚♚♚♚♚♚♚♚♚♚♚♚");
            P2 = sc.nextInt();
        } while (P2 != 1 && P2 != 2 && P2 != 3 && P2 != 4);
        Player p1 = new Player(P1);
        Player p2 = new Player(P2);
        Battle bs = new Battle(P1, P2, p1.getMaxHp(), p2.getMaxHp(), player);
        System.out.println("P1 is " + p1.getJob() + " HP: " + bs.getP1Hp() + "\nP2 is " + p2.getJob() + " HP: " + bs.getP2Hp());

        for (int turn = 1; bs.getP1Hp() > 0 && bs.getP2Hp() > 0; turn++) {
            System.out.println("Turn : " + turn);
            if (player == 1) {
                bs.battlePlay1(turn);
            }
            if (player == 2) {
                bs.battlePlay2(turn);
            }
            bs.damage(turn);
            if (turn % 2 == 0) {
                bs.getP1Hp();
            } else {

                bs.getP2Hp();
            }
            System.out.println(bs);
        }

        if (bs.getP1Hp() == 0) {
            wl = "P1 is lose";
        } else if (bs.getP2Hp() == 0) {
            wl = "P1 is win";
        }
        System.out.println(wl);
        rc.record(wl);
    }
/**
 *ให้ class Console ดึงข้อมูลจาก class Record เพราะเนื่องจากุclassนีิเป็น classที่ทำการเซตค่าในRecordจึงทำให้
 * ตัวของข้อมูลอยู่ในclassนี้ด้วยจึงต้องเรียกใช้อย่างนี้
 */
    public void callAry(){
    rc.String();
    }
}
