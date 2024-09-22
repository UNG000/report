package report;

import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("8자리 생년월일을 입력하세요 (예: 20010316): ");
        int birthDate = sc.nextInt();
        
        int year = birthDate / 10000;
        int month = (birthDate % 10000) / 100;
        int day = birthDate % 100;
        
        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}