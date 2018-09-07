
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
public class DataI$OStream {
    public static void main(String[] args) {
    int no = 67;
    float coordinate = 113.56f;
    boolean small = true;
    double d = 354.7;
    // read & write basic data type in binary format
    try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\hai\\Desktop\\fileData.txt"))){
            System.out.println("writing "+no);
            dos.write(no);
            System.out.println("writing "+coordinate);
            dos.writeFloat(coordinate);
            System.out.println("writing "+small);
            dos.writeBoolean(small);
            System.out.println("writing "+(12.5 * 1.2));
            dos.writeDouble(12.5 * 1.2);
            System.out.println("writing "+d);
            dos.writeDouble(d);
     }catch(IOException exc){
        System.out.println("loi ghi file");
    }       
            System.out.println("");
    // must read in order
    try(DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\hai\\Desktop\\fileData.txt"))){        
            System.out.println("reading no: "+dis.read());
            System.out.println("reading  coordinate: "+dis.readFloat());
            System.out.println("reading small: "+dis.readBoolean());
            System.out.println("reading double: "+dis.readDouble());
            System.out.println("reading d: "+dis.readDouble());
    }catch(IOException exc){
        System.out.println("loi doc file");
    }

    }
}
