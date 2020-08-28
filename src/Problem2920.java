//https://www.acmicpc.net/problem/2920

import java.util.*;

public class Problem2920 {
    public static void main(String[] args) {
        String asc = "[1, 2, 3, 4, 5, 6, 7, 8]";
        String desc = "[8, 7, 6, 5, 4, 3, 2, 1]";

        Scanner input = new Scanner(System.in);
        int[] requestArray = new int[8];
        for (int i = 0; i < 8; i++) {
            requestArray[i] = input.nextInt();
        }

        String requestString = Arrays.toString(requestArray);
        if(asc.equals(requestString)) {
            System.out.println("ascending");
        } else if (desc.equals(requestString)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
