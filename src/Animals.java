public class Animals {
    public Animals() {
        Main.countOfCreatedAnimals();
    }

    public void run(int obstacleLength) {
        System.out.println("The animals ran: " + obstacleLength + " метров");
    }

    public void swim(int obstacleLengthTwo) {
        System.out.println("The animals swam: " + obstacleLengthTwo + " метров");
    }
}
