public class CatRunner {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Joe", 8, 8.5);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("joey", 6, 14.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
