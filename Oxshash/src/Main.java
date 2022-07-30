import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        //2teng sonlar
//        System.out.print("a = ");
//        int a = sc.nextInt();
//      System.out.print("b = ");
//        int b = sc.nextInt();
//       System.out.print("d = ");
//        int d = sc.nextInt();
//
//        if (a==b){
//            System.out.println("a = "+a);
//        } else if (b==d){
//            System.out.println("b = "+b);
//
//        }else if (d==a){
//            System.out.println("d = "+d);
//        }else{
//            System.out.println("Teng song yo'q ");
//        }
        //3A B
//        System.out.print("A = ");
//        int A= sc.nextInt();
//        System.out.print("B = ");
//        int B =sc.nextInt();
//         int res =0;
//
//        if (A==B){
//            System.out.println(0);
//        }else{
//            res = A+B;
//            System.out.println(A+" + "+B+" = "+res);
//        }
        //4kichik sonlar
//        System.out.print("a = ");
//        int a = sc.nextInt();
//      System.out.print("b = ");
//        int b = sc.nextInt();
//       System.out.print("d = ");
//        int d = sc.nextInt();
//
//        if (a<b){
//            System.out.println("a = "+a);
//        } else if (b<d){
//            System.out.println("b = "+b);
//
//        }else if (d<a){
//            System.out.println("d = "+d);
//        }else{
//            System.out.println("Kichik song yo'q ");
//        }
        //5o'rta

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("d = ");
        int d = sc.nextInt();

        if (a<=b&&a>=d){
            System.out.println("a = "+a);
        } else if (b<=a&&b>=d){
            System.out.println("b = "+b);

        }else  if (d<=a&&d>=b){
            System.out.println("d = "+d);
        }else{
            System.out.println("O'rtacha song yo'q ");
        }
        //6kichik katta
//        System.out.print("a = ");
//        int a = sc.nextInt();
//        System.out.print("b = ");
//        int b = sc.nextInt();
//        System.out.print("d = ");
//        int d = sc.nextInt();
//        for (int i = a; i < d; i++) {
//            System.out.println(i);
//
//        }











    }
}