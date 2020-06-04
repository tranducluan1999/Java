package classquestion;

import java.util.Scanner;

public class Question {
    private String content;
    private String firstanswer;
    private String secondanswer;
    private String thirdanswer;
    private String fourthanswer;
    private String trueanswer;
    private String level;

    public Question() {
    }

    public Question(String content, String firstanswer, String secondanswer, String thirdanswer, String fourthanswer, String trueanswer, String level) {
        this.content = content;
        this.firstanswer = firstanswer;
        this.secondanswer = secondanswer;
        this.thirdanswer = thirdanswer;
        this.fourthanswer = fourthanswer;
        this.trueanswer = trueanswer;
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstanswer() {
        return firstanswer;
    }

    public void setFirstanswer(String firstanswer) {
        this.firstanswer = firstanswer;
    }

    public String getSecondanswer() {
        return secondanswer;
    }

    public void setSecondanswer(String secondanswer) {
        this.secondanswer = secondanswer;
    }

    public String getThirdanswer() {
        return thirdanswer;
    }

    public void setThirdanswer(String thirdanswer) {
        this.thirdanswer = thirdanswer;
    }

    public String getFourthanswer() {
        return fourthanswer;
    }

    public void setFourthanswer(String fourthanswer) {
        this.fourthanswer = fourthanswer;
    }

    public String getTrueanswer() {
        return trueanswer;
    }

    public void setTrueanswer(String trueanswer) {
        this.trueanswer = trueanswer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Question{" +
                "content='" + content + '\'' +
                ", firstanswer='" + firstanswer + '\'' +
                ", secondanswer='" + secondanswer + '\'' +
                ", thirdanswer='" + thirdanswer + '\'' +
                ", fourthanswer='" + fourthanswer + '\'' +
                ", trueanswer='" + trueanswer + '\'' +
                ", level='" + level + '\'' +
                '}';
    }


}
