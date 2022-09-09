import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem02SortDescWt {
    public static void main(String[] args) {
        int array[] = {49, 36, 8, 10, 12};
        HashMap<Integer, Integer> numWithWt = new HashMap<Integer, Integer>();
        Integer weightage[] = new Integer[5];
        int weight;

        for (int i = 0; i < array.length; i++) {
            weight = 0;
            int sqrtNum = (int)Math.sqrt(array[i]);
            if (sqrtNum*sqrtNum == array[i])
                weight += 5;
            if (array[i] % 4 == 0 && array[i] % 6 == 0)
                weight += 4;
            if (array[i] % 2 == 0)
                weight += 3;
            
            numWithWt.put(array[i], weight);
            weightage[i] = weight; 
        }
        Arrays.sort(weightage, Collections.reverseOrder());
        for (int i = 0; i <weightage.length; i++) {
            for(Map.Entry<Integer, Integer> weightEntry: numWithWt.entrySet()){
                if(weightEntry.getValue() == weightage[i])
                    System.out.printf("<%d, %d>", weightEntry.getKey(), weightage[i]);
                numWithWt.replace(weightEntry.getKey(), weightage[i], -1);
            }
        }
    }
}
