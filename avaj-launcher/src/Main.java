import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static Plateau plateau = new Plateau();
    public static void main(String[] args)
    {
        Pioche pioche = new Pioche();
        List<Player> player_list = new LinkedList<>();
        int starter;
        Player player1 = new Player(pioche, "Jalel");
        player_list.add(player1);
        Player player2 = new Player(pioche, "Zak");
        player_list.add(player2);
        for (Player player : player_list)
            player.show_hand();
        starter = find_first(player_list);
        if (starter == -1)
        {
            System.out.println("Players don't have any doubles");
            int turn = 0;
            while (starter == -1)
            {
                if (pick_double(player_list.get(turn), pioche))
                    starter = turn;
                ++turn;
                turn %= player_list.size();
            }
        }
        else
        {
            System.out.println("Player num " + starter + " starts");
        }
        playing(player_list, starter);
    }

    private static void playing(List<Player> player_list, int turn)
    {
        play_first(player_list.get(turn));
        turn = (++turn) % player_list.size();
        while (true)
        {
            //player_list.get(turn).play(plateau, pioche);
            turn = (++turn) % player_list.size();
        }
    }

    private static void play_first(Player player)
    {
        int max_double = 0;
        Domino max_dom = new Domino(0, 0);
        for(Domino dom : player.hand_list)
        {
            if (dom.isDouble())
            {
                if (max_double <= dom.getVal1())
                {
                    max_double = dom.getVal1();
                    max_dom = dom;
                }
            }
        }
        System.out.println(max_dom.getVal1() + " : " + max_dom.getVal2());
        //player.play_domino(max_dom);
    }

    private static boolean pick_double(Player player, Pioche pioche)
    {
        return (player.draw(pioche));
    }

    private static int find_first(List<Player> player_list)
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
