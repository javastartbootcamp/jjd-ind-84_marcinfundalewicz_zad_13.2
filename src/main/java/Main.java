import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        // napisz swój program tutaj. Do wczytywania danych użyj przekazanego w parametrze scannera
        ArrayList<Integer> numbers = loadingNumbersToList(scanner);
        printingNumbers(numbers);
        countingSum(numbers);
        searchingSmallestNumber(numbers);
        searchingBiggestNumber(numbers);
    }

    private static void searchingBiggestNumber(ArrayList<Integer> numbers) {
        int biggestCounter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > biggestCounter) {
                biggestCounter = numbers.get(i);
            }
        }
        System.out.println("Największa liczba w liście to " + biggestCounter);
    }

    private static void searchingSmallestNumber(ArrayList<Integer> numbers) {
        int smallestCounter = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallestCounter) {
                smallestCounter = numbers.get(i);
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + smallestCounter);
    }

    private static void countingSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (i == 0) {
                System.out.printf("%d ", numbers.get(i));
            } else {
                System.out.printf("%s %d ", "+", numbers.get(i));
            }
        }
        System.out.print("= " + sum + "\n");
    }

    private static void printingNumbers(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.printf("%d%s", numbers.get(i), ",");
            System.out.print(" ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> loadingNumbersToList(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean positive = true;
        System.out.println("Podaj liczbe dodatnia");
        while (positive) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Koniec programu, miales wpisywac liczby dodatnie");
                positive = false;
            } else {
                System.out.println("Podaj liczbe dodatnia");
                numbers.add(number);
            }
        }
        return numbers;
    }
}
