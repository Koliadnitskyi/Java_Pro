public class Main {
    private static int createdAnimalCounter = 0;

    public static void countOfCreatedAnimals() {
        createdAnimalCounter++;
    }

    public static void main(String[] args) {
        Animals fil = new Animals();
        Dog bil = new Dog();
        bil.run(20);
        bil.swim(9);
        Cat olli = new Cat();
        olli.run(13);
        olli.swim(22);
        System.out.println("Total cats, dogs and animals created: " + createdAnimalCounter);
    }
}
