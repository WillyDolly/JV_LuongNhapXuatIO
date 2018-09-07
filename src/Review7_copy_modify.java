
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
public class Review7_copy_modify {
   
    public static void main(String[] args) {
      //1. byte Stream  
//        int by;
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try{
//            fis = new FileInputStream("C:\\Users\\hai\\Desktop\\copy.txt");
//            fos = new FileOutputStream("C:\\Users\\hai\\Desktop\\modify.txt");
//            do{
//              by = fis.read();
//              if(by==' ') by = '-';
//              if(by!=-1) fos.write(by);
//            }while(by!=-1);
//        
//        }catch(IOException exc){
//            System.out.println(exc);
//        }
//        finally{
//            try{
//               if(fis!=null) fis.close();
//               if(fos!=null) fos.close();
//            }catch(IOException exc){
//                System.out.println(exc);
//            }
//        }


       //2. char Stream
       int c;
       try(FileReader fr = new FileReader("C:\\Users\\hai\\Desktop\\copy.txt");
               FileWriter fw = new FileWriter("C:\\Users\\hai\\Desktop\\modify.txt")){
           do{
               c = fr.read();
               if(c==' ') c = '-';
               if(c!=-1) fw.write(c);
           }while(c!=-1);
       }catch(IOException exc){
           System.out.println(exc);
       }
    }
}
