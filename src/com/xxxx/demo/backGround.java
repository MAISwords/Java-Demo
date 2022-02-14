package com.xxxx.demo;
import java.util.Scanner;

//用于在屏幕中绘制静态背景
public class backGround {
    //创建类时，根据传入bg的值调用不同的场景
    //0代表游戏开始场景，2代表主角胜利，3代表魔王胜利
    backGround(int bg){
        setBackgrount(bg);
    }
    //用调用方法来生成场景
    //gameStart()方法，生成场景1，开始场景
    void gameStart(){
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■                             ■");
        System.out.println("■          Game Start         ■");
        System.out.println("■  Please Press 1 in KeyBoard ■");
        System.out.println("■                             ■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");

    }
    //gameEnd()方法，生成场景3，主角胜利场景
    void goodEnd(){
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■                             ■");
        System.out.println("■          Good End!          ■");
        System.out.println("■                             ■");
        System.out.println("■勇者T.aoyan击败了魔王          ■");
        System.out.println("■大陆又恢复了和平!               ■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
    }
    //gameEnd()方法，生成场景3，主角胜利场景
    void badEnd(){
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        System.out.println("■                             ■");
        System.out.println("■          Game Over!         ■");
        System.out.println("■                             ■");
        System.out.println("■魔王取得了胜利，                ■");
        System.out.println("■大陆再次陷入一片混乱之中!         ■");
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
    }

    //setBackground()方法，通过在main方法中，切换场景
    void setBackgrount(int bg){
        if(bg == 0){
            //调用开始场景
            gameStart();
        }
        if(bg == 2){
            //调用胜利场景
            goodEnd();
        }
        if(bg == 3){
            //调用失败场景
            badEnd();
        }
    }
}
