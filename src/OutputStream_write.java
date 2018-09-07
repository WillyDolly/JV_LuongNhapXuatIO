
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class OutputStream_write {
    public static void main(String[] args) throws IOException{
        //1. write(int b)
        int b = 'A';
        System.out.write(b);// b written to a buffer
        System.out.flush();// call this or write('n') to print out b
        
        //2.write(byte[] data) / write(bytes[],int min,int max)
//        byte data[] = new byte[4];
//        System.in.read(data);
//        System.out.println("print out data[]: ");
//       // System.out.write(data);
//       System.out.write(data,0,2);
    }
}
