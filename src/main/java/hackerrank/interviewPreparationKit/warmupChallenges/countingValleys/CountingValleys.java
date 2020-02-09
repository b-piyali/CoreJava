package hackerrank.interviewPreparationKit.warmupChallenges.countingValleys;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
    // Complete the countingValleys function below.
    private static int countingValleys(int n, String s) {
        int vallyCount = 0;
        int lvl = 0;
        for(char c : s.toCharArray()){
            if(c == 'U') ++lvl;
            else if(c == 'D') --lvl;

            // if we just came UP to sea level
            if(lvl == 0 && c == 'U')
                ++vallyCount;
        }
        return vallyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = "DDUUDDUDUUUD";

        int result = countingValleys(12, s);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
        System.out.println(result);
    }
}
