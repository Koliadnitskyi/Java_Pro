public class Cat extends Animals {
    @Override
    public void run(int obstacleLength) {
        if (obstacleLength <= 200) System.out.println("The cat ran: " + obstacleLength + " метров");
    }

    @Override
    public void swim(int obstacleLengthTwo) {
        System.out.println("Сat can't swim");
    }
}
