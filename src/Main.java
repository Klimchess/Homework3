import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        int a = 2000;
        System.out.println("Значение переменной с типом int равно " + a );
        byte b = 1;
        System.out.println("Значение переменной с типом byte равно " + b);
        short c = 85;
        System.out.println("Значение пересенной с типом short равно " + c);
        long d = -8000;
        System.out.println("Значение переменной с типом long равно " + d);
        float f = 4.5F;
        System.out.println("Значение переменной с типос float равно " + f);
        double e = 65.74;
        System.out.println("Значeние переменной с типом double равно " + e);
        float cat = 27.12f;
        System.out.println(cat);
        double fish = 2.786;
        System.out.println(fish);
        short world = -159;
        System.out.println(world);
        int scotch = 27897;
        System.out.println(scotch);
        byte ball = 67;
        System.out.println(ball);
        long hi = 987678965549L;
        System.out.println(hi);
        short bag = 569;
        System.out.println(bag);
        byte teacherLudmila = 23;
        System.out.println("у Людмилы Павловны " + teacherLudmila + " ученика ");
        byte teacherAnna = 27;
        System.out.println("у Анны Сергеевны " + teacherAnna + " ученика ");
        byte teacherEkaterina = 30;
        System.out.println("у Екатерины Ивановны " + teacherEkaterina + " ученика ");
        short parper = 480;
        System.out.println("всего бумаги " + parper + " листа на 3класса ");
        int list = parper / (teacherLudmila + teacherAnna + teacherEkaterina);
        System.out.println("На каждого ученика расчитано " + list + " листов бумаги ");
        byte amountBottle = 16;
        System.out.println("количество бутылок " + amountBottle + " штук ");
        byte time = 2;
        System.out.println("требуется " + time + " минуты на изготовление ");
        int performance = amountBottle / time;
        System.out.println("Производительность " + performance + " бутылок в минуту ");
        short timeTwo = 20;
        System.out.println(timeTwo);
        int bottlesProduced = timeTwo * performance;
        System.out.println("За 20минут машина произвела " + bottlesProduced + " штук бытулок ");
        short day = 24 * 60;
        System.out.println(day);
        int bottlesProductedDay = day * performance;
        System.out.println("За сутки машина произвела " + bottlesProductedDay + " штук бутылок ");
        int threeDay = day * 3;
        System.out.println(threeDay);
        int bottlesProductedThreeDay = threeDay * performance;
        System.out.println("За три дня машина произвела " + bottlesProductedThreeDay + " штук бутылок ");
        int month = day * 30;
        System.out.println(month);
        int bottlesProductedMonth = month * performance;
        System.out.println("За месяц машина произвела " + bottlesProductedMonth + " штук бутылок ");












    }
}