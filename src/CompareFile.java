
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
public class CompareFile {
    public static void main(String[] args) {
        int f1,f2;
        try(FileInputStream fin1 = new FileInputStream("C:\\Users\\hai\\Desktop\\TEST.txt");
                FileInputStream fin2 = new FileInputStream("C:\\Users\\hai\\Desktop\\fileData.txt")){
            
            do{
                f1 = fin1.read();
                f2 = fin2.read();
               // System.out.println((char)f2);
                if(f1!=f2)          break;         
            }while(f1!=-1 && f2!=-1);// both files have byte to be read
            
            if(f1!=f2)
                 System.out.println("different files ");
            else
                 System.out.println("alike files");
        }catch(IOException exc){
            System.out.println("loi doc");
        }
    }
}
