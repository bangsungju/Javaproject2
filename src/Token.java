
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
	int curDir; //현재 토큰이 쳐다보는 방
	int lastDir; //토큰으로 비추는 레이저의방향
	int nextDir; //토큰의 다음방향

	
	public void move(){
		if(this.stateChanged==true){
			if(this.nextDir == UP){
				// 5를뺀 토큰의 lastDir 이 DOWN
			
			}else if(this.nextDir == RIGHT){
				//5를 뺀 토큰의 lastDir 이 left
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
