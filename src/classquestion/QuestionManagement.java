package classquestion;

import java.util.Arrays;

public class QuestionManagement {
    private int totalquestion;
    private Question[]questions;

    public QuestionManagement() {
    }

    public QuestionManagement(Question[] questions) {
        this.questions = questions;
        this.totalquestion = this.questions.length;
    }

    public int getTotalquestion() {
        return totalquestion;
    }

    public void setTotalquestion(int totalquestion) {
        this.totalquestion = totalquestion;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "QuestionManagement{" +
                "totalquestion=" + totalquestion +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }

    public  int point()
    {
        int point =0;
        for(int i=0; i<totalquestion;i++) {
            if (questions[i].checkanswer() == true)
            {
                point = point+10;
            }
        }
        System.out.println(" Mark: " + point);
        return point;

    }
    public  void searchAnswer()
    {
        for(int i=0; i<totalquestion;i++)
        {

            if(questions[i].getLevel()=="easy")
            {
                System.out.println(questions[i]);
            }

        }
    }
}
