package Game369_2;

import java.util.ArrayList; //가변적으로 변하는 배열 생성
import java.util.Scanner;

public class Game369_2 {
    public static void main(String[] args) {
        //숫자만 입력해주면 알아서 하는 369 게임 만들기 (int 범위 안)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number for 369 game!! >>\t");
        int tmp = scanner.nextInt();

        for (int i = 1; i <= tmp; i++) {
            System.out.printf("number is %d\t", i);
            int Num = i;
            ArrayList<Integer> arrNum = new ArrayList<>();

            while (Num > 0) {
                arrNum.add(Num % 10);
                Num /= 10;
            } //arrNum에는 i의 각 자릿수들이 입력 된 상태이다.
            int len = arrNum.size(); // arraylist는 그 크기를 셀 때 length 가 아닌 size를 사용한다

            for (int v = 0; v < len; v++) {
                if (arrNum.get(v) % 3 == 0 && arrNum.get(v) / 3 != 0) {
                    System.out.print("clap!  ");
                }
            }System.out.println();
        }

    }
}

