package com.zzl.Factory;

/**
 * @author:智霸霸
 * @Date 2020/10/26
 */
public class Main {
    public static void main(String[] args) {
        USBFactory usbFactory=new USBFactory();
        USB mouse=usbFactory.getUsbTypeByName("Mouse");
        mouse.input();
        USB keyboard=usbFactory.getUsbTypeByName("keyboard");
        keyboard.input();
    }
}
