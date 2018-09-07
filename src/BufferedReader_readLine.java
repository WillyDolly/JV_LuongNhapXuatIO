
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class BufferedReader_readLine {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
//        do{
//            str = br.readLine();
//            System.out.println("str: "+str);
//        }while(!str.equals("het"));
        
        do{
            str = br.readLine();
            System.out.println("str: "+str);
        }while(str!= null);
//program still runs after the block above        
    }
}
