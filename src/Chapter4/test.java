package Chapter4;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            String inputData = scanner.nextLine();
            System.out.println(inputData);
            if (inputData.equals("q")){
                break;
            }
        }
    }
}
/*
스캐너를 이용해서 층수를 입력하면
내가 원하는 층에 내려주는 엘리베이터
1층 -> 약국
2층 -> 정형외과
3층 -> 헬스장
4층 -> 세연이네 집
5층 -> 으네 집
만약 못 찾으면 해당 층은 존재하지 않습니다.

스캐너 활용
사칙연산 만들기
두개의 input과 하나의 연산자

 */