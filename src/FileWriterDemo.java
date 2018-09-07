
import java.io.BufferedReader;
import java.io.FileWriter;
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
public class FileWriterDemo {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("nhap dong van ban den \"het\" ");
        
        try(FileWriter fw = new FileWriter("C:\\Users\\hai\\Desktop\\filewriter.txt")){
         do{
             str = br.readLine();// Enter pressed, the line ends.
             if(str.compareTo("het") == 0) break;
             str = str +"\r\n";// new line
             fw.write(str);// write str to stream
             fw.flush();// show str in file
         }while(str.compareTo("het")!=0);
        }catch(IOException exc){
            System.out.println("loi nhap xuat");
        }
    }
}
