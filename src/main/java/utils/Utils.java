package utils;

import java.util.List;

public class Utils {
    public static int calculateGameScore(List<String> userAnswers, List<String> correctAnswers) {
        int score = 0;
        for (int i = 0; i < userAnswers.size(); i++) {
            if (userAnswers.get(i).equals(correctAnswers.get(i))) {
                score++;
            }
        }
        return score;
    }
}
