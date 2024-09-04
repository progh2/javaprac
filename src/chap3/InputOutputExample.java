package chap3;
import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // 입력 한 줄 읽어 input에 저장
        System.out.println("입력한 내용: " + input); // input 문자열 출력
        scanner.close(); // Scanner 객체 닫음
    }
}