
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
public class HelpUtility {
    public static void main(String[] args) {
     String topic;
     Help help = new Help("C:\\Users\\hai\\Desktop\\help1.txt");
     do{
         topic = help.getTopic();
         if(!help.readFile(topic))
            System.out.println("no topic ");
     }while(topic.compareTo("het")!=0);
     
    }
}
