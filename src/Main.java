public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int score = 1100;
        int summa = 300;


        int bonus;
        if (score > 1000) {
            bonus = score / 100;
        } else {
            bonus = 0;
        }
        score = balance + score + bonus;

        System.out.println((balance + summa) + "бонусы");
        System.out.println(score + "бонусы");
    }
}
