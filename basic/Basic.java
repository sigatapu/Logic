package basic;

public class Basic {

    public static void  even_or_odd(int n){
        if(n%2==0) System.out.println("even");
        else System.out.println("odd");
    }
    
    public static void multiplication_table(int n){
        for(int i=1 ;i<=10 ; i++){
            System.out.println(n+" X "+i + " = "+n*i);
        }
    }

    public static int sum_of_natural_numbers(int n){
        int result = 0 ;
        for (int i=1; i<=n; i++){
            result = result + i;
        }
        return result ;
    }

    public static int sum_of_squares(int n){
        int result = 0 ;
        for(int i=1 ; i<=n ; i++){
            result = result + (i*i);
        }
        return result;
    }

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    
}
