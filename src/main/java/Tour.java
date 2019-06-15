import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Tour {
//TODO think about simplifier code
    static int tour(String[] arrFriends, String[][] friendsTowns, Map<String, Double> townsDistanceFromGrandma) {
        double sumOfDistances = 0;
        String nextFriendToVisti="";
        ArrayList<Double> listOfDistances = new ArrayList<Double>();

        for (String s : arrFriends) {
            for (String[] element : friendsTowns
            ) {
                if (element[0].equals(s)) {
                    nextFriendToVisti = element[1];
                }
            }
            listOfDistances.add(townsDistanceFromGrandma.get(nextFriendToVisti));
        }

        for (int i = 0; i < listOfDistances.size()-1; i++) {
            sumOfDistances+= Math.sqrt(Math.pow(listOfDistances.get(i+1),2) - Math.pow(listOfDistances.get(i),2));
        }
        Math.round(sumOfDistances);
        sumOfDistances+=listOfDistances.get(0)+listOfDistances.get(listOfDistances.size()-1);
        return (int)sumOfDistances;
    }
}