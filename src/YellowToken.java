
public class YellowToken extends Token{


	public void move(){
		if(this.stateChanged==true){
			if(this.curDir == UP  || this.curDir==DOWN){
				if(this.lastDir== UP){
					this.nextDir=NONE;
				}else if(this.lastDir==RIGHT){
					this.nextDir = LEFT;
				}else if(this.lastDir == DOWN){
					this.nextDir = NONE;
				}else if(this.lastDir == LEFT){
					this.nextDir= RIGHT;
				}	
			}else if(this.curDir== RIGHT || this.curDir==LEFT){
				if(this.lastDir== UP){
					this.nextDir=DOWN;
				}else if(this.lastDir==RIGHT){
					this.nextDir = NONE;
				}else if(this.lastDir == DOWN){
					this.nextDir = UP;
				}else if(this.lastDir == LEFT){
					this.nextDir= NONE;
				}	
			
			}
		}
	}
}
