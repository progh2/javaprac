package chap3;
import java.io.*;

public class MultiCharsFileCopyExample {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        int charsRead;
        try {
            fileReader = new FileReader("origin.txt");
            fileWriter = new FileWriter("copy2.txt");
            char[] buffer = new char[1024]; // 1KB 크기의 버퍼를 사용
            while ((charsRead = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, charsRead);
            }
            System.out.println("파일 복사 성공!");
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) { // 예외 발생 시 처리
            e.printStackTrace();
        }
    }
}