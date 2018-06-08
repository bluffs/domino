import java.util.HashSet;
import java.util.Iterator;

public class Pioche
{
    public int size;
    public HashSet<Domino> pioche_hs = new HashSet<Domino>();


    public Pioche()
    {
        for (int i  = 0; i < 7; ++i)
        {
            for (int j = i; j < 7; ++j)
            {
                System.out.println("i = " + i + " , j = " + j);
                Domino dom = new Domino(i, j);
                pioche_hs.add(dom);
            }
        }
        size = 5;
        print_pioche();
    }

    public void print_pioche()
    {
        int i = 0;
        /*Object[] obj = pioche_hs.toArray();
        for (Object o : obj)
        {
            System.out.println(i++);
            //System.out.println(o.getClass());
        }*/
        Iterator<Domino> it = pioche_hs.iterator();
        while(it.hasNext())
        {
            System.out.println(i++);
            Domino dom = it.next();
            System.out.println(dom.getVal1() + " : " + dom.getVal2());
        }
    }

    public void remove_pioche() {
        size = size - 2;
        System.out.println("Hello" + size);
    }
}
