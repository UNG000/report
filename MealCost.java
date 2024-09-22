package report;

import java.util.Scanner;

public class MealCost {
    public static void main(String[] args) {
        int baekjoon = 1000;
        int kim = 3000;
        
        System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
        
        int totalCost = baekjoon + kim;
        System.out.println("백준이: " + baekjoon + "원");
        System.out.println("김범이: " + kim + "원");
        System.out.println("총 식사 금액: " + totalCost + "원");
    }
}