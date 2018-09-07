
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
public class InputStream_read {
    public static void main(String[] args) throws IOException{
        //1 method: int read()
        char c;
        do{
        c = (char)System.in.read();
        System.out.println("c: "+c);
        }while(c!='.');
        //2 method: int read(byte data[]) & int read(byte data[],int min, int max)
//        byte data[] = new byte[10];// input char translated into byte numbers
//        System.out.println("nhap cac ki tu: ");
//        //System.in.read(data);
//        System.in.read(data,0,3);// read chars [0;3)
//        System.out.println("cac ki tu vua nhap");
//        for(int i=0;i<data.length;i++)
//            System.out.println((char)data[i]);// empty positions filled with 0/empty space
    }
}
