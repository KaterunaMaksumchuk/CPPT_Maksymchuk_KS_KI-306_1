public class SportGym implements Floor {

    private int equipment;



    public SportGym(int Equipments)
    {
        setEquipment(Equipments);
    }

    public int getEquipment() {
        return equipment;
    }

    public void setEquipment(int equipment) {
        this.equipment = equipment;
    }

    @Override
    public double getPrice() {
        return equipment*1000;
    }

    @Override
    public void Print() {
        System.out.println("Price of spoooooortgym is: " + getPrice());


    }

    @Override
    public int compareTo(Floor o) {
        if(o.getPrice() > this.getPrice())
        {
            return -1;
        }
        else if(o.getPrice() < this.getPrice())
        {
            return 1;
        }
        return 0;
    }
}
