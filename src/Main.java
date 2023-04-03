
public class Main {
    public static void main(String[] args) {

        int startCapital = 170;
        int addSum = 1000;
        int bonus;

        if (addSum < 1000) {
            bonus = 0;}
        else {
            bonus = addSum/100;}

        int sumZ = addSum + bonus;
        int itogo = startCapital+addSum+bonus;

        System.out.println("Сумма пополнения составила " + addSum + " рублей. Вам начислено " + bonus + " бонусов.");
        System.out.println("Общая сумма зачисления равна " + sumZ + " рублей.");
        System.out.println("Итого на балансе: " + itogo);
    }
}