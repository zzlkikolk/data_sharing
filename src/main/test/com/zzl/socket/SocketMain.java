package com.zzl.socket;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.*;

/**
 * @author:智霸霸
 * @Date 2020/10/19
 */
public class SocketMain {
    public static void main(String[] args) throws IOException {
        Process p = Runtime.getRuntime().exec("ping"+" 192.168.203.128");
        BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream(),"GBK"));
        String str=null;
        StringBuilder stringBuilder=new StringBuilder();
        while ((str=reader.readLine())!=null){
            stringBuilder.append(str+"\n");
        }
        System.out.println(stringBuilder.toString());
    }
    @Test
    public void LocalHost() throws UnknownHostException {
        InetAddress ip=InetAddress.getLocalHost();
        System.out.println(ip.getHostName());
    }

    @Test
    public void SocketClient(){
        try {
            Socket mysql=new Socket("192.168.203.128",3306);
            OutputStream os= mysql.getOutputStream();
            os.write(110);
            os.close();
            mysql.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void TestSpringBootApplication(){
        try{
            URL url=new URL("http://192.168.203.128/hello");
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
            String str;
            StringBuilder builder=new StringBuilder();
            while ((str=reader.readLine())!=null){
                    builder.append(str);
                    builder.append("\n");
            }
            System.out.println(builder.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Test
    public void For(){
        A:for(int x=0;x<10;x++)
            for (int y=0;y<10;y++){
                System.out.printf("%d*%d=%d\n",x,y,x*y);
                if(x*y==54)
                    break A;
            }
    }
}
