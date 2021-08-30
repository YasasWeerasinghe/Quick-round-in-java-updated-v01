package com.methods;

public class SecureRandom {
    
    public static void main(String[] args) {
        
        SecureRandom randNum = new SecureRandom();
        
        for(int i = 0; i <= 20; i++){
            
            int num = 1 + randNum(6);
            
            System.out.println("" + num);
            
            if(i % 5==0){
                System.out.println();
            }                
        }        
    }    
}
