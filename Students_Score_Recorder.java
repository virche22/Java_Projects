package CCE102L2989;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class Students_Score_Recorder {
	public static String inputscores(Scanner sc,int score) {
	int scores[] = new int[score];
	
	for(int i = 0;i<score;i++) {
		System.out.printf("Student %d: ",(i+1));
		scores[i] = sc.nextInt();
	}
	String str = Integer.toString(scores);
	return str;
}
	public static void saveToFile(File file,String s) {
		try {
			FileWriter writer = new FileWriter(file,true);
			writer.write(s);
			writer.close();
		} catch (Exception e) {
			
			System.out.println("Something went wrong!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("scores.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("File created");
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong!");
			
		}
		System.out.print("How many students? ");
		int score = sc.nextInt();
		
		String students[] = new String[score];
		for(int i = 0;i<score;i++) {
			System.out.print("Student "+(i+1)+": ");
			students[i] = sc.nextLine();
			
		}
		
		

	}

}
