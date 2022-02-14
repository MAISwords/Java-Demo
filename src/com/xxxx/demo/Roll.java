package com.xxxx.demo;
import java.util.Random;
public class Roll {
    //设置随机数起始值和结束值
    public Roll()
    {
    }
    public int random(int begin, int end){
        Random r = new Random();
        int Ro1 = r.nextInt(end - begin + 1) + begin;
        return Ro1;
    }
}
