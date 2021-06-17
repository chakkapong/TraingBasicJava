public class Demo02 {
    public static void main(String[] args) {

        String name1 = "abc" + "dev";
        int[] scores = new int[5];
        scores[0] = 0;
        scores[1] = 10;
        scores[2] = 20;
        scores[3] = 30;
        scores[4] = 40;

        for (int score : scores) {
            System.out.println(score);
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + " : " + scores[i]);
        }

        //Arrays.stream(scores).forEach(score -> System.out::println);
    }
}
