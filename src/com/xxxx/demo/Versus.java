package com.xxxx.demo;

import java.util.Scanner;

//用于每次战斗的裁决
public class Versus {
    //魔王的技能换血标记
    public int exHp = 0;
    //保存本次战斗主角造成的伤害
    public int heroAttack;
    //保存本次战斗魔王造成的伤害
    public int bossAttack;
    Versus(){

    }
    //获取键盘输入的值
    public void getInput(Hero ty, Boss bs){
        //获取键盘输入的值
        Scanner input = new Scanner(System.in);
        int ip  = input.nextInt();
        //调用判定战斗方法
        Decision(ip,ty,bs);
    }
    //根据输入的值，判定战斗
    public void Decision(int ip,Hero ty, Boss bs){
        //因为主角全部都是造成伤害的技能，所以优先判定主角造成的伤害
        switch(ip){
            case 3:this.heroAttack = 500;ty.tlk="恶魔，看剑！";break;
            case 4:this.heroAttack = 1000;ty.tlk="劈斩攻击!";break;
            case 5:this.heroAttack = ty.getThunderBehead();ty.tlk="迅雷给我力量吧，音速斩！";break;//输入按下5，英雄T.aoyan发动祖传刀法，迅雷斩造成100-2000点伤害
            case 6:this.heroAttack = ty.getBOIV();ty.tlk="真空刃斩尽世界一切罪恶！";break;//输入按下6，使用无限真空之刃，有几率直接胜利！
            default:break;
        }
        //拿到魔王伤害，首先判定魔王的是攻击还是发动技能
        int sk = bs.selectSkill();
        if(sk == -1){
            //换血
            this.bossAttack = 0;
            this.heroAttack = 0;
            this.exHp = 1;
        }else if(sk == -2){
            //伤害反弹
            this.bossAttack = this.heroAttack;
            this.heroAttack = 0;
            this.exHp = 0;
        }else{
            this.bossAttack = sk;
            this.exHp = 0;
        }

    }






}
