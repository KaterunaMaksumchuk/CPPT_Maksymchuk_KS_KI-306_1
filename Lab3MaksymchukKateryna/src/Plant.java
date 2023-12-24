import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
public abstract class Plant implements AutoCloseable {
    protected Leaf leaf;
    protected Flower flower;
    protected Stem stem;
    public static PrintWriter fout;


    /**
     *
     */
    public Plant() {
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
    public Plant(int sizeLeaf, int sizeFlower, int sizeStem) {
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
//    public void Print() {
//        leaf.Print();
//        flower.Print();
//        stem.Print();
//    }

    /**
     * @param waterpower
     * @param sunpower
     */
    public abstract void Grow(int waterpower, int sunpower);
    /**
     *
     */
    public abstract void IfFlowerCanReproduce();

    /**
     *
     */
    public abstract void IfLeafCanDry();

    /**
     * Method closes the file
     *
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
