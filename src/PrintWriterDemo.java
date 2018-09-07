
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        int i = 7;
        double d = 2.3;
         pw.println(i);
         System.out.println(i);
         pw.println(d);
         pw.println(i+"+"+d+" = "+(i+d));
    }
}
