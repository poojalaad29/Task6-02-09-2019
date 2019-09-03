import java.io.File;
import java.util.Scanner;

public class RenameFile {
	static String path="F:\\Java-Wp";	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the file you want to change the name");
	String file1=(path+"\\"+sc.nextLine()).trim();
	System.out.println(file1); 
	File f1=new File(file1);
	System.out.println("Enter the name of the second file");
	String file2=path+"\\"+sc.nextLine().trim();
	System.out.println(file2); 
	File f2=new File(file2);
	if(!f1.exists())
	System.out.println(" File 1 not exist");
	else
		{
		long size=f1.length();
	
	     if( f1.isFile())
	   System.out.println(f1 +" and "+""+f2+ " is a txt file");
	   else { System.out.println("one of them is not txt file");}
	
	if(size<500){
		boolean b=f1.renameTo(f2);
		if(b)
			System.out.println("Succssfully changed the name to " + f1);
	   else 
			System.out.println("File name not changed");
	    }
	   else{System.out.println("The file is too large to be renamed");}

		}

	}
}
