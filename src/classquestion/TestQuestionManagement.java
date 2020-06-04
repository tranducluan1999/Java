package classquestion;

import java.util.Scanner;

public class TestQuestionManagement {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        System.out.println("  Enter the number of Question: ");
        int n = sc.nextInt();
        sc.nextLine();

        Question question[] = new Question[n];
        for(int i=0 ; i< question.length;i++)
        {
            System.out.println(" Enter the information of the " + (i+1) + " Question");

            System.out.println(" Content: ");
            String content = sc.nextLine();

            System.out.println("  First Answer: ");
            String first = sc.nextLine();

            System.out.println(" Second Answer: ");
            String second = sc.nextLine();

            System.out.println(" Third Answer: ");
            String third = sc.nextLine();

            System.out.println(" Fourth Answer: ");
            String fourth = sc.nextLine();

            System.out.println(" True Answer: ");
            String trueanswer = sc.nextLine();

            System.out.println(" Level: ");
            String level = sc.nextLine();
            question[i] = new Question(content, first, second, third, fourth, trueanswer, level );
        }

        QuestionManagement questionManagement = new QuestionManagement(question);
        System.out.println(questionManagement);
        questionManagement.ktra();
        questionManagement.showTrueAnswer();
        questionManagement.score();

    }
}
