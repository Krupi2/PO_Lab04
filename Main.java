import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    zadanie1();
    zadanie2();
    zadanie3();
    zadanie4();
    zadanie5();
    zadanie6();
    zadanie7();
    }//koniec main
    public static  int[] generateRandomArray(int length){
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(15+5+1)-5;
        }
        return array;
    }
    public static void zadanie1(){
        int[] array = generateRandomArray(10);
        System.out.print("Tablica: ");
        for (int element : array) {
            System.out.print(element + " ");
        }

        // Obliczanie sumy i średniej z użyciem pętli for
        int sumFor = 0;
        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }
        double averageFor = (double) sumFor / array.length;

        // Obliczanie sumy i średniej z użyciem pętli for each
        int sumForEach = 0;
        for (int element : array) {
            sumForEach += element;
        }
        double averageForEach = (double) sumForEach / array.length;

        System.out.println("\nSuma elementów tablicy (użycie pętli for): " + sumFor);
        System.out.println("Średnia elementów tablicy (użycie pętli for): " + averageFor);
        System.out.println("Suma elementów tablicy (użycie pętli for each): " + sumForEach);
        System.out.println("Średnia elementów tablicy (użycie pętli for each): " + averageForEach);
    }
    public static void zadanie2(){
            int[] evenLengthArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //parzysta

            // Wypisanie co drugiego elementu z tablicy o parzystej liczbie elementów
            System.out.println("Co drugi element z tablicy o parzystej liczbie elementów:");
            for (int i = 0; i < evenLengthArray.length; i += 2) {
                System.out.println(evenLengthArray[i]);
            }

            int[] oddLengthArray = {11, 12, 13, 14, 15, 16, 17, 18, 19}; //nieparzysta

            // Wypisanie co drugiego elementu z tablicy o nieparzystej liczbie elementów
            System.out.println("\nCo drugi element z tablicy o nieparzystej liczbie elementów:");
            for (int i = 0; i < oddLengthArray.length; i += 2) {
                System.out.println(oddLengthArray[i]);
            }
    }
    public static void zadanie3(){
        String[] stringArray = {"kot", "pies", "ryba", "ptak"};
        System.out.println("Tablica przed zmianą:");
        for (String value : stringArray) {
            System.out.println(value);
        }
        System.out.println("Tablica po zmianie na wielkie litery:");
        for (String value : stringArray) {
            System.out.println(value.toUpperCase());
        }
    }
    public static void zadanie4(){
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];

        System.out.println("Podaj pięć słów:");
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.next();
        }

        // Wypisywanie słów od ostatniego do pierwszego, z literami od końca do początku
        System.out.println("Słowa od ostatniego do pierwszego, z literami od końca do początku:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(reverseString(words[i]));
        }
    }

    // Metoda do odwracania kolejności liter w słowie
    public static String reverseString(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void zadanie5(){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[8];

        System.out.println("Podaj osiem liczb:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Posortowane liczby:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void zadanie6(){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println(" ");
        System.out.println("Podaj 5 liczb (większe od 2)");
        for (int i = 0; i < 5; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Silnie dla podanych liczb:");
        for (int number : numbers) {
            long factorial = calculateFactorial(number);
            System.out.println("Silnia z " + number + " = " + factorial);
        }
    }
    public static long calculateFactorial(int n){
        long factorial = 1;
        for(int i = 2; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void zadanie7(){
        String[] array1 = {"kot", "pies", "ryba", "ptak"};
        String[] array2 = {"kot", "pies", "ryba", "ptak"};

        // Porównanie obu tablic
        boolean areEqual = Arrays.equals(array1, array2);

        // Wyświetlenie wyniku porównania
        if (areEqual) {
            System.out.println("Obie tablice są takie same.");
        } else {
            System.out.println("Obie tablice nie są takie same.");
        }
    }
}//koniec klasy