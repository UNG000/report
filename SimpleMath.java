package report;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("값을 입력하세요: ");
        int value = sc.nextInt();
        
        int result = 31200 * value;
        System.out.println("결과: " + result);
    }
}