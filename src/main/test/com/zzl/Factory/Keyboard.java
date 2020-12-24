package com.zzl.Factory;

/**
 * @author:智霸霸
 * @Date 2020/10/26
 */
public class Keyboard implements USB {
    @Override
    public void input() {
        System.out.println("键盘输入");
    }
}
