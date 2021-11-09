import java.util.Scanner;

public class PRACTICESET_7 {
    // 1. Write a java method to print multiplication table of a number n.
    // static void multiplication(int n){
    //     for (int i = 1; i <= 10; i++) {
    //         System.out.printf("%d x %d = %d\n", n, i, n*i);
    //     }
    // }
    // public static void main(String[] args) {
    //     multi(7);
    // }


// --------------------------------------------------------------------------------------------------

    // 2. Write a program using functions to print following pattern:
    // *
    // * *
    // * * *
    // static void pattern(int n) {
    //     if (n == 0) return;
    //     else {
    //         for (int i = 0; i < n; i++) {
    //             for (int j = 0; j < i+1; j++) {
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern(10);
    // }





// ------------------------------------------------------------------------------------------------------

    // 3. Write a recursive function to calulate sum of first n natural numbers.
    // static int sum(int n){
    //     // if (n == 0) return 0;
    //     // else return sum(n-1) + n;
    //   // OR -------------------------
    //     int j = n == 1 ? 1 : sum(n-1)+n;
    //     return j;
    // }
    // public static void main(String[] args) {
    //     System.out.println(sum(10));
    // }



// ------------------------------------------------------------------------------------------------------


    // 4. Write a function to print the following pattern.
    // * * * 
    // * *
    // *
    // static void pattern1(int n){
    //     if(n==0) return;
    //     else {
    //         for (int i = n; i > 0 ; i--) {
    //             for (int j = i-1; j >= 0; j--) {
    //                 System.out.print("* ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern1(5);
    // }



// --------------------------------------------------------------------------------------------------------


    // 5. Write a function to find average of a set of numbers passed as arguments.
    // static int average(int ...arr){
    //     int avg = 0;
    //     for (int i : arr) {
    //         avg += i;
    //     }
    //     return avg/arr.length;
    // }
    // public static void main(String[] args) {
    //     int a = average(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
    //     System.out.println(a);
    // }




// ---------------------------------------------------------------------------------------------------------


    // 6. Write a function to print the nth term of fibonacci series using recursion.
    // static int fibbonacci(int n){
    //     // if (n == 0) return 0;
    //     // else if (n == 1) return 1;
    //     // else return fibbonacci(n-1) + fibbonacci(n-2);

    //     int l = 0;
    //     return l = n==0 ? 0 : n==1 ? 1 : fibbonacci(n-1)+fibbonacci(n-2);

    // }

    // // Without recursion.
    // static int K(int n){
    //     int a = 0;
    //     int b = 1;
    //     int t = 0;
    //     if (n==0)return 0;
    //     else if(n==1) return 1;
    //     else {
    //         for (int i = 0; i < n; i++) {
    //             t = a+b;
    //             b = a;
    //             a = t;
    //         }
    //     }
    //     return t;
    // }
    // public static void main(String[] args) {
    //     System.out.println(fibbonacci(10));
    //     // System.out.println(K(9));
    // }




// ---------------------------------------------------------------------------------------------------------


    // 7. Repeat 4 using recursion.
    // static void patternRec(int n){
    //     if (n==0) return;
    //     System.out.print("* ");
    //     patternRec(n-1);    
    // }
    // static void patternPrint(int n, int i){
    //     if(n==0) return;
    //     patternRec(n);
    //     System.out.println();

    //     patternPrint(n-1, i+1);
    // }
    // public static void main(String[] args) {
    //     patternPrint(10, 1);
    // }





// ---------------------------------------------------------------------------------------------------------

    // 8. Repeat 2 using recursion.
    // static void patternRec(int n){
    //     if (n==0) return;
    //     System.out.print("* ");
    //     patternRec(n-1);    
    // }
    // static void patternPrint(int n, int i){
    //     if(n==0) return;
    //     patternRec(i);
    //     System.out.println();

    //     patternPrint(n-1, i+1);
    // }
    // public static void main(String[] args) {
    //     patternPrint(10, 1);
    // }



// ----------------------------------------------------------------------------------------------------------

    // 9. Write a function to convert celcius temprature into fehrenheit.
    // static double celToFeh(double cel){
    //     return cel*1.8 +32;
    // }
    // public static void main(String[] args) {
    //     System.out.println(celToFeh(10));
    // }



// ------------------------------------------------------------------------------------------------------------


    // 10. Repeat 3 using itrative approach.
    // static int natural(int n){
    //     if(n==1) return 1;
    //     int sum = 0;
    //     for (int i = 1; i < n+1; i++) {
    //         sum += i;
    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     System.out.println(natural(14));
    // }

}




