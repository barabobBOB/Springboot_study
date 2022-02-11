package homework;

/*
스캐너를 이용해서 층수를 입력하면
내가 원하는 층에 내려주는 엘리베이터
1층 -> 약국
2층 -> 정형외과
3층 -> 헬스장
4층 -> 세연이네 집
5층 -> 으네 집
만약 못 찾으면 해당 층은 존재하지 않습니다.
 */

import java.util.Scanner;

public class ElevatorBuilding {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String floor;

        System.out.println(" 1층 -> 약국 \n 2층 -> 정형외과\n 3층 -> 헬스장\n 4층 -> 세연이네 집\n 5층 -> 으네 집");
        System.out.println("층을 입력하시오 ex) 1층");

        while (true) {
            String inputData = scan.nextLine();
            if (inputData.equals("1층")) {
                System.out.println("약국에 도착하였습니다.");
                break;
            } else if (inputData.equals("2층")) {
                System.out.println("정형외과에 도착하였습니다.");
                break;
            } else if (inputData.equals("3층")) {
                System.out.println("헬스장에 도착하였습니다.");
                break;
            } else if (inputData.equals("4층")) {
                System.out.println("세연이네 집에 도착하였습니다.");
                break;
            } else if (inputData.equals("5층")) {
                System.out.println("으네 집에 도착하였습니다.");
                break;
            } else {
                System.out.println("해당 층이 존재하지 않습니다. 다시 입력해주세요");
            }
        }
    }
}
