import java.io.*;

public class MergeFiles {

	public static void main(String[] args) throws IOException {
		  FileInputStream fistream1 = new FileInputStream("F:/Java-Wp/f1.txt"); 
		    FileInputStream fistream2 = new FileInputStream("F:/Java-Wp/f2.txt"); 
		 
		    SequenceInputStream sistream = new SequenceInputStream(fistream1, fistream2);  
		    FileOutputStream fostream = new FileOutputStream("F:/Java-Wp/Merge.txt");   
		 
		    int temp;
		    System.out.println("Now file content is:");
		    while( ( temp = sistream.read() ) != -1)
		    {
		      System.out.print( (char) temp );
		      fostream.write(temp);
		    }
		    fostream.close();
		    sistream.close();
		    fistream1.close();
		    fistream2.close();
		   }

	}

