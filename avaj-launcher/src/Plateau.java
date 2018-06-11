import java.util.ArrayList;

public class Plateau
{
    public Plateau()
    {
        ArrayList<ArrayList<Integer>> available_list = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> available_0 = new ArrayList<Integer>();
        //available_0.add(0);
        available_list.add(available_0);

        ArrayList<Integer> available_1 = new ArrayList<Integer>();
        //available_1.add(100);
        available_list.add(available_1);

        ArrayList<Integer> available_2 = new ArrayList<Integer>();
        //available_2.add(200);
        available_list.add(available_2);

        ArrayList<Integer> available_3 = new ArrayList<Integer>();
        //available_3.add(300);
        available_list.add(available_3);

        ArrayList<Integer> available_4 = new ArrayList<Integer>();
        //available_4.add(400);
        available_list.add(available_4);

        ArrayList<Integer> available_5 = new ArrayList<Integer>();
        //available_5.add(500);
        available_list.add(available_5);

        ArrayList<Integer> available_6 = new ArrayList<Integer>();
        //available_6.add(600);
        available_list.add(available_6);

        System.out.println(available_list);
    }

}
