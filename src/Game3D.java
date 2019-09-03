import java.io.Serializable;

public class Game3D implements Serializable {
	private static final long serialVersionUID = 1L;
	private int xPos;
	private  int yPos;
	private int zPos;

	public void moveH(int pts){
	xPos=xPos+pts;
	}
	public void moveV(int pts){
	yPos=yPos+pts;
	}
	public void move(int pts){
	zPos=zPos+pts;
	}
	public void showPos(){
	System.out.println("CURRENT POS : "+xPos+","+yPos+","+zPos);
	}
}
