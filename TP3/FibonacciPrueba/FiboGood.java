package FibonacciPrueba;



public class FiboGood {
    public static int cont;

    public static long[ ] fibonacciGood(int n) { 
        cont++;
        if (n <= 1) { 
            long[ ] answer = {n, 0};
            //cont++;
            return answer;
        } else { 
            long[ ] temp = fibonacciGood(n - 1); // returns {Fn−1, Fn−2} 
            long[ ] answer = {temp[0] + temp[1], temp[0]}; // we want {Fn, Fn−1} 
            //cont++;
            return answer ;
        
        }
     
    }
}