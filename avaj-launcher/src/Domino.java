public class Domino
{
    private int val1;
    private int val2;

    public Domino(int startVal1, int startVal2)
    {
        val1 = startVal1;
        val2 = startVal2;
    }

    public boolean isDouble()
    {
        if (val1 == val2)
            return true;
        else
            return false;
    }

    public int getVal1() { return val1; }

    public int getVal2()
    {
        return val2;
    }
}
