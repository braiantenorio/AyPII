package FibonacciPrueba;

public class FiboBad {

    public static int cont;

    public static long fibonacciBad(int n) { 
        cont++;
         if (n <= 1){
         //cont++;
         return n;
         }
         else
         //cont++;
         return fibonacciBad(n-2) + fibonacciBad(n-1);
    
}
}
