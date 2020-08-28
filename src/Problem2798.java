//https://www.acmicpc.net/problem/2798

import java.util.*;

public class Problem2798 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cardCount = input.nextInt();
        int targetNumber = input.nextInt();
        int answer = 0;

        int[] cards = new int[cardCount];
        for (int i = 0; i < cardCount; i++) {
            cards[i] = input.nextInt();
        }
        outerloop:
        for (int firstPoint = 0; firstPoint < cardCount - 2; firstPoint++) {
            for (int secondPoint = firstPoint + 1; secondPoint < cardCount - 1; secondPoint++) {
                for (int thirdPoint = secondPoint + 1; thirdPoint < cardCount ; thirdPoint++) {
                    int sum = cards[firstPoint] + cards[secondPoint] + cards[thirdPoint];
//                    System.out.println("cards[firstPoint]: " + cards[firstPoint] + " cards[secondPoint]: " + cards[secondPoint] +" cards[thirdPoint]: " + cards[thirdPoint]);
                    if (sum > answer && targetNumber >= sum) {
                        answer = sum;
                    }
                    if (answer == targetNumber){
                        break outerloop;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}

