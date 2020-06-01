package classanimal;

import java.util.Arrays;

public class AninalManagement {
    private int totalanimal;
    private Animal[] animals;

    public AninalManagement(Animal[] animal) {
    }

    public AninalManagement(int totalanimal, Animal[] animals) {
        this.totalanimal = this.animals.length;
        this.animals = animals;
    }

    public int getTotalanimal() {
        return totalanimal;
    }

    public void setTotalanimal(int totalanimal) {
        this.totalanimal = totalanimal;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "AninalManagement{" +
                "totalanimal=" + totalanimal +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
