package com.xxxx.demo;

public class Boss extends Role{
    private String name = "魔王";
    private int Hp = 150000;
    //火球攻击
    private int fireBall = 1500;
    //闪电攻击
    private int thunDer = 3000;
    //根据选择的攻击技能，魔王选择语句
    public String tlk = "来吧人类，让我看看你的实力！";
    Boss(){

    }
    //魔王技能选择函数，AI随机选择魔王攻击方式
    //通过获得随机数，选择技能1-10是换血，11-20是伤害反弹，21-30是闪电攻击，31-100是火球攻击
    int selectSkill(){
        Roll r = new Roll();
        int sl = r.random(1,100);
        if(sl >= 1&&sl <= 10){
            //换血

            sayBoss(1);
            return -1;
        }else if(sl >= 11 && sl <= 30){
            //伤害反弹
            sayBoss(2);
            return -2;
        }else if(sl >=31 && sl <= 40){
            //闪电攻击
            sayBoss(3);
            return 3000;
        }else{
            //火球攻击
            sayBoss(4);
            return 1500;
        }
    }

    @Override
    public int attackEnemy(int attack) {
        System.out.println(name + "对敌人展开攻击，");
        System.out.println("并造成" + this.fireBall + "点伤害！");
        return this.fireBall;
    }

    @Override
    public int getHp() {
        return Hp;
    }

    @Override
    public void setHp(int hp) {
        Hp = hp;
    }

    @Override
    public int getAttack() {
        return fireBall;
    }

    @Override
    public void setAttack(int attack) {
        fireBall = attack;
    }
    public void sayBoss(int talkBoss){
        switch (talkBoss){
            case 1:tlk = "绝望吧，人类，你是打不赢我的。换血大法！";break;
            case 2:tlk = "嘿嘿，真是白费功夫，化功大法伤害反弹！";break;
            case 3:tlk = "天空啊，听从我的召唤，闪电攻击！";break;
            case 4:tlk = "火球攻击，在烈焰中挣扎吧！";break;
            default:break;
        }
    }
}
