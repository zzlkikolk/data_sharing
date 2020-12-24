package com.zzl.Factory;

/**
 * @author:智霸霸
 * @Date 2020/10/26
 * @Remark 工厂模式
 */
public class USBFactory {
    public USB getUsbTypeByName(String type){
        if(type==null)
            return null;
        else if("mouse".equalsIgnoreCase(type))
            return new Mouse();
        else if("keyboard".equalsIgnoreCase(type))
            return new Keyboard();
        return null;
    }
    public USB getUsbByClass(Class c){

        return null;
    }
}
