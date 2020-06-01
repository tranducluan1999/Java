package classquestion;

import java.util.Scanner;

public class TestQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        Question question = new Question(content, fa, sa, ta, fanswer, tr, level);
        System.out.println(question);

        if(question.checkanswer() == true)
        {
            System.out.println(" Exactly!!!!!!");
        }
        else
        {
            System.out.println(" Wrong :((((");
        }


    }



}
