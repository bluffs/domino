import java.util.HashSet;

public class Player
{
    public HashSet<Domino> hand_hs = new HashSet<Domino>();

    public Player(Pioche pioche)
    {

        /*for (int i = 0; i < 7; i++)
        {
            draw(pioche);
        }*/
        pioche.remove_pioche();
    }

    public void draw(Pioche pioche)
    {
        // add a domino from the pioche
        System.out.println("picking a domino");
        //hand_hs.add();
    }
}
