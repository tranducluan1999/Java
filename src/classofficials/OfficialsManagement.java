package classofficials;

import java.util.Arrays;

public class OfficialsManagement {

    private Worker[]workers;
    private Engineer[]engineers;

    public OfficialsManagement() {

    }

    public OfficialsManagement(Worker[] workers, Engineer[] engineers) {
        this.workers = workers;
        this.engineers = engineers;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public Engineer[] getEngineers() {
        return engineers;
    }

    public void setEngineers(Engineer[] engineers) {
        this.engineers = engineers;
    }

    @Override
    public String toString() {
        return "OfficialsManagement{" +
                "workers=" + Arrays.toString(workers) +
                ", engineers=" + Arrays.toString(engineers) +
                '}';
    }
}
