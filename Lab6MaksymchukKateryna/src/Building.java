import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Building <T extends Floor>{
    private List<T> floors = new ArrayList<>();


    public Building(){
    };
    public void AddFloor(T floor)
    {
        floors.add(floor);
        System.out.print("floor added: ");
        floor.Print();
    }
    public void DeleteFloor(int i)
    {
        floors.remove(i);
    }

    public T findMax()
    {
        if (!floors.isEmpty())
        {
            T max = floors.get(0);
            for (int i=1; i< floors.size(); i++)
            {
                if ( floors.get(i).compareTo(max) > 0 )
                    max = floors.get(i);
            }
            return max;
        }
        return null;
    }
    public T findMin()
    {
        if (!floors.isEmpty())
        {
            T min = floors.get(0);
            for (int i=1; i< floors.size(); i++)
            {
                if ( floors.get(i).compareTo(min) < 0 )
                    min = floors.get(i);
            }
            return min;
        }
        return null;
    }
}
