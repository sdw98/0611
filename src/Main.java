import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1;
        double number2;
        double result = 0;
        boolean ok = true;
        boolean keep = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 계산기 ===");

        System.out.print("첫번째 수를 입력해 주세요: ");
        number1 = scanner.nextDouble();

        while(keep){
            System.out.print("사칙연산(+,-,*,/) 중 골라주세요. ");

            char operator = scanner.next().charAt(0);
            if (operator == '/') {
                while (true) {
                    System.out.print("두번째 수를 입력해 주세요 (0을 제외한 숫자): ");
                    number2 = scanner.nextDouble();

                    if (number2 != 0) {
                        break;
                    }
                    System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                }
            } else {
                System.out.print("두번째 수를 입력해 주세요: ");
                number2 = scanner.nextDouble();
            }
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
                default:
                    System.out.println("잘못된 연산자 입니다.");
                    ok = false;
                    break;
            }
            if(ok) {
                System.out.printf("계산된 결과는 %.2f 입니다. \n", result);
                number1=result;
            }
            System.out.println("계산을 계속 하시겠습니까? (Y/N)");
            String answer = scanner.next();

            if(answer.equals("Y")||answer.equals("y")) {
            }else{ keep=false; }

            System.out.println("----------------------------------");
        }
        System.out.printf("최종으로 계산된 결과는 %.2f 입니다.", result);
    }
}