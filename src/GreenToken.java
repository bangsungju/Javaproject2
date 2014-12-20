
public class GreenToken extends Token {
	int nextdirSec ;
	

	public void move(){
		if(this.stateChanged==true){
			if(this.curDir == UP ){
				if(this.lastDir == UP){
					this.nextDir = DOWN;
					this.nextdirSec = RIGHT;
				}else if(this.lastDir == RIGHT){
					this.nextDir = LEFT;
					this.nextdirSec = UP;
				}else if(this.lastDir == DOWN){
					this.nextDir = UP;
					this.nextdirSec = LEFT;
				}else if(this.lastDir == LEFT){
					this.nextDir = RIGHT;
					this.nextdirSec = DOWN;
				}
			}else if(this.curDir == RIGHT ){
				if(this.lastDir == UP){
					this.nextDir = DOWN;
					this.nextdirSec = LEFT;
				}else if(this.lastDir == RIGHT){
					this.nextDir = LEFT;
					this.nextdirSec = DOWN;
				}else if(this.lastDir == DOWN){
					this.nextDir = UP;
					this.nextdirSec = RIGHT;
				}else if(this.lastDir== LEFT){
					this.nextDir= RIGHT;
					this.nextdirSec = UP;
				}
				
			}else if(this.curDir == DOWN){
				if(this.lastDir== UP){
					this.nextDir = DOWN;
					this.nextdirSec = RIGHT;
				}else if(this.lastDir == RIGHT){
					this.nextDir = LEFT;
					this.nextdirSec = UP;
				}else if(this.lastDir== DOWN){
					this.nextDir = UP;
					this.nextdirSec = LEFT;
				}else if(this.lastDir== LEFT){
					this.nextDir = RIGHT;
					this.nextdirSec = DOWN;
				}
			}else if(this.curDir== LEFT){
					if(this.lastDir== UP){
						this.nextDir = DOWN;
						this.nextdirSec = LEFT;
					}else if(this.lastDir == RIGHT){
						this.nextDir = LEFT;
						this.nextdirSec = DOWN;
					}else if(this.lastDir== DOWN){
						this.nextDir = UP;
						this.nextdirSec = RIGHT;
					}else if(this.lastDir== LEFT){
						this.nextDir = RIGHT;
						this.nextdirSec = UP;
					}
			}
			
		}	
	}
}
