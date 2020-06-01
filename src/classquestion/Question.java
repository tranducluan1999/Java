package classquestion;


public  class Question{
    private String content;
    private String first;
    private String second;
    private String third;
    private String fourth;
    private String trueanswer;
    private String level;

    public Question() {
    }

    public Question(String content, String first, String second, String third, String fourth,String trueanswer, String level) {
        this.content = content;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.trueanswer =trueanswer;
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }
    public String getTrueanswer()
    {
        return trueanswer;
    }
    public void setTrueanswer()
    {
        this.trueanswer = trueanswer;
    }
    public String getLevel()
    {
        return level;

    }
    public void setLevel()
    {
        this.level = level;
    }


    @Override
    public String toString() {
        return "Question{" +
                "content='" + content + '\'' +
                ", first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", third='" + third + '\'' +
                ", fourth='" + fourth + '\'' +
                ", trueanswer='" + trueanswer + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public boolean checkanswer()
    {
        if(this.trueanswer.equalsIgnoreCase(this.fourth))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
