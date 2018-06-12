import java.util.ArrayList;

public class Player
{
    public ArrayList<Domino> hand_list = new ArrayList<>();
    public String name;
    public boolean wait = true;
    private Plateau plateau;

    public Player(Pioche pioche, String name_var)
    {
        name = name_var;
        for (int i = 0; i < 7; i++)
            draw(pioche);
    }

    public void setPlateau(Plateau plateau_var)
    {
        plateau = plateau_var;
    }

    public boolean draw(Pioche pioche)
    {
        // add a domino from the pioche to the hand
        System.out.println(name + " is picking a domino");
        int pick = (int)(Math.random() * pioche.pioche_list.size());
        System.out.println("number " + (int)(Math.random() * pioche.pioche_list.size()));
        Domino dom = pioche.pioche_list.get(pick);
        hand_list.add(dom);
        System.out.println(dom.getVal1() + " : " + dom.getVal2());
        pioche.remove(pick);
        return (dom.isDouble());
    }

    public void dom_click(Domino dom)
    {
        //check_domino(dom, plateau);
    }

    public void play(Pioche pioche)
    {
        wait = true;
        while (wait)
        {

        }
    }

    public void show_hand()
    {
        System.out.println("player name : " + name);
        System.out.println("hand : ");
        for (Domino dom : hand_list)
            System.out.println(dom.getVal1() + " : " + dom.getVal2());
    }
}
