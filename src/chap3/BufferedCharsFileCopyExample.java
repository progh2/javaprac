package chap3;
import java.io.*;

public class BufferedCharsFileCopyExample {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("origin.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("copy6.txt"));
            int character;
            while ((character = bufferedReader.read()) != -1){
                bufferedWriter.write(character);
            }
            System.out.println("파일 복사 성공!");
            bufferedReader.close();
            bufferedWriter.close();
        } catch(IOException e) { // 예외 발생 시 처리
            e.printStackTrace();
        }
    }
}