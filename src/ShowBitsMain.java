/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hai
 */
public class ShowBitsMain{
    public static void main(String[] args) {
      
     class ShowBits {
    int numBits;
    
    ShowBits(int n){
        numBits = n;
    }
    
    void show(char c){
        long val = (long)c;
        System.out.println("corresponding decimal: "+val);
        long mask = 1;
        mask <<= numBits - 1;
        int spacer = 0;
        System.out.println("corresponding binary: ");
        for(;mask!=0;mask>>>=1){
            if((val&mask) != 0) {//biểu thức này phải khác 0, kết quả mới đúng.
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
            spacer++;
            if((spacer % 8) == 0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
     
      ShowBits sb = new ShowBits(8);
        sb.show('A');// every character is a byte(8 bits)
    }
}
