package chap3;

import java.io.*;

public class BufferedCharsInputWriteExample {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("copy7.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
            }
            System.out.println("파일 복사 성공!");
            bufferedReader.close();
            bufferedWriter.close();
        } catch(IOException e) { // 예외 발생 시 처리
            e.printStackTrace();
        }
    }
}
