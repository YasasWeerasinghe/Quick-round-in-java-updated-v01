package com.arrays_arrayList.ellipsis;

public class VariableLengtArgumenLists {
    
    public static void main(String[] args) {
        
        double a1 = 10.0;
        double a2 = 20.0;
        double a3 = 30.0;
        double a4 = 40.0;
        
        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",a1, a2, a3, a4);
        System.out.println("Avg of a1 & a2: " + avarage(a1,a2));
        System.out.println("Avg of a1, a2 & a3: " + avarage(a1,a2,a3));
        System.out.println("Avg of all: " + avarage(a1,a2,a3,a4));        
    }
    
    public static double avarage(double ... num){
        
        double total = 0.0;
        
        for(double i : num){
            total += i;
        }
        return total / num.length;
    
    }
}
