package com.zzl.Ainterface;

/**
 * @author:智霸霸
 * @Date 2020/10/23
 */
public class Keybarod implements USB {
    @Override
    public void showMessage() {
        System.out.println("键盘");
    }

    public void keyInput(){
        System.out.println("键盘按下");
    }
}
