package chap3;
import java.io.*;

public class BufferedBytesFileCopyExample {
    public static void main(String[] args) {
        try (
                BufferedInputStream inputStream =  new BufferedInputStream(new FileInputStream("한글2024.Zip"),16000);
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("한글20243.Zip"),16000);
        ) {
            int byteData; // 한 번에 읽을 바이트 크기
            int totalBytes = inputStream.available(); // 복사할 총 바이트 수
            System.out.println("총 바이트 수: " + totalBytes);
            long startTime = System.currentTimeMillis();
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("실행 시간: " + executionTime + " 밀리초");
            System.out.println("파일 복사 성공!");
        } catch (IOException e) { // 예외 발생 시 처리
            e.printStackTrace();
        }
    }
}