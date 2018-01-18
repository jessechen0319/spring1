package com.jesse.hello.Knights;

import java.awt.print.PrinterGraphics;
import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBefore(){
        stream.println("before");
    }

    public  void singAfter(){
        stream.print("after");
    }
}
