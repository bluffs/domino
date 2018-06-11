import java.util.ArrayList;

public class Player
{
    public ArrayList<Domino> hand_list = new ArrayList<Domino>();
    public String name;

    public Player(Pioche pioche, String name_var)
    {
        name = name_var;
        for (int i = 0; i < 7; i++)
        {
            draw(pioche);
        }
    }

    public void draw(Pioche pioche)
    {
        // add a domino from the pioche to the hand
        System.out.println(name + " is picking a domino");
        int pick = (int)(Math.random() * pioche.size);
        System.out.println("number " + (int)(Math.random() * pioche.size));
        hand_list.add(pioche.pioche_list.get(pick));
        System.out.println(pioche.pioche_list.get(pick).getVal1() + " : " + pioche.pioche_list.get(pick).getVal2());
        pioche.remove(pick);
    }

    public void show_hand()
    {
        System.out.println("player name : " + name);
        System.out.println("hand : ");
        for (Domino dom : hand_list)
        {
            System.out.println(dom.getVal1() + " : " + dom.getVal2());
        }
    }
}
