import java.util.ArrayList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1874
public class Problem1874 {
    public static void main(String[] args) {

        //판단 논리
        //합당성 : 값이 올라 갈떈 상관 없고, 내려 갈떈  자신의 바로 뒷값(5인경우 6)이 이미 나왔는 지 판단
        //+,- 추가 : 배열 반복 돌때 마다 - 추가, 그전에 현재 값이 기존 최고값 보다 높은 경우, 높은 만큼  + 추가
        int maxNum = 0;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        ArrayList answer = new ArrayList<>();

        boolean[] isPop = new boolean[count + 1]; //계산 편하게 하려고 0 부터 시작한다고 가정
        isPop[0] = true; // 0 은 이미 출력됐다고 가정
        int[] progression = new int[count];
        for (int i = 0; i < count; i++) {
            progression[i] = sc.nextInt();
        }

        for (int number : progression) {
            if (maxNum < number) {
                for (int i = 0; i < number - maxNum; i++) {
                    answer.add("+");
                }
                answer.add("-");
                maxNum = number;
            } else {
                if (isPop[number + 1]) { // 자신의 바로 뒷값(3인경우 4)이 이미 pop되었는지 판단
                    answer.add("-");
                } else { // 바로 뒷값이 pop 안되엇으면 break;
                    System.out.println("NO");
                    answer = null;
                    break;
                }
            }
            isPop[number] = true;
        }
        if (answer != null) {
            System.out.println(String.join("\n", answer));
        }
    }
}