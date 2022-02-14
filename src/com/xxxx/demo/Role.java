package com.xxxx.demo;

public class Role {
    //定义角色名，生命值和攻击力
    private String name = null;
    private int Hp = 0;
    private int Attack = 0;

    //构造方法
    Role(){

    }
    //攻击行为
    public int attackEnemy(int attack){
           return attack;
    }

    //操作角色属性值
    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }
    public int getAttack() {
        return Attack;
    }
    public void setAttack(int attack) {
        Attack = attack;
    }

}
