import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndDelete {
	static String path="F:\\Java-Wp";	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter file name to read and delete");
		Scanner sc=new Scanner(System.in);
		String file1=(path+"\\"+sc.nextLine()).trim();
		System.out.println(file1);
		File f1=new File(file1);
		BufferedReader bt = new BufferedReader(new FileReader(f1));
		String st;
		while((st=bt.readLine())!=null){
		System.out.println(st);
		System.out.println("Line--- ");
		       
		}
		bt.close();
		if(f1.delete())
	System.out.println("file deleted");
		else System.out.println("File not deleted");
		}
	
}
