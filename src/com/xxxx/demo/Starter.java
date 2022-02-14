package com.xxxx.demo;

import java.io.IOException;
import java.util.Scanner;

public  class Starter {
    public static void main(String[] args)  {
        //生成场景,0代表游戏开始场景
        backGround a = new backGround(0);
        //生成两个角色，分别是主角和魔王
        Hero ty = new Hero();
        Boss bs = new Boss();
        //创建输入对象，通过输入1，进入游戏对战的场景
        int ip;
        do {

            Scanner input = new Scanner(System.in);
            ip = input.nextInt();
            //不晓得怎么清屏，通过打印200个空格循环，实现暴力清屏的效果
            for(int i = 0; i < 200; i++){
                System.out.println(" ");

            }
            a.gameStart();
        }while(ip!=1);
        //当输入为1时进入战斗场景
        Battle s1 = new Battle(ty,bs);
        //战斗结束
        a.setBackgrount(s1.ip);
    }

}

