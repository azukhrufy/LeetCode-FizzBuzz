/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import java.util.ArrayList;

/**
 *
 * @author zukhruf
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                ArrayList<String> result = new ArrayList<String>();
        
        for(int i = 1; i <= 15; i++){
            
            if(i % 3 == 0 && i % 5 == 0){
                result.add ("FizzBuzz");
            }else if(i % 3 == 0){
                result.add("Fizz");
            }else if(i % 5 == 0){
                result.add("Buzz");
            }else{
              result.add(Integer.toString(i)); 
            }
            
        }
        
        System.out.println(result);
    }
    
}
