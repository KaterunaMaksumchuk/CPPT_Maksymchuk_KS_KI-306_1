import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
public class Plant implements AutoCloseable{
    private int age;
    private Leaf leaf;
    private Flower flower;
    private Stem stem;
    public static PrintWriter fout;


    /**
     *
     */
    public Plant()
    {
        leaf = new Leaf();
        flower = new Flower();
        stem = new Stem();
        try {
            fout = new PrintWriter(new File("PlantTxt.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param sizeLeaf
     * @param sizeFlower
     * @param sizeStem
     */
    public Plant(int sizeLeaf, int sizeFlower, int sizeStem){
        try {
            fout = new PrintWriter(new File("PlantTxt.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        leaf = new Leaf(sizeLeaf);
        flower = new Flower(sizeFlower);
        stem = new Stem(sizeStem);
    }

    /**
     * @return
     */

    public Flower getFlower() {
        return flower;
    }

    /**
     * @param flower
     */
    public void setFlower(Flower flower) {
        this.flower = flower;
    }

    /**
     * @return
     */
    public Stem getStem() {
        return stem;
    }

    /**
     * @param stem
     */
    public void setStem(Stem stem) {
        this.stem = stem;
    }

    /**
     * @return
     */
    public Leaf getLeaf() {
        return leaf;
    }

    /**
     * @param leaf
     */
    public void setLeaf(Leaf leaf) {
        this.leaf = leaf;
    }

    /**
     *
     */
    public void Print(){
        leaf.Print();
        flower.Print();
        stem.Print();
    }

    /**
     * @param waterpower
     * @param sunpower
     */
    public void Grow(int waterpower, int sunpower){
        //stem.GetWaterPower(waterpower);
        //leaf.GetSunPower(sunpower);
        //
        flower.GetWaterSunPower(stem.GetWaterPower(waterpower), leaf.GetSunPower(sunpower));
        System.out.println("Plant size is " + (flower.getSize() + leaf.getSize() + stem.getSize()));
        fout.println("Plant size is " + (flower.getSize() + leaf.getSize() + stem.getSize()));
        fout.flush();


    }

    /**
     *
     */
    public void IfFlowerCanReproduce(){
        if(flower.IfCanReproduce()) {
            System.out.println("Flower can reproduce");
            fout.println("Flower can reproduce");
        }
        else {
            System.out.println("Flower can`t reproduce");
            fout.println("Flower can't reproduce");
        }
        fout.flush();

    }

    /**
     *
     */
    public void IfLeafCanDry(){
        if(leaf.IfCanDry()) {
            System.out.println("Leaf can dry");
            Plant.fout.println("Leaf can dry");
        }
        else {
            System.out.println("Leaf can`t dry");
            fout.println("Leaf can't dry");
        }
        fout.flush();

    }
    /**
     * Method closes the file
     * @throws Exception
     */
    @Override
    public void close() throws Exception {
        if (fout != null) {
            fout.flush();
            fout.close();
        }
    }
}
