package com.example.javaexs;

import com.example.javaexs.interfaces.Biticino;
import com.example.javaexs.interfaces.GEAppliances;
import com.example.javaexs.interfaces.ISwitchBoardListener;

public class MyClass {

    public static void main(String[] args) {
       // System.out.println("hello world");
        ISwitchBoardListener isbl = new Biticino();
                //GEAppliances();  ///wiring
       //me/caller clicking the switches
        isbl.switchOne();
        isbl.switchTwo();
        isbl.switchThree();
    }
}