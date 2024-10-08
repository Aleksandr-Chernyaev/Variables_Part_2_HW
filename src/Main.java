//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");

        byte a = 100;
        short b = 10_000;
        int c = 1100000;
        long d = 100_000_000_0L;
        float e = 5.1f;
        double f = 7.245;

        System.out.println("Значение переменной 'a' с типом byte равно " + a);
        System.out.println("Значение переменной 'b' с типом short равно " + b);
        System.out.println("Значение переменной 'c' с типом int равно " + c);
        System.out.println("Значение переменной 'd' с типом long равно " + d);
        System.out.println("Значение переменной 'e' с типом float равно " + e);
        System.out.println("Значение переменной 'f' с типом double равно " + f);

        System.out.println("Задача 2");

        double a1 = 27.12;
        long b1 = 987_678_965_549L;
        float c1 = 2.786f;
        short d1 = 569;
        short e1 =  -159;
        int f1 = 27897;
        byte g1 = 67;

        System.out.println("Задача 3");

        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentsEkaterina = 30;
        short sheetsOfPaperAll = 480;

        short allStudentds = (short) (studentsLudmila + studentsAnna + studentsEkaterina);
        short sheetsOfPaperStudent = (short) (sheetsOfPaperAll / allStudentds);
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaperStudent + " листов бумаги.");

        System.out.println("Задача 4");

        int bottlesInTwoMinute = 16;
        int bottlesInOneMinute = 16 / 2;
        int minutesInDay = 12 * 60;
        int minutesInTreeDays = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesInTwentyMinute = 20 * bottlesInOneMinute;
        int bottlesInDay = minutesInDay * bottlesInOneMinute;
        int bottlesInTreeDays = minutesInTreeDays * bottlesInOneMinute;
        int bottlesInMonth = minutesInMonth * bottlesInOneMinute;

        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesInTreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesInMonth + " штук бутылок");

        System.out.println("Задача 5");

        int totalCans = 120;
        int totalClasses = totalCans / (2+4);
        int totalWhitePaint = totalClasses * 2;
        int totalBrownPaint = totalClasses * 4;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        System.out.println("Задача 6");

        int weightOfFiveBananasGr = 5 * 80;
        int milkWeightGr = 2 * 105;
        int weightOfTwoIceCreamsGr = 2 * 100;
        int weightOfFourEggsGr = 4 * 70;

        int breakfastWeightGr = weightOfFiveBananasGr + milkWeightGr + weightOfTwoIceCreamsGr + weightOfFourEggsGr;
        float breakfastWeightKg = breakfastWeightGr / 1000f;

        System.out.println("Вес одного завтрака в граммах = " + breakfastWeightGr + ", а в кг = " + breakfastWeightKg);

        System.out.println("Задача 7");

        int daysOneProgram = (7 * 1000) / 250;
        int daysTwoProgram = (7 * 1000) / 500;
        int daysOnAverage = (daysOneProgram + daysTwoProgram) / 2;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет " + daysOneProgram + " дней, а если по 500 грамм, то " + daysTwoProgram + ". Среднее количество дней " + daysOnAverage);

        System.out.println("Задача 8");

        int oldSalaryMashaInOneMonth = 67_760;
        int oldSalaryDenisInOneMonth = 83_690;
        int oldSalaryKristinaInOneMonth = 76_230;

        int oldSalaryMashaInOneYear = oldSalaryMashaInOneMonth * 12;
        int oldSalaryDenisInOneYear = oldSalaryDenisInOneMonth * 12;
        int oldSalaryKristinaInOneYear = oldSalaryKristinaInOneMonth * 12;

        double newSalaryMashaInOneMonth = oldSalaryMashaInOneMonth * 1.1;
        double newSalaryDenisInOneMonth = oldSalaryDenisInOneMonth * 1.1;
        double newSalaryKristinaInOneMonth = oldSalaryKristinaInOneMonth * 1.1;

        int newSalaryMashaInOneYear = (int) (newSalaryMashaInOneMonth * 12);
        int newSalaryDenisInOneYear = (int) (newSalaryDenisInOneMonth * 12);
        int newSalaryKristinaInOneYear = (int) (newSalaryKristinaInOneMonth * 12);

        System.out.println("Маша теперь получает " + (int) newSalaryMashaInOneMonth + " рублей в месяц. Годовой доход вырос на " + (newSalaryMashaInOneYear - oldSalaryMashaInOneYear) + " рублей.");
        System.out.println("Денис теперь получает " + (int) newSalaryDenisInOneMonth + " рублей в месяц. Годовой доход вырос на " + (newSalaryDenisInOneYear - oldSalaryDenisInOneYear) + " рублей.");
        System.out.println("Кристина теперь получает " + (int) newSalaryKristinaInOneMonth + " рублей в месяц. Годовой доход вырос на " + (newSalaryKristinaInOneYear - oldSalaryKristinaInOneYear) + " рублей.");

    }
}