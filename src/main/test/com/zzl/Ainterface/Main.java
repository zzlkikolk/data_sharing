package com.zzl.Ainterface;

/**
 * @author:智霸霸
 * @Date 2020/10/23
 */
public class Main {
    public static void main(String[] args) {
        USB usb_1=new Mouse();
        usb_1.showMessage();
        ((Mouse) usb_1).mouseMove();

        USB usb_2=new Keybarod();
        usb_2.showMessage();
        ((Keybarod) usb_2).keyInput();

    }
}
