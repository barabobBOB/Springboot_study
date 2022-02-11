package Chapter4;

public class IfDiceExample {
    public static void main(String[] args){
        System.out.println("주사위의 결과는??");

        int num = (int)(Math.random()*6) + 1;

        if(num == 1){
            System.out.println("1 등장");
        }
        else if(num == 2){
            System.out.println("2 등장");
        }
        else if(num == 3){
            System.out.println("3 등장");
        }
        else if(num == 4){
            System.out.println("4 등장");
        }
        else if(num == 5){
            System.out.println("5 등장");
        }
        else {
            System.out.println("6 등장");
        }
    }
}
