/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

/**
 * @version 1 เป็น class ที่จะเเยกเป็นการเล่นคนเดียวหรือเล่นหลายคน
 * @author mark
 */
public class Battle {

    private double hp1;
    private double hp2;
    private int P1;
    private int P2;
    private int p;
    private int player;
    private Attack2 s2 = new Attack2();
    private Attack1 s1 = new Attack1();

    /**
     *
     * ตัว constructors นี้จะทำการรับข้อมูลมาจาด class
     * playเพื่อนำมาเรียกใช้ตัวใน methods ของตัวนี้ ได้เเก่ battlePlay1
     * ที่ไว้เล่นคนเดียว เเละ battlePlay2 ที่ไว้เล่นคนสองคน
     *
     * @param P1  ตัวเลขอาชีพของ player1 รับค่าเป็น int
     * @param P2  ตัวเลขอาชีพของ player2 รับค่าเป็น int
     * @param maxHp1  พลังชีวิตสูงสุดของ player1 รับค่าเป็น double
     * @param maxHp2  พลังชีวิตสูงสุดของ player2 รับค่าเป็น double
     * @param player  จำนวน player ที่เล่น รับค่าเป็น int
     */
    public Battle(int P1, int P2, double maxHp1, double maxHp2, int player) {

        this.hp1 = maxHp1;
        this.hp2 = maxHp2;
        this.P1 = P1;
        this.P2 = P2;
        this.player = player;
    }

    /**
     *
     * methods ตัวนี้จะทำการรับค่า turn จาก loop for
     * ที่ทำการเช็ดพลังชีวิตของเเต่ลฝ่าย เเละนำมาหาตามของคนนั้นรวมุถึงเรียกใช้
     * class Attack1 เพื่อนำมาคำนวณต่อไป
     *
     * @param turn รับค่าเทิร์น เป็น int เพื่อนำมาเช็ดว่าอยู่ในตาของใครอยู่นะตอนนี้
     */
    public void battlePlay1(int turn) {
        if (p(turn) == 1) {
            switch (this.P1) {
                case 1:
                    s1.swordman(p(turn));
                    break;
                case 2:
                    s1.gunner(p(turn));
                    break;
                case 3:
                    s1.magician(p(turn));
                    break;
                case 4:
                    s1.boxing(p(turn));
                    break;
            }
        } else if (p(turn) == 2) {
            switch (this.P2) {
                case 1:
                    s1.swordman(p(turn));
                    break;
                case 2:
                    s1.gunner(p(turn));
                    break;
                case 3:
                    s1.magician(p(turn));
                    break;
                case 4:
                    s1.boxing(p(turn));
                    break;
            }
        }
    }
        
         /**
     *
     * methods ตัวนี้จะทำการรับค่า turn จาก loop for
     * ที่ทำการเช็ดพลังชีวิตของเเต่ลฝ่าย เเละนำมาหาตามของคนนั้นรวมุถึงเรียกใช้
     * class Attack2 เพื่อนำมาคำนวณต่อไป
     *
     * @param turn รับค่าเทิร์น เป็น int เพื่อนำมาเช็ดว่าอยู่ในตาของใครอยู่นะตอนนี้
     */
   
    public void battlePlay2(int turn) {
        if (p(turn) == 1) {
            switch (this.P1) {
                case 1:
                    s2.swordman(p(turn));
                    break;
                case 2:
                    s2.gunner(p(turn));
                    break;
                case 3:
                    s2.magician(p(turn));
                    break;
                case 4:
                    s2.boxing(p(turn));
                    break;
            }
        } else if (p(turn) == 2) {
            switch (this.P2) {
                case 1:
                    s2.swordman(p(turn));
                    break;
                case 2:
                    s2.gunner(p(turn));
                    break;
                case 3:
                    s2.magician(p(turn));
                    break;
                case 4:
                    s2.boxing(p(turn));
                    break;
            }
        }
    }

    /**
     * methods ตัวนี้จะทำการรับค่า Damage มาจาก
     * methodsbattlePlay1เเละbattlePlay2 ข้างบน
     * เเละนำมาหักค่าพลังชีวิตของเเต่ละฝ่ายโดยคำนวณจาก turn%2 ว่าเป็นturn
     * เลขคู่หรือคี่
     *
     * @param turn รับค่าเทิร์น เป็น int เพื่อนำมาเช็ดว่าอยู่ในตาของใครอยู่นะตอนนี้
     */
    public void damage(int turn) {
        if (this.player == 1) {
            if (p(turn) == 2) {
                hp1 = hp1 - s1.getDam();
                if (hp1 <= 0) {
                    hp1 = 0;
                }
            } else {

                hp2 = hp2 - s1.getDam();
                if (hp2 <= 0) {
                    hp2 = 0;
                }
            }
        } else if (this.player == 2) {
            if (p(turn) == 2) {
                hp1 = hp1 - s2.getDam();
                if (hp1 <= 0) {
                    hp1 = 0;
                }
            } else {

                hp2 = hp2 - s2.getDam();
                if (hp2 <= 0) {
                    hp2 = 0;
                }
            }
        }
    }

    /**
     *
     * @return จะทำการส่งค่าพลังชีวิตของผู้เล่นคนเเรก P1
     * ไปเช็คค่าว่ามันต่ำกว่าเท่ากับ0ไหม
     */
    public double getP1Hp() {
        return this.hp1;
    }

    /**
     *
     * @return จะทำการส่งค่าพลังชีวิตของผู้เล่นคนที่สอง P2
     * ไปเช็คค่าว่ามันต่ำกว่าเท่ากับ0ไหม
     */
    public double getP2Hp() {
        return this.hp2;
    }

    /**
     * จะรับค่าturnเเละทำการคำนวณว่าตานี้เป็นตาของใคร
     *
     * @param turn รับค่าเทิร์น เป็น int เพื่อนำมาเช็ดว่าอยู่ในตาของใครอยู่นะตอนนี้
     * @return ส่งค่าตาของผู้เล่นว่าตานั้นใครเล่น
     */
    public int p(int turn) {
        if (turn % 2 == 1) {
            p = 1;
        } else if (turn % 2 == 0) {
            p = 2;
        }
        return p;
    }

    /**
     *
     * @return จะส่ง print ค่าของสถาณะพลังชีวิตของเเต่ละฝ่ายเเละรวมถึง damage
     * ที่โจมตีมาโดยจะดูจากจำนวนผู้เล่น
     */
    @Override
    public String toString() {
        if (this.player == 1) {
            return "P1 :  hp= " + hp1 + "  P2 : hp=" + hp2 + "  Damage : " + s1.getDam();
        } else {
            return "P1 :  hp= " + hp1 + "  P2 : hp=" + hp2 + "  Damage : " + s2.getDam();
        }
    }
}
