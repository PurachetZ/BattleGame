/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import System.*;
import java.util.Scanner;

/**
 * @version 2
 *เป็นตัวที่จะรันตัวไฟล์ต่างๆ
 * @author PurachetZ
 */
public class Console {

    /**
     * @param args args ทำงานทั้งหมดของแต่ละ Statement ด้านใน
     * จะทำการ print ตัวเมนูเเล้วจะทำการรับข้อมูลจากเป็นพิม
     * จากนั้นจะทำการเช็ดว่าตรงกับเนื่องไขส่วนไหนเเละทำตาม case ของ switch โดย
     * case1 จะเป็นเข้าใช้งานส่วนที่เราเล่นเกม จะมีให้เลือก 2 โหมด คือ
     * เล่นคนเดียว หรือเล่นหลายคน ส่วน case2
     * จะเป็นการอ่านค่าอาเร่ของตัวบันทึกประวัติการเล่นโดยจะดึงข้อมูล มาจากclass
     * Record เเละเเต่ละการรับข้อมูลจะมี do while
     * ครอบไว้เพื่อกันการใส่ค่าที่เราไม่ใช่ให้ user กรอกเลขใหม่อีกรอบ
     */
    public static void main(String[] args) {
        Play p = new Play();
        Scanner sc = new Scanner(System.in);
        int select, player;
        String menu = 
                   "♚♚♚♚♚♚♚♚♚♚♚♚♚♚\n"
                +"1.Play game   \n"
                +"2.Record         \n"
                +"0.Exit               \n"
                +"♚♚♚♚♚♚♚♚♚♚♚♚♚♚";
        String playMenu = 
                 "♚♚♚♚♚♚♚♚♚♚♚♚♚♚\n"
             +"1.Play Alone\n" 
             + "2.Play multiplayer\n" 
             + "0.Exit \n"
             +"♚♚♚♚♚♚♚♚♚♚♚♚♚♚";

        System.out.println("Welcome to THIS GAME");

        do {
            System.out.println("");
            System.out.println(menu);
            System.out.print("Your choose>>");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    do {
                        System.out.println("Play alone or play multiplayer");
                        System.out.println(playMenu);
                        System.out.print("Your choose>>");
                        player = sc.nextInt();
                        if (player == 1 || player == 2) {
                            p.playGame(player);
                        }
                    } while (player != 0);

                    break;
                case 2:
                   
                    p.callAry();
                    break;
            }
        } while (select != 0);

    }
}
