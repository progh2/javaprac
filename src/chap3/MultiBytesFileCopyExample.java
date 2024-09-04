package chap3;
import java.io.*;

public class MultiBytesFileCopyExample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("한글2024.Zip");
            outputStream = new FileOutputStream("한글20242.Zip");
            byte[] buffer = new byte[1024]; // 1KB 크기의 버퍼를 사용
            int bytesRead;
            int totalBytes = inputStream.available(); // 복사할 바이트 수
            System.out.println("총 바이트 수: " + totalBytes);
            long startTime = System.currentTimeMillis();
            while (inputStream.available() > 0) { // 1바이트씩 읽어서 출력
                bytesRead = inputStream.read(buffer);
                outputStream.write(buffer, 0, bytesRead); // 버퍼의 내용을 출력 스트림에 쓰기
            }
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("실행 시간: " + executionTime + " 밀리초");
            System.out.println("파일 복사 성공!");
            inputStream.close();
            outputStream.close();
        } catch (IOException e) { // 예외 발생 시 처리
            e.printStackTrace();
        }
    }
}
