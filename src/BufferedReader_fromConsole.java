
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class BufferedReader_fromConsole {
    public static void main(String[] args) throws IOException{
        char c;
        char ch[] = new char[10];
        System.out.println("nhap ki tu:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// in refer to InputStream
        
//        do{
//            c = (char)br.read();
//            System.out.print(c);
//        }while(c!='.');

        br.read(ch);// return number of chars read successfully
        System.out.println("ki tu dc nhap: ");
        for(int i=0;i<ch.length;i++)
            System.out.println(i+" : "+ch[i]);
//BufferedReader != System.in.read: read(char[]) - read(byte[])            
    }
}
