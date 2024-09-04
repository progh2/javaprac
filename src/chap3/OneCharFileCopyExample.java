package chap3;
import java.io.*;

public class OneCharFileCopyExample {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("origin.txt");
            fileWriter = new FileWriter("copy2.txt");
            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }
            System.out.println("파일 복사 성공!");
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) { // 예외 발생 시 처리
            e.printStackTrace();
        }
    }
}