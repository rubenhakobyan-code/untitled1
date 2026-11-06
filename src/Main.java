import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);

        System.out.print("x (zuyg/kent): ");
        int num1 = scanner.nextInt();
        System.out.println(isEven(num1));

        System.out.print("x (drakan/batsasakan): ");
        int num2 = scanner.nextInt();
        System.out.println(isPositive(num2));

        System.out.print("x (mijakaq 5-8 kam 15-20): ");
        int num3 = scanner.nextInt();
        System.out.println(checkRange(num3));

        System.out.print("x (bazhanvum e 5-i ev 7-i): ");
        int num4 = scanner.nextInt();
        System.out.println(isDivisibleBy5And7(num4));

        System.out.print("ernish tiv (erkrord tvanshany 7 e te voch): ");
        int num5 = scanner.nextInt();
        System.out.println(isSecondDigitSeven(num5));

        System.out.print("x y koordinatner: ");
        double xCoord = scanner.nextDouble();
        double yCoord = scanner.nextDouble();
        System.out.println(isInsideCircle(xCoord, yCoord));

        System.out.print("3 tiv: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(findMaxOfThree(a, b, c));

        System.out.print("tari: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));

        print1To200();

        System.out.print("arajin tvanshan (tiv): ");
        int num12 = scanner.nextInt();
        printFirstDigit(num12);

        printSumConditions();

        System.out.print("qarakusu chap: ");
        int sideSize = scanner.nextInt();
        printSquare(sideSize);

        System.out.print("N (5-i bazhanvoghneri gumar): ");
        int n15 = scanner.nextInt();
        System.out.println(sumDivisibleBy5(n15));

        System.out.print("N (erknish zuyg tveri artadryal): ");
        int n16 = scanner.nextInt();
        System.out.println(productOfTwoDigitEvens(n16));

        System.out.print("N (min max mijin): ");
        int n17 = scanner.nextInt();
        calculateMinMaxAverage(n17);

        System.out.print("5-anish tiv: ");
        int num18 = scanner.nextInt();
        System.out.println(sumOfDigits5(num18));

        scanner.close();
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isPositive(int x) {
        return x >= 0;
    }

    public static boolean checkRange(int x) {
        return (x > 5 && x < 8) || (x > 15 && x < 20);
    }

    public static boolean isDivisibleBy5And7(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    public static boolean isSecondDigitSeven(int x) {
        int absX = Math.abs(x);
        int secondDigit = (absX / 10) % 10;
        return secondDigit == 7;
    }

    public static boolean isInsideCircle(double x, double y) {
        double centerX = 0.0;
        double centerY = 5.0;
        double radius = 5.0;
        double distanceSquared = Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2);
        return distanceSquared <= Math.pow(radius, 2);
    }

    public static int findMaxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static void print1To200() {
        for (int i = 1; i <= 200; i++) {
            System.out.print(i + (i == 200 ? "" : ", "));
        }
        System.out.println();
    }

    public static void printFirstDigit(int number) {
        int temp = Math.abs(number);
        if (temp == 0) {
            System.out.println(0);
            return;
        }
        while (temp >= 10) {
            temp /= 10;
        }
        System.out.println(temp);
    }

    public static void printSumConditions() {
        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y += 2;
        }
    }

    public static void printSquare(int size) {
        if (size <= 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    public static int sumDivisibleBy5(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static long productOfTwoDigitEvens(int n) {
        long product = 1;
        boolean found = false;
        for (int i = 10; i <= n && i <= 99; i += 2) {
            product *= i;
            found = true;
        }
        return found ? product : 0;
    }

    public static void calculateMinMaxAverage(int n) {
        if (n < 1) {
            return;
        }
        int min = 1;
        int max = n;
        double average = (min + max) / 2.0;
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }

    public static int sumOfDigits5(int number) {
        int temp = Math.abs(number);
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}