package cond.ex;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 90;
        String grade;
        if(90 <= score) {
            grade = "A";
        } else if (80 <= score) {
            grade = "B";
        } else if (70 <= score) {
            grade = "C";
        } else if (60 <= score) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 학점은 " + grade +"입니다");
    }
}
