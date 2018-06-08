public class Main
{
    static Pioche pioche;
    public static void main(String[] args)
    {
        pioche = new Pioche();
    //    draw(pioche, player);
        Player player1 = new Player(pioche);
        int i = 5;
        System.out.println(pioche.size);

        //test(i);
        //System.out.println(i);
    }

    /*draw()
    {
        pioche.remove();
    }*/
    public static void test(int nb)
    {
        nb += 2;
    }
}
