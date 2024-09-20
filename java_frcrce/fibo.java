// public class fibo {
//     public static void display_fibo(int num){
//         int a = 1;
//         int b = 0;
//         int c = 0;
//         for(int i = 0; i < num; i++){
//             System.out.println(c);
//             c = a + b;
//             a = b;
//             b = c;
//         }
//     }
//     public static void main(String[] args) {
//         display_fibo(10);
//     }
// }
public class fibo{
    public static long[] display_fibo(int n){
        long[] arr = new long[n];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i = 2; i < n; i++){
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int n = 10;
       long[] res = display_fibo(n);
       for(int i = 0; i < n; i++) {
        System.out.println(res[i]);
       }
    }
}
