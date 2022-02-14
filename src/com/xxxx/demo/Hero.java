package com.xxxx.demo;

public class Hero extends Role{
    private String name = "T.aoyan";
    private int Hp = 40000;
    //挥剑攻击500
    private int swordAttack = 500;
    //魔法攻击1000
    private int jumpCutAttack = 1000;
    //主角的台词
    public String tlk = "我将给这片大陆带来和平与希望！";
    Hero(){

    }

    @Override
    public int attackEnemy(int attack) {
        System.out.println(name + "对敌人展开攻击，");
        System.out.println("并造成" + attack + "点伤害！");
        return attack;
    }
    @Override
    public int getHp() {
        return Hp;
    }

    @Override
    public void setHp(int hp) {
        Hp = hp;
    }
    public int getSwordAttack() {
        return swordAttack;
    }
    public void setSwordAttack(int swordAttack) {
        this.swordAttack = swordAttack;
    }
    public int getjumpCutAttack() {
        return jumpCutAttack;
    }
    public void setjumpCutAttack(int jumpCutAttack) {
        this.jumpCutAttack = jumpCutAttack;
    }
    //迅雷斩
    public int getThunderBehead(){
        Roll r = new Roll();
        //迅雷斩的倍率是1-20
        int atk = r.random(1,50);
        return (atk * 100);
    }
    //无限真空之刃
    public int getBOIV(){
        Roll r = new Roll();
        //无限真空之刃的攻击力是1-20000
        int atk = r.random(1,40000);
        return atk;
    }
}
