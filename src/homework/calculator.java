package homework;

import java.util.Scanner;

/*
스캐너 활용
사칙연산 만들기
두개의 input과 하나의 연산자
 */
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        String i = scan.nextLine();

        if(i.equals("+")){
            sum = a+b;
            System.out.println(sum);
        }
        else if(i.equals("-")){
            sum = a-b;
            System.out.println(sum);
        }
        else if(i.equals("*")){
            sum = a*b;
            System.out.println(a*b);
        }
        else {
            sum = a/b;
            System.out.println(a/b);
        }

    }
}
