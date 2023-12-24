public class Office implements Floor {
    private int computer;


    public Office(int Computer)
    {
        setComputer(Computer);
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    @Override
    public double getPrice() {
        return computer*10000;
    }

    @Override
    public void Print() {
        System.out.println("Price of office is: " + getPrice());
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
