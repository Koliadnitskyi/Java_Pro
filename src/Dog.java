public class Dog extends Animals {
    public Dog() {
        Main.countOfCreatedAnimals();
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= 500) System.out.println("The dog ran: " + obstacleLength + " метров");
    }

    @Override
    public void swim(int obstacleLengthTwo) {
        if (obstacleLengthTwo <= 10) System.out.println("The dog swam: " + obstacleLengthTwo + " метров");
    }
}
