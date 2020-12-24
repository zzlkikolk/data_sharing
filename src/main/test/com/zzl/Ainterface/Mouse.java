package com.zzl.Ainterface;

/**
 * @author:智霸霸
 * @Date 2020/10/23
 */
public class Mouse implements USB {
    @Override
    public void showMessage() {
        System.out.println("鼠标");
    }
    public void mouseMove(){
        System.out.println("鼠标移动");
    }
}
