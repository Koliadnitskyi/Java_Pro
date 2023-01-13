public class Main {
    public static void main(String[] args) {
        Dog bil = new Dog();
        bil.run(20);
        bil.swim(9);
        Cat olli = new Cat();
        olli.run(13);
        olli.swim(22);
        System.out.println("Total cats, dogs and animals created: " + Animals.createdAnimalCounter);
    }
}
