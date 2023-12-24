public class Muhoboika extends Plant implements PrintInterface{
    private static final int maxSizeFlowerRep = 140;
    private static final int maxSizeLeafDry = 70;

    public Muhoboika(){
        super();
    }
    public Muhoboika(int sizeLeaf, int sizeFlower, int sizeStem) {
        super(sizeLeaf, sizeFlower, sizeStem);
    }

    public void Grow(int waterpower, int sunpower){
        stem.GetWaterPower(waterpower);
        leaf.GetSunPower(sunpower);

        flower.GetWaterSunPower(stem.GetWaterPower(waterpower), leaf.GetSunPower(sunpower));
        System.out.println("Muhoboika size is " + (flower.getSize() + leaf.getSize() + stem.getSize()));
        fout.println("Muhoboika size is " + (flower.getSize() + leaf.getSize() + stem.getSize()));
        fout.flush();
    }
    public void IfFlowerCanReproduce(){
        if(flower.IfCanReproduce(maxSizeFlowerRep)) {
            System.out.println("Muhoboika can reproduce");
            fout.println("Muhoboika can reproduce");
        }
        else {
            System.out.println("Muhoboika can`t reproduce");
            fout.println("Muhoboika can't reproduce");
        }
        fout.flush();

    }

    public void IfLeafCanDry() {
        if (leaf.IfCanDry(maxSizeLeafDry)) {
            System.out.println("Muhoboika can dry");
            Plant.fout.println("Muhoboika can dry");
        } else {
            System.out.println("Muhoboika can`t dry");
            fout.println("Muhoboika can't dry");
        }
        fout.flush();

    }
    @Override
    public void Print(){
        System.out.println("This is Muhoboika");
        Plant.fout.println("This is Muhoboika");
        leaf.Print();
        flower.Print();
        stem.Print();
    }
}
