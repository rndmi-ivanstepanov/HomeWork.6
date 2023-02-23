public class Loops {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("task 1 ");
        int deposit = 15000;
        int stash = 0;
        int month = 0;

        while (stash < 2459000) {
            stash = stash + deposit;
            month++;
            System.out.println("Month: " + month + "th - sum of deposits is " + stash + " rubles");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("task 2 ");
        int i = 1;

        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("task 3 ");
        int y = 12000000, year = 1;
        int birthRate = (y / 1000) * 17;
        int deathRate = (y / 1000) * 8;
        int populationRate = birthRate - deathRate;

        while (year <= 10) {
            y = y + populationRate;
            System.out.println("Year: " + year + " - population: " + y);
            year++;
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("task 4 ");
        int month = 1;
        double stash = 15000;

        while (stash < 12000000) {
            stash = stash + ((stash * 7) / 100);
            System.out.printf("Month: " + month + "th - stash is %.2f", stash);
            System.out.println();
            month++;
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("task 5 ");
        int month = 1;
        double stash = 15000;

        while (stash < 12000000) {
            stash = stash + ((stash * 7) / 100) ;
            if (month % 6 == 0) {
                System.out.printf("Month: " + month + "th - stash is %.2f", stash);
                System.out.println();
            }
            month++;
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("task 6 ");
        int month = 1;
        double stash = 15000;

        while (month <= (9 * 12)) {
            stash = stash + ((stash * 7) / 100);

            if (month % 6 == 0) {
                System.out.printf("Month: " + month + "th - stash is %.2f", stash);
                System.out.println();
            }
            month++;
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("task 7 ");
        int friday = 3;
        int day = 1;

        while (day <= 31) {

            if (day == friday) {
                System.out.println("Today is Friday, " + day + "th day of month, it's time to make the report");
                friday += 7;
            }
            day++;
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("task 8 ");
        int start = 2023 - 200;
        int end = 2023 + 100;

        while (start <= end) {

            if (start % 79 == 0) {
                System.out.println(start);
                start += 79;
            } else start++;
        }
    }
}
