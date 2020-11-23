/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Skill;
import java.util.Scanner;
import System.Randomsm;

/**
 * @version 1 เป็น class ที่จะรับค่าจาก เเป้นพิมเพื่อที่จะใช้งาน class skill
 * @author mark
 */
public class Attack1 {

    private int choose;
    private int dam;
    private Scanner cs = new Scanner(System.in);
    private Skill at = new Skill();
    private Randomsm ran = new Randomsm();

    /**
     * เป็น methodsของอาชีพ swordman ที่จะรับค่าจาก เเป้นพิมเพื่อที่จะใช้งาน
     * class skill เเละเเทนค่าdamgeเพื่อในนำไปคิดใน class Battle
     * เเต่P2จะเป็นการสุ่มค่าจาก class Randomsm
     *
     * @param p คือ รับตัวเเปรที่จะบอกผู้ที่จะเล่นในตานี่
     */
    public void swordman(int p) {
        String skill= 
                "♚♚♚♚♚♚♚♚♚♚♚♚♚♚\n"
                + "1. slash \n"
                + "2. couter \n"
                + "3. double blade\n"
                + "4. star brust\n"
                + "♚♚♚♚♚♚♚♚♚♚♚♚♚♚";
        do {
            if (p == 1) {
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
                choose = ran.ranDomSkill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.slash();
                    break;
                case 2:
                    dam = (int) at.couter();
                    break;
                case 3:
                    dam = (int) at.double_blade();
                    break;
                case 4:
                    dam = (int) at.star_brust();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
    }

    /**
     * เป็น methodsของอาชีพ gunner ที่จะรับค่าจาก เเป้นพิมเพื่อที่จะใช้งาน class
     * skill เเละเเทนค่าdamgeเพื่อในนำไปคิดใน class Battle
     * เเต่P2จะเป็นการสุ่มค่าจาก class Randomsm
     *
     * @param p คือ รับตัวเเปรที่จะบอกผู้ที่จะเล่นในตานี่
     */
    public void gunner(int p) {
        String skill
                = "♚♚♚♚♚♚♚♚♚♚♚♚♚♚\n"
                + "1. boom \n"
                + "2. laser \n"
                + "3. bullet\n"
                + "4. throw gun\n"
                + "♚♚♚♚♚♚♚♚♚♚♚♚♚♚";

        do {
            if (p == 1) {
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
              choose = ran.ranDomSkill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.boom();
                    break;
                case 2:
                    dam = (int) at.laser();
                    break;
                case 3:
                    dam = (int) at.bullet();
                    break;
                case 4:
                    dam = (int) at.throw_gun();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
    }

    /**
     * เป็น methodsของอาชีพ magician ที่จะรับค่าจาก เเป้นพิมเพื่อที่จะใช้งาน
     * class skill เเละเเทนค่าdamgeเพื่อในนำไปคิดใน class Battle
     * เเต่P2จะเป็นการสุ่มค่าจาก class Randomsm
     *
     * @param p คือ รับตัวเเปรที่จะบอกผู้ที่จะเล่นในตานี่
     */
    public void magician(int p) {
        String skill= 
                "♚♚♚♚♚♚♚♚♚♚♚♚♚♚\n"
                + "1. fireball \n"
                + "2. watergun \n"
                + "3. thuderstrike\n"
                + "4. windblade\n"
        +"♚♚♚♚♚♚♚♚♚♚♚♚♚♚";
        do {
            if (p == 1) {
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
                 choose = ran.ranDomSkill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.fireball();
                    break;
                case 2:
                    dam = (int) at.watergun();
                    break;
                case 3:
                    dam = (int) at.thuderstrike();
                    break;
                case 4:
                    dam = (int) at.windblade();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
    }

    /**
     * เป็น methodsของอาชีพ boxing ที่จะรับค่าจาก เเป้นพิมเพื่อที่จะใช้งาน class
     * skill เเละเเทนค่าdamgeเพื่อในนำไปคิดใน class Battle
     * เเต่P2จะเป็นการสุ่มค่าจาก class Randomsm
     *
     * @param p คือ รับตัวเเปรที่จะบอกผู้ที่จะเล่นในตานี่
     */
    public void boxing(int p) {

        String skill = 
                 "♚♚♚♚♚♚♚♚♚♚♚♚♚♚\n"
                +"1. punch \n"
                + "2. smash \n"
                + "3. one punch\n"
                + "4. one break\n"
                + "♚♚♚♚♚♚♚♚♚♚♚♚♚♚";

        do {
            if (p == 1) {
                System.out.println(skill);
                System.out.print("P" + p + " choose skill:");
                choose = cs.nextInt();
            } else if (p == 2) {
               choose = ran.ranDomSkill();
            }
            switch (choose) {
                case 1:
                    dam = (int) at.punch();
                    break;
                case 2:
                    dam = (int) at.smash();
                    break;
                case 3:
                    dam = (int) at.one_punch();
                    break;
                case 4:
                    dam = (int) at.one_break();
                    break;
            }
        } while (choose != 1 && choose != 2 && choose != 3 && choose != 4);
    }

    /**
     *
     * @return จะทำการส่งค่าdamageกลับไปยัง class Battle เพื่อนำไปคำนวณต่อไป
     */
    public int getDam() {
        return dam;
    }

}
