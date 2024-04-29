import java.util.*;
public class Teller{
    public static void main(String[] args) {
        String[] customers = {
            "Jennifer Figueroa",
            "Heather Mcgee",
            "Amanda Schwartz",
            "Nicole Yoder",
            "Melissa Hoffman",
            "Beatrice Helman",
            "Louis Sanders",
            "Catherine Altman",
            "Ralph Estees",
            "Samantha Augustine",
            "Peter Fredricks",
            "David Alters"
        };
        
        // 1. Keep track of how much money is in each teller's drawer. They start the day with $2,500. 
        // And there are two tellers always on the floor.

        // 2.Keep track of which person was seen at Teller window number 1 or Teller window number 2
        List<String> teller1Seen = new ArrayList<>();
        List<Integer> teller1Trans = new ArrayList<>();
        List<String> teller2Seen = new ArrayList<>();
        List<Integer> teller2Trans = new ArrayList<>();
        
        int teller1Balance = 2500;
        int teller2Balance = 2500;
        for (int i = 0; i < customers.length; i++) {
            //Teller 1 see all odd, since they work at equal pace
        	if (i % 2 == 0) {
            	teller1Seen.add(customers[i]);
            	//3.  Every third person in line is going to make a withdrawal of $250.
                if (i%3==0) {
                    teller1Balance -= 250;
                	teller1Trans.add(-250);
                }
                //4.  Every fifth person in line is going to make a deposit of $475.
                else if (i%5==0) {
                    teller1Balance += 475;
                	teller1Trans.add(475);
                }
                //5.  All others in line are depositing $100 each.
                else {
                    teller1Balance += 100;
                	teller1Trans.add(100);
                }
            }
        	//Teller 2 see all even
        	else {
        		teller2Seen.add(customers[i]);
                if (i%3==0) {
                    teller2Balance -= 250;
                	teller2Trans.add(-250);
                } else if (i%5==0) {
                    teller2Balance += 475;
                	teller2Trans.add(475);
                } else {
                    teller2Balance += 100;
                	teller2Trans.add(100);
                }
            }
        }
        System.out.println("Teller 1 customers: " + teller1Seen);
        System.out.println("Teller 1 final balance: " + teller1Balance);
        System.out.println("Teller 2 customers: " + teller2Seen);
        System.out.println("Teller 2 final balance: " + teller2Balance);

        System.out.println("Bonus");
        for (int i=0;i<teller1Seen.size();i++) {
            if(teller1Trans.get(i)>0)
                System.out.println("Teller1: "+teller1Seen.get(i)+" deposit "+teller1Trans.get(i));
            else
                System.out.println("Teller1: "+teller1Seen.get(i)+" withdraw "+teller1Trans.get(i)*-1);	
        }
        for (int i=0;i<teller2Seen.size();i++) {
            if(teller2Trans.get(i)>0)
                System.out.println("Teller2: "+teller2Seen.get(i)+" deposit "+teller2Trans.get(i));
            else
                System.out.println("Teller2: "+teller2Seen.get(i)+" withdraw "+teller2Trans.get(i)*-1);
        }
        
    }
}

