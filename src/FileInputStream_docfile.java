
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class FileInputStream_docfile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        
        try{
// 1. open File
            fin = new FileInputStream("C:\\Users\\hai\\Desktop\\TES.txt");
            System.out.println("not printed if an exception occurs");
            //InputStream fin;
           // fin = new URL("http://google.com/").openStream(); URL for online file only
           //catch(MalformedURLException)
           
//2. read File
           do{
               i = fin.read();// read byte by byte
               if(i!=-1) System.out.println((char)i);// i = -1 mean the end of File
           }while(i!=-1);
//3. catch Fault
        }catch(FileNotFoundException fnf){
            System.out.println("file not found");
            return;
        }catch(IOException exc){
             System.out.println("Fault when reading");
        }
//4. close File
        finally{
            try{
            fin.close();
            }catch(IOException exc){
                System.out.println("can not close file");
            }
        }
        
    }
}
