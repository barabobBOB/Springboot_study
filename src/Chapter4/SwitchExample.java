package Chapter4;

public class SwitchExample {
    public static void main(String[] args){
        System.out.println("주사위의 결과는??");

        int num = (int)(Math.random()*6) + 1;

        switch (num){
            case 1:
                System.out.println("1 등장");
                break;
            case 2:
                System.out.println("2 등장");
                break;
            case 3:
                System.out.println("3 등장");
                break;
            case 4:
                System.out.println("4 등장");
                break;
            case 5:
                System.out.println("5 등장");
                break;
            default:
                System.out.println("6 등장");
                break;
        }
    }
}
