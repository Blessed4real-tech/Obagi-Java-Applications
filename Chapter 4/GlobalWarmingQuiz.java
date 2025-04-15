//Global Warming Facts Quiz

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correct = 0;

        // Questions and answers
        String[] questions = {
            "What gas is primarily responsible for global warming?\n1) CO2 2) O2 3) N2 4) H2",
            "Is global warming a natural process only?\n1) Yes 2) No 3) Partially 4) Unknown",
            "What year did IPCC win the Nobel Peace Prize?\n1) 2005 2) 2007 3) 2010 4) 2012",
            "Do skeptics deny all climate change?\n1) Yes 2) No 3) Sometimes 4) Rarely",
            "What’s a common effect of global warming?\n1) Cooling 2) Sea rise 3) More snow 4) Less rain"
        };
        int[] answers = {1, 2, 2, 2, 2}; // Correct answers

        // Administer quiz
        for (int i = 0; i < 5; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer (1-4): ");
            int response = input.nextInt();
            if (response == answers[i]) correct++;
        }

        // Results
        System.out.println("\nCorrect answers: " + correct);
        if (correct == 5) System.out.println("Excellent");
        else if (correct == 4) System.out.println("Very good");
        else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Sources: www.ipcc.ch, www.climate.gov, www.skepticalscience.com");
        }
        input.close();
    }
}