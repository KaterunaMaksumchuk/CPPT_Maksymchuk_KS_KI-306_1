import java.util.Scanner;
import java.io.*;

/**
 * Клас Lab1MaksymchukKateryna реалізує приклад програми до лабораторної роботи №1
 *
 * @author Maksymchuk Kateryna
 * @version 1.0
 * @since version 1.0
 *
 */



public class Lab1MaksymchukKateryna {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int matrixSize = 0, matrixSize2;

        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці(мінімум 2): ");
        matrixSize = in.nextInt();
        in.nextLine();
        System.out.print("Введіть символ-заповнювач: ");
        filler = in.nextLine();

        matrixSize2 = matrixSize;


        if (matrixSize < 2) {
            System.out.println("Введений розмір матриці некоректний\n");
        }
        else {
            arr = new char[matrixSize][];

            for (int i = 0; i < matrixSize; i++)
            {

                for (int j = 0; j < matrixSize2; j++) {
                    arr[i] = new char[matrixSize2];
                }
                matrixSize2--;
                if(matrixSize2 == 0) break;
            }
            exit:
            if (filler.length() == 1)
            {
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = (char) filler.codePointAt(0);
                    }
                }
                for (int i = 0; i < matrixSize; i++)
                {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + " ");
                        fout.print(arr[i][j] + " ");
                    }
                    System.out.println();
                    fout.println();
                }
            }
            else if (filler.isEmpty()) {
                System.out.print("\nНе введено символ заповнювач");
                break exit;
            } else {
                System.out.print("\nЗабагато символів заповнювачів");
                break exit;
            }

        }
        fout.flush();
        fout.close();
    }
}