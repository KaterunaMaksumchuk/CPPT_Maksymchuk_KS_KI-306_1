public class Romashka extends Plant implements PrintInterface{
    private static final int maxSizeFlowerRep = 100;
    private static final int maxSizeLeafDry = 10;

    public Romashka(){
        super();
    }
    public Romashka(int sizeLeaf, int sizeFlower, int sizeStem) {
        super(sizeLeaf, sizeFlower, sizeStem);
    }

    public void Grow(int waterpower, int sunpower){
        stem.GetWaterPower(waterpower);
        leaf.GetSunPower(sunpower);

        flower.GetWaterSunPower(stem.GetWaterPower(waterpower), leaf.GetSunPower(sunpower));
        System.out.println("Romashka size is " + (flower.getSize() + leaf.getSize() + stem.getSize()));
        fout.println("Romashka size is " + (flower.getSize() + leaf.getSize() + stem.getSize()));
        fout.flush();
    }
    public void IfFlowerCanReproduce(){
        if(flower.IfCanReproduce(maxSizeFlowerRep)) {
            System.out.println("Romashka can reproduce");
            fout.println("Romashka can reproduce");
        }
        else {
            System.out.println("Romashka can`t reproduce");
            fout.println("Romashka can't reproduce");
        }
        fout.flush();

    }

    public void IfLeafCanDry() {
        if (leaf.IfCanDry(maxSizeLeafDry)) {
            System.out.println("Romashka can dry");
            Plant.fout.println("Romashka can dry");
        } else {
            System.out.println("Romashka can`t dry");
            fout.println("Romashka can't dry");
        }
        fout.flush();

    }
    @Override
    public void Print(){
        System.out.println("This is Romashka");
        Plant.fout.println("This is Romashka");
        leaf.Print();
        flower.Print();
        stem.Print();
    }
}
