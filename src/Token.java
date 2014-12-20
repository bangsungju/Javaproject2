
public class Token {
	public static final int UP = 0;
	public static final int RIGHT = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int NONE = 4;
	
	int posx;
	int posy;
	boolean canMove=false;
	boolean canRotate=false;
	boolean isPassed=false;
	boolean stateChanged=false;
	boolean isBlocked =true;
	boolean isTarget = false;
	int curDir; //���� ��ū�� �Ĵٺ��� ��
	int lastDir; //��ū���� ���ߴ� �������ǹ���
	int nextDir; //��ū�� ��������

	
	public void move(){
		if(this.stateChanged==true){
			if(this.nextDir == UP){
				// 5���� ��ū�� lastDir �� DOWN
			
			}else if(this.nextDir == RIGHT){
				//5�� �� ��ū�� lastDir �� left
			}else if(this.nextDir == DOWN){
				
			}else if(this.nextDir == LEFT){
				
			}
		}	
	}
	public void rotate(){
		if(this.canRotate == true){
			curDir = (curDir+1)%4;
		}
	}
}
