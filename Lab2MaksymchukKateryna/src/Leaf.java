import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class <code>Leaf</code> implements leaf of plant
 * @author Kateryna Maksymchuk
 * @version 1.0
 */
public class Leaf {
    private int size;

    /**
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
        Print();
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
    public Leaf(int size)
    {
        this.size = size;
    }

    /**
     *
     */
    public Leaf(){
        this.size = 1;
    }

    /**
     *
     */
    public void Print()
    {
        System.out.println("My leaf is " + size);
        Plant.fout.println("My leaf is " + size);
        Plant.fout.flush();

    }

    /**
     * @param sunpower
     * @return
     */
    public int GetSunPower(int sunpower) {
        setSize(getSize() + sunpower/2);
         System.out.println("Leaf send " + (sunpower/2) + " energy to flower");
         Plant.fout.println("Leaf send " + (sunpower/2) + " energy to flower");
        Plant.fout.flush();

        return sunpower/2;
    }

    /**
     * @return
     */
    public boolean IfCanDry(){
        if(size > 150)
            return true;
        return false;
    }

}
