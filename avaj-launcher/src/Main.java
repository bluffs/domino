import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Plateau plateau = new Plateau();
        Pioche pioche = new Pioche();
        List<Player> player_list = new LinkedList<Player>();
        int starter;
        Player player1 = new Player(pioche, "Jalel");
        player_list.add(player1);
        Player player2 = new Player(pioche, "Zak");
        player_list.add(player2);
        System.out.println("Size = " + pioche.size);
        for (Player player : player_list)
            player.show_hand();
        starter = find_first(player_list);
        if (starter == -1)
        {
            System.out.println("Players don't have any doubles");
            //player draw dominos untill double
        }
        else
        {
            System.out.println("Player num " + starter + " starts");
        }
    }

    public static int find_first(List<Player> player_list)
    {
        for (int i = 6; i >= 0; i--)
        {
            int nb = 0;
            for (Player player : player_list)
            {
                for (Domino dom : player.hand_list)
                {
                    if (dom.getVal1() == i && dom.getVal2() == i)
                    {
                        return nb;
                    }
                }
                ++nb;
            }
        }
        return (-1);
    }
}
