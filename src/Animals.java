public abstract class Animals {
    private static int createdAnimalCounter = 0;

    public Animals() {
        createdAnimalCounter++;
    }

    public abstract void run(int obstacleLength);

    protected abstract void swim(int obstacleLengthTwo);

    public static int getCreatedAnimalCounter() {
        return createdAnimalCounter;
    }
}
