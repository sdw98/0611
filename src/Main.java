import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.println("1. 닥터페퍼 ( 800원 ) ");
        System.out.println(("2. 콜라 ( 1200원 )"));
        System.out.println("3. 밀키스 ( 1500원 ) ");

        int price = 0;
        int choice = scanner.nextInt();
        String item = "";


        //입력한 값에 따른 조건문
        //if문 (숫자를 비교), switch(단순히 값만 체크)

        switch (choice) {
            case 1:
                item = "닥터페퍼";
                price = 800;
                break;
            case 2:
                item = "콜라";
                price = 1200;
                break;
            case 3:
                item = "밀키스";
                price = 1500;
                break;
            default:
                System.out.println("잘못입력하셨습니다");
                return;   // 함수탈출(메인) 탈출
        }

        System.out.println(item + "을(를) 선택하셨습니다. 금액을 넣어주세요: ");
        int money = scanner.nextInt();

        while (money < price) {
            System.out.println("금액이 부족합니다. 다시 넣어주세요");
            int money2 = scanner.nextInt();
            money += money2;
        }

        int change = money - price;
        System.out.printf("%s를 드립니다. 잔돈은 %d원 입니다.\n", item, change);
    }
}
