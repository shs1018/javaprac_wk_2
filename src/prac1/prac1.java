package prac1;

import java.util.*;

public class prac1 {
    public static void main(String[] args) {
        //숫자만 입력해주면 알아서 하는 369 게임 만들기 (100 언더)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number for 369 game!! >> under 100\t");
        int tmp = scanner.nextInt();

        for (int i = 1; i <= tmp; i++) {
            System.out.printf("number is %d\t", i);

            int j = i;
            do {
                if (j % 10 % 3 == 0 && j % 10 != 0) { //현재 주어진 수 i의 일의자리수가 3의 배수인가?
                    System.out.print("clap");
                }
            } while ((j /= 10) != 0); //int형이라 소수점으로 나눠지면 그냥 0으로 취급해버림, i를 10으로 나눠서 그 값이 0이 아니면 반복 -> 10의 자리수가 3의 배수인가를 테스트
            System.out.println(); //대충 줄바꿈용

            //근데 100 이하가 아닌 1000,200000 단위의 숫자로 369를 돌리고 싶다면? -> 각 자릿수를 10으로 나눠서 세면?
        }
    }
}
