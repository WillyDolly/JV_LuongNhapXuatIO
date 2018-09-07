
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class FileRandomAccessDemo {
    public static void main(String[] args) {
        double[] twin = {10.2, 4.5, 67.3, 23.4, 6.7, 8.2};
        double d;
        try(RandomAccessFile fra = new RandomAccessFile("C:\\Users\\hai\\Desktop\\FileRandom.dat","rw")){
            for(int i=0;i<twin.length;i++)
                fra.writeDouble(twin[i]);
            System.out.println("wrote to FileRandom.dat");
            
            System.out.println("read FileRandom.dat randomly");
            fra.seek(0);
            d = fra.readDouble();
            System.out.println("1byte - 0filePointer: "+d);
            
            fra.seek(8);
            d = fra.readDouble();
            System.out.println("2byte - 8filePointer: "+d);
            
            fra.seek(8*3);
            d = fra.readDouble();
            System.out.println("4byte - 24filePointer: "+d);
        }catch(FileNotFoundException exc){
            
        }catch(IOException exc){
            
        }
    }
}
