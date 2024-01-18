//arrayList concept --> Dynamic array

// methods 
// add()
// set(idx, value)
// get(idx)
// remove()
package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrimes {
    static Scanner sc= new Scanner(System.in);
    public static ArrayList input(int size){
        ArrayList al= new ArrayList<>();
        for(int i=0 ; i< size; i++){
            al.add(sc.nextInt());
        }
        return al;
    }

    public static ArrayList solution(ArrayList<Integer> al){
        for(int i= al.size()-1; i>=0; i--){
            if(isPrime(al.get(i))){
                al.remove(i);
            }
        }
        return al;
    }

    public static boolean isPrime(int a){
        boolean prime= true;
        if(a<=1){
            prime= false;
        }
        for(int i=2; i<a; i++){
            if(a%i==0){
                prime= false;
            }
        }
        return prime;
    }
 public static void main(String[] args) {
    int size=9;
   ArrayList al= new ArrayList<>();
   al= input (size);
   solution(al);
    System.out.println(al);
 }   
}

