package report;

import java.util.Scanner;

public class TravelCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력
        System.out.print("여행지>> ");
        String destination = sc.nextLine();  // 여행지 입력
        
        System.out.print("인원수>> ");
        int persons = sc.nextInt();  // 여행 인원 입력
        
        System.out.print("숙박일>> ");
        int nights = sc.nextInt();  // 숙박 일수 입력
        
        System.out.print("1인당 항공료>> ");
        int flightCostPerPerson = sc.nextInt();  // 1인당 항공료 입력
        
        System.out.print("1박 숙박비>> ");
        int accommodationCostPerNight = sc.nextInt();  // 1박당 숙박비 입력
        
        // 방의 개수 계산: 1방에 최대 2명
        int roomsNeeded = (persons + 1) / 2;
        
        // 총 항공료 = 1인당 항공료 * 인원
        int totalFlightCost = flightCostPerPerson * persons;
        
        // 총 숙박비 = 1박당 숙박비 * 숙박일수 * 방 개수
        int totalAccommodationCost = accommodationCostPerNight * nights * roomsNeeded;
        
        // 총 경비 = 총 항공료 + 총 숙박비
        int totalCost = totalFlightCost + totalAccommodationCost;
        
        // 결과
        System.out.println(persons + "명의 " + destination + " " + nights + "박 " + (nights + 1) + "일 여행에는 방이 " + roomsNeeded + "개 필요하며 경비는 " + totalCost + "원입니다.");
    }
}