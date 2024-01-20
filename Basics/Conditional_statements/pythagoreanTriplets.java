package Conditional_statements;

public class pythagoreanTriplets {
    public static void main(String[]args){
        int a=4, b=5, c=3;
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(max==a){
            boolean num= ((b*b)+(c*c)==(a*a));
            System.out.println(num);
        }
        if(max==c){
            boolean num= ((b*b)+(a*a)==(c*c));
            System.out.println(num);
        }
        if(max==b){
            boolean num= ((a*a)+(c*c)==(b*b));
            System.out.println(num);
        }
    }
    
}
