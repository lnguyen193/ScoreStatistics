import java.util.Scanner;

public class ScoreStatistics {
    public static void main (String args[]){

        int min, max, sum;
        double avg;
        int counter = 0;
        int score;
        sum = 0;
        avg = 0.0;
        min = 0;
        max = 0;

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");

        score = keybd.nextInt();

        keybd.nextLine();

        while (score != -1) {
        if (counter == 0){
            min = score;
            max = score;

        } else {
            if (score < min)
                min = score;
            else if (score > max)
                max = score;
        }

            sum = sum + score;
            counter++;


            System.out.println("Number of test: " + counter);

            System.out.println("Sum of score: " + sum);

            System.out.println("Please enter another score:");
            score = keybd.nextInt();
        }

       if (counter > 0)
           avg = sum / counter;

        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}
