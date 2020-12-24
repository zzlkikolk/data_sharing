package com.zzl.thread;

/**
 * @author:智霸霸
 * @Date 2020/10/19
 */
public class ThreadMain {
//    public static void main(String[] args) {
//        Hero gareen = new Hero();
//        gareen.name = "盖伦";
//        gareen.hp = 616;
//        gareen.damage = 1;
//
//        Hero teemo = new Hero();
//        teemo.name = "提莫";
//        teemo.hp = 300;
//        teemo.damage = 30;
//        Hero bh = new Hero();
//        bh.name = "赏金猎人";
//        bh.hp = 500;
//        bh.damage = 1;
//
//        Hero leesin = new Hero();
//        leesin.name = "盲僧";
//        leesin.hp = 300;
//        leesin.damage = 80;
//        Kill kill_1=new Kill(gareen,teemo);
//        Kill kill_2=new Kill(bh,leesin);
////        kill_1.setPriority(1);//设置线程优先级,数字越大线程优先级越高
////        kill_2.setPriority(10);
//        Thread thread=new Thread(){
//            @Override
//            public void run(){
//                int seconds =0;
//                while(true){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);
//
//                }
//            }
//        };
//        kill_1.start();
//
////        try {
////            kill_1.join();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        } //加入到主线程中
//        kill_2.start();
//        thread.setDaemon(true);//设置守护线程
//        thread.start();
//    }
static volatile int x=10;
public static void main(String[] args) {
    Thread thread_1=new Thread(){
        @Override
        public void run() {
            while (true){
                x++;
                if (x==20)
                    break;
            }
        }
    };
    Thread thread_2=new Thread(){
        @Override
        public void run() {
            System.out.println("x="+x);
        }
    };
    thread_1.start();
    thread_2.start();
}
}
