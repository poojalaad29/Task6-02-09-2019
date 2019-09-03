import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConcateCity {

	public static void main(String[] args) throws IOException {
		File City=new File("F:/Java-Wp/City.txt");
		FileWriter fr = new FileWriter(City, true);
		BufferedWriter br = new BufferedWriter(fr);
		System.out.println("Your file name will be City.txt");
		System.out.println("Enter number of cities you want to add in file");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.println("Enter "+count+" Cities");
		for(int i=0;i<=count;i++)
		{
		   String s1=sc.nextLine();
	        br.write(s1);
        }
		br.close();
		fr.close();
		System.out.println("City Added");
        sc.close();
	}

}
