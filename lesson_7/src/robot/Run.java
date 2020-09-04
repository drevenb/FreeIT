package robot;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot robot1 = new Robot(new SamsungHead(500), new SonyHand(350), new ToshibaLeg(250));
        Robot robot2 = new Robot(new SonyHead(600), new ToshibaHand(300), new SamsungLeg(350));
        Robot robot3 = new Robot(new ToshibaHead(450), new SamsungHand(250), new SonyLeg(300));

        robot1.action();
        robot2.action();
        robot3.action();

        Robot mostExpensive = robot1.getPrice() > robot2.getPrice() ? robot1 : robot2;
        mostExpensive = mostExpensive.getPrice() > robot3.getPrice() ? mostExpensive : robot3;

        System.out.println(mostExpensive);
    }
}

