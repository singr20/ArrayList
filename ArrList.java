/*
 * Find Average of all ages of family members
 * @raunaq singh
 * @version 1.0
 */

import java.util.*;


public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int whichMember = 1; 
        boolean loop = true;
        while (loop) {
            System.out.println("Enter Family Member #" + whichMember + " Age: (If you are done, type 10)");
            int userInput = scan.nextInt();
            ages.add(userInput);
            whichMember = whichMember + 1;
            if (userInput < 0) {
                break;
            }
            if (userInput == 10){
                break;
            }
        }
        int sum = ages.get(0);
        for (int i = 0; i < ages.size(); i++) {
            sum += ages.get(i);
        }
        double avg = (double)sum / (double)ages.size();
        System.out.println("Avg: " + avg);
    }
}