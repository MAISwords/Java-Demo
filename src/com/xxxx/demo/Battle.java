package com.xxxx.demo;
import java.util.Scanner;
public class Battle {
    //ip用于标记战斗状态，当ip为1时表示英雄胜利，切换场景
    //当ip为2时，表示魔王胜利，切换场景
    int ip = 0;
    //初始化一个战斗裁判类
    Versus v = new Versus();
    Battle(Hero ty,Boss bs){
        do {
            //不晓得怎么清屏，通过打印200个空格循环，实现暴力清屏的效果
            for(int i = 0; i < 200; i++){
                System.out.println(" ");
            }
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("■ 魔王HP："+  bs.getHp()+"         T.aoyan  HP："+ty.getHp());
            System.out.println("■    ATK："+ bs.getAttack()+ "                   ATK："+ty.getSwordAttack()+" "+ty.getjumpCutAttack());
            System.out.println("■ 魔王："+ bs.tlk + "                             ");
            System.out.println("■ T.aoyan:"+ty.tlk+"                             ");
            System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            System.out.println("按3挥剑(攻击力500)，按4劈斩(攻击力1000),按5迅雷斩，按6无限真空之刃！");
            //输入数字，判定主角的伤害值和魔王造成的伤害值
            v.getInput(ty,bs);
            if(v.exHp ==0) {
                //双方的生命值都减去相互的攻击力值
                bs.setHp(bs.getHp() - v.heroAttack);
                ty.setHp(ty.getHp() - v.bossAttack);
            }else
            {   //魔王的技能，换血
                int temp = ty.getHp();
                ty.setHp(bs.getHp());
                bs.setHp(temp);
            }
        }while(bs.getHp() > 0&&ty.getHp() > 0);
        //主角先发动攻击，所以如果遇到同归于尽的情况，判定主角赢
        if(bs.getHp() > 0){
            ip = 3;
        }else{
            ip = 2;
        }
    }
}
