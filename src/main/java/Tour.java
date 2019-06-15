import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Tour {
//Two test passed on codewars, Grandrma propably can go back to previous friend//TODO think about simplifier code and solve problem
    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        double sum = 0;
        String e1="";
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < ftwns.length; i++) {
            String s = arrFriends[i];
            for (String[] element : ftwns
            ) {
                if (element[0].equals(s)) {
                    e1 = element[1];
                }
            }

            list.add(h.get(e1));
        }

        for (int i = 0; i < list.size()-1; i++) {
            sum+= Math.sqrt(Math.pow(list.get(i+1),2) - Math.pow(list.get(i),2));
        }
        sum+=list.get(0)+list.get(list.size()-1);
        return (int) Math.round(sum);
    }
}