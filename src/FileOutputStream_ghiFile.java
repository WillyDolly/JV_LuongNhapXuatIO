
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class FileOutputStream_ghiFile {
    // this is the file copy process
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fos = null;
        
        try{          
            fin = new FileInputStream("C:\\Users\\hai\\Desktop\\TEST.TXT"); 
            fos = new FileOutputStream("C:\\Users\\hai\\Desktop\\TEST1.TXT");//second parameter: boolean append 
            // TEST1 will be created if not exist. Otherwise, it will copy & replace
            do{
                i = fin.read();
                if(i!=-1) fos.write(i);
                // read & write every single byte
            }while(i!=-1);
            
        }catch(FileNotFoundException fnf){
            System.out.println("filenotfound");
        }catch(IOException exc){
            System.out.println("IO fault");
        }
        finally{
            try{
            if(fin != null)
                fin.close();
                System.out.println("fin close");
            }catch(IOException exc){
                System.out.println("loi dong file");
            }
            
            try{
                if(fos != null)
                    fos.close();
                    System.out.println("fos close");
            }catch(IOException exc){
                System.out.println("loi dong file");
            }
        }
    }
}
