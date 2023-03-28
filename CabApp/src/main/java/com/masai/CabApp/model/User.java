package com.masai.CabApp.model;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.sql.Time;

public class User {

    public int iid ;



    public static void main(String[] args) {
        Vehicle vc = new Vehicle();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        vc.id += 5;
        ;
        int[] arr = {1, 2, 3, 4, 5} ;

       // Time t1 = new Time();
        long t1  = System.currentTimeMillis();
        for (int x =1 ; x<50000 ; x++
             ) {
            stringBuilder.append("sa") ;

            //System.out.println(System.currentTimeMillis());
        }
        long t2 = System.currentTimeMillis() - t1 ;

        for (int x =1 ; x<50000 ; x++
        ) {
            stringBuffer.append("sa") ;

           // System.out.println(System.currentTimeMillis());
        }

        long t3 = System.currentTimeMillis() - t2;

        System.out.println(t2 + " is stringBuilder..... stringbuffer took " + t3 );
        if(t2 >t3){
            System.out.println("stringBuilder took more time " + t2 );
        }
        else{
            System.out.println("stringBuffer" +" took more time " + t3 );
        }
    }


}
