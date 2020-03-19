package app;

public class Exponential {
    public static double power(double x, int n){
        if(n == 1 ){
            return x;
        }
        if(n== 0){
            return 1;
        }
        else {
            return x * power(x, n-1);
        }
    }
}