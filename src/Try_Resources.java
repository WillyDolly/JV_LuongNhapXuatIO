
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
public class Try_Resources {
    public static void main(String[] args) {
        int i;
        String[] file = {"TEST.TXT","TEST1.TXT","TEST2.TXT","TEST3.TXT"};
       // FileInputStream fin; can not declare outside try()
       for(int j=0;j<=1;j++){
           //to use this, resources must implement AutoClosable & Closable
        try(FileInputStream fin = new FileInputStream("C:\\Users\\hai\\Desktop\\"+file[j])
            ; FileOutputStream fos = new FileOutputStream("C:\\Users\\hai\\Desktop\\"+file[j+2])){// variables in try are final
            
            do{
                i = fin.read();
                if(i!=-1) fos.write(i);
            }while(i!=-1);
            System.out.println("copied "+file[j]);
        }catch(FileNotFoundException fnf){
            System.out.println("FileNotFound");
        }catch(IOException exc){
            System.out.println("IOException ");
        }
       }
    }
}
