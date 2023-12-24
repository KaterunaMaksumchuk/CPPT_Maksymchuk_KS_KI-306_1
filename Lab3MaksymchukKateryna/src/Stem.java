import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
public class Stem {
    /**
     *
     */
    private int size;

    /**
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size
     */
    //constructors
    public Stem(int size)
    {
        this.size = size;
    }

    /**
     *
     */
    public Stem(){

        this.size = 2;
    }

    /**
     *
     */
    public void Print()
    {
        System.out.println("My stem is " + size);
        Plant.fout.println("My stem is " + size);
        Plant.fout.flush();

    }

    /**
     * @param waterpower
     * @return
     */
    public int GetWaterPower(int waterpower)  {
        setSize(getSize() + waterpower/2);
        System.out.println("Stem send " + (waterpower/2) + " energy to flower");
        Plant.fout.println("Stem send " + (waterpower/2) + " energy to flower");
        Plant.fout.flush();

        return waterpower/2;
    }
}
