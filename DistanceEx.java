package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 25;
        String move = null;

        if(distance <= 1) {
            move = "도보";
        } else if (distance <= 10) {
            move = "자전거";
        } else if (distance <= 100) {
            move = "자동차";
        } else if (100 < distance ) {
            move = "비행기";
        }
        System.out.println("distance:" + distance);
        System.out.println( move + "를 이용하세요.");
    }
}
