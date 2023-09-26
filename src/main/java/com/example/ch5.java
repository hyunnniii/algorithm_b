public class ch5 {
    public static void main(String[] args){
        int [] [] score = {
                {100, 100, 60},
                {70, 50, 50},
                {40, 80, 90},
                {90, 100, 30},
                {85, 70, 55},
        };

        int korTotal = 0, engTotal = 0, mathTotal =0;
        System.out.println("순서  국어  영어  수학  총점");
        System.out.println("===========================");

        for(int i=0; i < score.length; i++) {
            int sum = 0;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i + 1);

            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            System.out.printf("%5d%n", sum);
        }
            System.out.println("=============================");
            System.out.printf("총점 : %3d %4d %4d%n",korTotal, engTotal, mathTotal);
        }
    }
