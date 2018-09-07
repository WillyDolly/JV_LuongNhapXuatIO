
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
public class CopyFile_CharStream {
    public static void main(String[] args) {
        String str;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hai\\Desktop\\TEST1.txt"));
            FileWriter fw = new FileWriter("C:\\Users\\hai\\Desktop\\TEST2.txt")){
            
            while((str = br.readLine()) != null){
                str = str + "\r\n";
                fw.write(str);
            }
            System.out.println("copy done");
        }catch(IOException exc){
            System.out.println(exc);
        }
    }
}
