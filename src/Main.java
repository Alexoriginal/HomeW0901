public class Main {
    public static void main(String[] args) {
        Tank tank=new Tank();
        tank.setNameOfTank("Оплот");
        tank.setWeight(51000);
        tank.setRange(450);
        tank.setCrew(3);
        System.out.println("Название такна - "+tank.getNameOfTank());
        System.out.println("Весс танка - "+tank.getWeight()+"кг");
        System.out.println("Запас хода - "+tank.getRange()+"км");
        System.out.println("Колличество человек экипажа - "+tank.getCrew());

    }

}
