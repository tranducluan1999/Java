package classquestion;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionManagement {
    private int totalQuestion;
    private Question []questions;

    public QuestionManagement() {
    }

    public QuestionManagement(Question[] questions) {
        this.questions = questions;
        this.totalQuestion= this.questions.length;


    }

    public int getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
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
                "totalQuestion=" + totalQuestion +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }
    // ktra câu đúng
    public void ktra()
    {
        for(int i=0;i<totalQuestion;i++)
        {
            if (this.questions[i].getTrueanswer().equalsIgnoreCase(this.questions[i].getFirstanswer()))
            {
                System.out.println(" The question" + (i+1) + " is" + " true");

            }
            else
            {
                System.out.println(" The question " + (i+1) + " false");
            }
        }

    }
    //tính điểm
    public int score()
    {
        int k =0,diem=0;
        for(int i=0;i<totalQuestion;i++)
        {
            if (this.questions[i].getTrueanswer().equalsIgnoreCase(this.questions[i].getFirstanswer()))
            {
                k++;

            }
        }
        diem = k*10;
        System.out.println("Score: "+ diem );
        return diem;

    }
    // show đáp  án đúng
    public void showTrueAnswer()
    {
        for (int i=0;i<totalQuestion;i++) {
            if (this.questions[i].getTrueanswer().equalsIgnoreCase(this.questions[i].getFirstanswer()))
            {
                System.out.println(" True Answer of the " + i + " question is: " + questions[i].getTrueanswer());
            }
        }
    }

}
