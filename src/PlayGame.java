import java.io.*;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 For New Game, 2 For Resuming Previous One : ");
		int ch=sc.nextInt();
		System.out.println("Horizontal Move : ");
		int x=sc.nextInt();
		System.out.println("Vertical Move : ");
		int y=sc.nextInt();
		System.out.println("Diagonal Move : ");
		int z=sc.nextInt();
		Game3D g=null;

		if(ch==1){
		g=new Game3D();
		}else{
		FileInputStream fis=new FileInputStream("F:\\Java-Wp\\GameSave.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
		g=(Game3D)ois.readObject();

		}

		g.moveH(x); g.moveV(y);g.move(z);
		g.showPos();

		System.out.println("Saving Game Instance ..");
		FileOutputStream fos=new FileOutputStream("F:\\Java-Wp\\GameSave.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		oos.close(); fos.close();
		System.out.println("Closing Game ..");

}

}
