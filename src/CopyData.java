import java.io.*;

public class CopyData {

    public static void main(String args[])throws IOException 
   { 
         FileInputStream Fread =new FileInputStream("F:\\Java-Wp\\f1.txt");
         FileOutputStream Fwrite=new FileOutputStream("F:\\Java-Wp\\f2.txt") ; 
         System.out.println("File is Copied"); 
         int c; 
         while((c=Fread.read())!=-1) 
         Fwrite.write((char)c); 
         Fread.close(); 
         Fwrite.close(); 
    } 
}
