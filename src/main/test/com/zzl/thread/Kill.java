package com.zzl.thread;

/**
 * @author:智霸霸
 * @Date 2020/10/19
 */
public class Kill extends Thread {
    private Hero h1;
    private Hero h2;
    public Kill(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }

    @Override
    public void run() {
        while (!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
