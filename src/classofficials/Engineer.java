package classofficials;

public class Engineer  extends Officials{

    private String trainingJob;

    public Engineer(String name, float age, String sex, String add) {
        super(name, age, sex, add);
    }

    public Engineer(String name, float age, String sex, String add, String trainingJob) {
        super(name, age, sex, add);
        this.trainingJob = trainingJob;
    }

    public String getTrainingJob() {
        return trainingJob;
    }

    public void setTrainingJob(String trainingJob) {
        this.trainingJob = trainingJob;
    }
}
