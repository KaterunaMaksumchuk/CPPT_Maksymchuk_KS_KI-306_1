import java.io.FileNotFoundException;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        WriteReadCalcRes fWriteReader = new WriteReadCalcRes();
        int angle = 50;
        Equation equation = new Equation();
        fWriteReader.setNumber(9);
        System.out.println(fWriteReader.getNumber());
        try {
            double result = equation.Calculate(angle);
            System.out.println("Result: " + result);
            fWriteReader.setNumber(result);
            fWriteReader.WriteToFileTxt("resTxt.txt");
            fWriteReader.WriteToFileBin("resBin.bin");
        } catch (CalcException e) {
            System.err.println("Calculation Error: " + e.getMessage());
        }

        System.out.println("Write result and read from txt file");
            fWriteReader.ReadFromFileTxt("resTxt.txt");
            System.out.println("Result of reading txt file is : " + fWriteReader.getNumber());

            fWriteReader.ReadFromFileBin("resBin.bin");
        System.out.println("Result of reading bin file is : " + fWriteReader.getNumber());

        fWriteReader.WriteRandomNumber("Number1.txt");
    }
    }
