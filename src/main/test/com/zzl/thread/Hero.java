package com.zzl.thread;

/**
 * @author:智霸霸
 * @Date 2020/10/19
 */
public class Hero {
    public String name;
    public int hp;
    public int damage;
    public void attackHero(Hero h){
//        try{
//            Thread.sleep(1000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.printf("%s 正在攻击 %s,%s的血量变成了%d\n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name+"被击杀了");
    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }
}
