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
        //System.out.println("у Людмилы Павловны " + teacherLudmila + " ученика ");
        byte teacherAnna = 27;
        //System.out.println("у Анны Сергеевны " + teacherAnna + " ученика ");
        byte teacherEkaterina = 30;
        //System.out.println("у Екатерины Ивановны " + teacherEkaterina + " ученика ");
        short parper = 480;
        //System.out.println("всего бумаги " + parper + " листа на 3класса ");
        int list = parper / (teacherLudmila + teacherAnna + teacherEkaterina);
        System.out.println("На каждого ученика расчитано " + list + " листов бумаги ");
        byte amountBottle = 16;
        //System.out.println("количество бутылок " + amountBottle + " штук ");
        byte time = 2;
        //System.out.println("требуется " + time + " минуты на изготовление ");
        int performance = amountBottle / time;
        //System.out.println("Производительность " + performance + " бутылок в минуту ");
        short timeTwo = 20;
        //System.out.println(timeTwo);
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
        short shcool = 120;
        //System.out.println("На ремонт школы уходит " + shcool + " банок краски ");
        byte whitePaint = 2;
        //System.out.println(whitePaint);
        byte brownPaint = 4;
        //System.out.println(brownPaint);
        int classroomDye = whitePaint + brownPaint;
        //System.out.println(classroomDye + " банок краски уходит на класс ");
        int numberClassroom = shcool / classroomDye;
        //System.out.println(numberClassroom + " классов в школе ");
        int totalWhitePaint = numberClassroom * whitePaint;
        //System.out.println(totalWhitePaint);
        int totalBrownPaint = numberClassroom * brownPaint;
        //System.out.println(totalBrownPaint);
        System.out.println("В школе, где " + numberClassroom + "классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски " );
        byte bananas = 5;
        //System.out.println(bananas);
        short milk = 200;
        //System.out.println(milk);
        short iceCream = 2;
        //System.out.println();
        byte eggs = 4;
        //System.out.println(eggs);
        int bananasWeight = bananas * 80;
        //System.out.println(bananasWeight);
        double milkWeight = milk * 1.05;
        //System.out.println(milkWeight);
        int iceCreamWeight = iceCream * 100;
        //System.out.println(iceCreamWeight);
        int eggsWeight = eggs * 70;
        //System.out.println(eggsWeight);
        double weightBreafast = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Вес спортзавтрака " + weightBreafast + " грамм ");
        double weightBrefastKg = weightBreafast / 1000;
        System.out.println("Вес спортзавтрака " + weightBrefastKg + " килограмм ");
        byte wieghtGr = 1;
        //System.out.println("Вес граvма " + wieghtGr);
        int grPerKg = 1000;
        System.out.println("В одном кг " + grPerKg + " грамм ");
        float weightKg = wieghtGr / (float) grPerKg;
        System.out.println("В одном грамме " + weightKg + " кг ");
        int weigtLossKg = 7;
        System.out.println("Нужно сбросить " + weigtLossKg + " кг ");
        int weightLossGr = weigtLossKg * grPerKg ;
        System.out.println("Нужно сбросить " + weightLossGr + " грамм");
        short min = 250;
        System.out.println("Минимальная потеря в весе за день " + min + "грамм");
        short max = 500;
        System.out.println("Максимальная потеря в весе за день " + max + "грамм");
        int minDay = weightLossGr / min;
        System.out.println(minDay + " дней уйдет на похудение, если спортсмен будет терять по "  + min + " грамм каждый день");
        int maxDay = weightLossGr / max;
        System.out.println(maxDay + " дней уйдет на похудение, если спортсмен будет терять по " + max + " грамм каждый день");
        int averageLossWeight = (min + max) / 2;
        System.out.println("Средняя потеря веса в день " + averageLossWeight + " грамм");
        int averageDay = weightLossGr / averageLossWeight;
        System.out.println("Потребуется " + averageDay + " дней в среднем, чтобы добиться результата похудения ");
        int masha = 67760;
        //System.out.println("Маша получается "+ masha + " рублей в месяц");
        int denis = 83690;
        //System.out.println("Денис получает " + denis + " рублей в месяц");
        int kristina = 76230;
        //System.out.println("Кристина получает " + kristina + " рублей в месяц ");
        int year = 12;
        //System.out.println("В году " + year + " месяцев");
        int annualSalaryMasha = masha * year;
        //System.out.println(annualSalaryMasha + " рублей Маша зарабатывает в год");
        int annualSalaryDenis = denis * year;
        //System.out.println(annualSalaryDenis + " рублей зарабатывает Денис в год");
        int annualSalaryKristina = kristina * year;
        //System.out.println(annualSalaryKristina + " рублей зарабатывает Кристина в год");
        int salaryMashaNew = masha + masha / 10;
        //System.out.println(salaryMashaNew + " рублей новая зарплата Маши");
        int salaryDenisNew = denis + denis / 10;
        //System.out.println(salaryDenisNew + " рублей новая зарплата Дениса ");
        int salaryKristinaNew = kristina + kristina / 10;
        //System.out.println(salaryKristinaNew + " рублей новая зарплата Кристины");
        int annualSalaryMashaNew = salaryMashaNew * year;
        //System.out.println(annualSalaryMashaNew + " рублей новая годовая зарплата Маши");
        int annualSalaryDenisNew = salaryDenisNew * year;
        //System.out.println(annualSalaryDenisNew + " рублей новая годавая зарплата Дениса");
        int annualSalaryKrisninaNew = salaryKristinaNew * year;
        //System.out.println(annualSalaryKrisninaNew + " рублей новая годовая зарплата Кристины");
        int incomeMasha = annualSalaryMashaNew - annualSalaryMasha;
        //System.out.println(incomeMasha);
        int incomeDenis = annualSalaryDenisNew - annualSalaryDenis;
        //System.out.println(incomeDenis);
        int incomeKristina = annualSalaryKrisninaNew - annualSalaryKristina;
        //System.out.println(incomeKristina);
        System.out.println( "Маша теперь получает " + salaryMashaNew + " рублей. Годовой доход вырос на " + incomeMasha + " рублей");
        System.out.println( "Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + incomeDenis + " рублей");
        System.out.println( "Кристина теперь получается " + salaryKristinaNew + " рублей. Годовой доход вырос на " + incomeKristina + " Рублей" );


























    }
}