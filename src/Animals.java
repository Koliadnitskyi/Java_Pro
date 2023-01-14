public abstract class Animals {
    static int createdAnimalCounter = 0;

    public Animals() {
        countOfCreatedAnimals();
    }

    public static void countOfCreatedAnimals() {
        createdAnimalCounter++;
    }

    public abstract void run(int obstacleLength);

    public abstract void swim(int obstacleLengthTwo);
}
