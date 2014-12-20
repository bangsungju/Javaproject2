
public class RedToken extends Token {
	boolean isClicked = false;

	public void move(){
		if(this.stateChanged==true){
			curDir=nextDir;
		}
	}
}
