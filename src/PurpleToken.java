
public class PurpleToken extends Token{
	

	public void move(){
		if(this.stateChanged==true){
			if(this.curDir== UP){
				if(this.lastDir== UP){
					this.nextDir=NONE;
				}else if(this.lastDir==RIGHT){
					this.nextDir = NONE;
				}else if(this.lastDir == DOWN){
					this.nextDir = LEFT;
				}else if(this.lastDir == LEFT){
					this.nextDir= DOWN;
				}	
			}else if(this.curDir== RIGHT){
				if(this.lastDir== UP){
					this.nextDir=LEFT;
				}else if(this.lastDir==RIGHT){
					this.nextDir = NONE;
				}else if(this.lastDir == DOWN){
					this.nextDir = NONE;
				}else if(this.lastDir == LEFT){
					this.nextDir= UP;
				}	
			}else if(this.curDir == DOWN){
				if(this.lastDir== UP){
					this.nextDir=RIGHT;
				}else if(this.lastDir==RIGHT){
					this.nextDir = UP;
				}else if(this.lastDir == DOWN){
					this.nextDir = NONE;
				}else if(this.lastDir == LEFT){
					this.nextDir= NONE;
				}	
			}else if(this.curDir== LEFT){
				if(this.lastDir== UP){
					this.nextDir=NONE;
				}else if(this.lastDir==RIGHT){
					this.nextDir = DOWN;
				}else if(this.lastDir == DOWN){
					this.nextDir = RIGHT;
				}else if(this.lastDir == LEFT){
					this.nextDir= NONE;
				}	
			}
			
		}
	}
}
