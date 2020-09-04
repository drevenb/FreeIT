package clothes;

public class Runner {
    public static void main(String[] args) {

        Human human1 = new Human("Sasha");
        Human human2 = new Human("Vasya");
        Human human3 = new Human("Dasha");

        human1.getDressed(new RedJacket(), new WhitePants(), new BlackShoes());
        human2.getDressed(new BlackJacket(), new RedPants(), new WhiteShoes());
        human3.getDressed(new WhiteJacket(), new BlackPants(), new RedShoes());

        human1.undress();
        human2.undress();
        human3.undress();
    }
}