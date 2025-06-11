import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String COLA = "콜라";
        final String MILK = "밀키스";
        final String PEP = "닥터페퍼";

        final int COLA_PRICE = 1200;
        final int MILK_PRICE = 1500;
        final int PEP_PRICE = 800;


        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 자판기 메뉴 ===");
        System.out.printf("1. %s (%d원)\n", COLA, COLA_PRICE);
        System.out.printf("2. %s (%d원)\n", MILK, MILK_PRICE);
        System.out.printf("3. %s (%d원)\n", PEP, PEP_PRICE);

        int price = 0;
        int choice = scanner.nextInt();
        String item = "";

        switch (choice) {
            case 1:
                item = "콜라";
                price = 1200;
                break;
            case 2:
                item = "밀키스";
                price = 1500;
                break;
            case 3:
                item = "닥터페퍼";
                price = 800;
                break;
            default:
                System.out.println("잘못입력하셨습니다");
                return;
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
