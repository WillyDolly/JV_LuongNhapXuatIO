
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
public class Help {
    String helpFile;
    Help(String fname){
        helpFile = fname;
    }
    
    public boolean readFile(String what){
        int ch;
        String topic , info;
        try(BufferedReader br = new BufferedReader(new FileReader(helpFile))){
            do{
            ch = br.read();
            if(ch == '#'){
                topic = br.readLine();
                if(what.compareTo(topic)==0){
                    do{
                    info = br.readLine();
                    if(info!=null) System.out.println(info);
                    }while((info!=null) && (info.compareTo(""))!=0);//line not end && != empty
                    return true;
                }
            }
            }while(ch!= -1);
        }catch(IOException exc){
            System.out.println(exc);
            return false;
        }
        return false;
    }
    
    String getTopic(){
        String topic = "";
        System.out.println("enter topic: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            topic = br.readLine();
        }catch(IOException exc){
            System.out.println(exc);
        }
        return topic;
    }
}
