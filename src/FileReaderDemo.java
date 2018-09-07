
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public class FileReaderDemo {
    public static void main(String[] args){
        String s;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hai\\Desktop\\TEST.txt"))){
            while((s = br.readLine()) != null)
                System.out.println(s);
        }catch(FileNotFoundException exc){
            System.out.println(exc);
        }catch(IOException exc){
            System.out.println(exc);
        }
    }
}
