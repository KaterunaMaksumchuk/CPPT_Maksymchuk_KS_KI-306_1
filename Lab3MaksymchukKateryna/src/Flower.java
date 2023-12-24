import java.io.FileNotFoundException;

/**
 * Class <code>Flower</code> implements flower
 * @author Kateryna Maksymchuk
 * @version 1.0
 */
public class Flower {
        private int size;

    /**
     * @param size
     */
        public void setSize(int size) {
            this.size = size;
    }

    /**
     * @return size
     */
        public int getSize() {
        return size;
    }

    /**
     * Constructor
     * @param size size of flower
     */
    public Flower(int size)
        {
            this.size = size;
        }
    /**
     * Constructor
     */
    public Flower(){
        this.size = 1;
    }

    /**
     * Method prints info about flower
     */
        public void Print()
        {
            System.out.println("My flower is " + size);
            Plant.fout.println("My flower is " + size);
            Plant.fout.flush();

        }
    /**
     * Method makes flower grow using waterpower and sunpower
     * @param waterpower amount of waterpower
     * @param sunpower amount of sunpower
     * @return Flower's size
     */
        public int GetWaterSunPower(int waterpower, int sunpower) {
            setSize((waterpower + sunpower) * size);
            Plant.fout.println("Flower grows to " + getSize());
        System.out.println("Flower grows to " + getSize());
            Plant.fout.flush();

            return getSize();
    }
    /**
     * Method that say if flower enough size to reproduce
     * @return true or false
     */
    public boolean IfCanReproduce(int maxSize){
            if(size >= maxSize)
                return true;
        return false;
    }

}
