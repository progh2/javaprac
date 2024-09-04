package chap3;

public class GetWorkingDir {
    public static void main(String[] args) {
        System.out.print("작업 디렉토리 경로: ");
        System.out.println(System.getProperty("user.dir"));
    }
}
