package classquestion;

import java.util.Scanner;

public class TestQuestionManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Import the number of question: ");
        int n = sc.nextInt();
        sc.nextLine();

        Question question[] = new Question[n];

        for(int i=0;i<question.length;i++)
        {
            System.out.println(" Import infomation for question: " + (i+1 ));

            System.out.println(" Import content: ");
            String content = sc.nextLine();

            System.out.println(" First Answer: ");
            String fa = sc.nextLine();

            System.out.println(" Second Answer: ");
            String sa = sc.nextLine();

            System.out.println(" Third Answer: ");
            String ta = sc.nextLine();

            System.out.println(" Fourth Answer: ");
            String fanswer = sc.nextLine();

            System.out.println(" True Answer: ");
            String tr = sc.nextLine();

            System.out.println(" Level: ");
            String level = sc.nextLine();

            question[i]  = new Question(content, fa, sa, ta, fanswer, tr, level);

        }
        QuestionManagement questionManagement = new QuestionManagement(question);
        System.out.println(questionManagement);
        questionManagement.point();
        questionManagement.searchAnswer();
    }
}
