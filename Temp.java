package CCE102L2989;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercise Tracker Report\n");
		
		System.out.print("Enter the number of days to record: ");
		int num = sc.nextInt();
		
		int steps[] = new int[num];
		
		for(int i = 0;i<num;i++) {
			System.out.printf("Enter steps for Day %d: ",(i+1));
			steps[i] = sc.nextInt();
			sc.nextLine();
		}
		
		String[] summary = new String[num];
		for(int i = 0;i<num;i++) {
			if(steps[i]>=10000) {
				summary[i] = "Very Active";
			}else if(steps[i]>=5000) {
				summary[i] = "Active";
			}else if(steps[i]>=0) {
				summary[i] = "Sedentary";
			}
		}
		
		int highest = 0;
		for(int i = 0;i<num;i++) {
			if(steps[i]>highest) {
			highest = steps[i];	
			}
		}
		int lowest = steps[0];
		for(int i = 0;i<num;i++) {
			if(steps[i]<lowest) {
			lowest = steps[i];	
			}
		}
		
		double average = 0;
		double sum = 0;
		for(int i = 0;i<num;i++) {
			sum +=steps[i];	
		}
		average = sum/num;
		
		
		System.out.println("Daily Exercise Summary: \n");
		for(int i = 0;i<num;i++) {
			System.out.printf("Day %d: %d steps -> %s%n",(i+1),steps[i],summary[i]);
		}
		
		System.out.println("Statistical results:\n");
		System.out.printf("Highest Steps: %d%n",highest);
		System.out.printf("Lowest Steps: %d%n",lowest);
		System.out.printf("Average Steps: %.1f%n",average);
		System.out.println("\nEnd of Report");
		sc.close();
	}

}
