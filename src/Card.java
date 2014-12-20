
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Card {
	private String filename;
	public int cardNum;
	ArrayList<Token> tokens = new ArrayList<Token>();
	public Card(String filename) {
		
		BufferedReader br = null; 
		String line = null;
		try {
				br = new BufferedReader(new FileReader(filename));
				while ((line = br.readLine()) != null) { 
					if (line.length() < 1)
						continue;
				String[] arr = line.split(" ");
				
				if(arr[0].equals("cardNum")){
					cardNum = Integer.parseInt(arr[2]);
				}
				
				if(arr[0].equals("token")){
					if(arr[2].equals("purple")){
						PurpleToken purple = new PurpleToken();
						if(arr[3].equals("y")){ //move
							purple.canMove=true;
						}else{
							purple.canMove=false;
						}
						if(arr[4].equals("y")){
							purple.canRotate=true;
						}else{
							purple.canRotate=false;
						}
						
						purple.posx = Integer.parseInt(arr[5]);
						purple.posy = Integer.parseInt(arr[6]);
						
						if(arr[7].equals("y")){
							purple.isTarget= true;
						}else{
							purple.isTarget= false;
						}
						purple.curDir = Integer.parseInt(arr[8]);
						
						tokens.add(purple);
					}
					else if(arr[2].equals("Red")){
						RedToken red = new RedToken();
						if(arr[3].equals("y")){ //move
							red.canMove=true;
						}else{
							red.canMove=false;
						}
						if(arr[4].equals("y")){
							red.canRotate=true;
						}else{
							red.canRotate=false;
						}
						
						red.posx = Integer.parseInt(arr[5]);
						red.posy = Integer.parseInt(arr[6]);
						
						if(arr[7].equals("y")){
							red.isTarget= true;
						}else{
							red.isTarget= false;
						}
						red.curDir = Integer.parseInt(arr[8]);
						tokens.add(red);
					}else if(arr[2].equals("yellow")){
						YellowToken yellow = new YellowToken();
						if(arr[3].equals("y")){ //move
							yellow.canMove=true;
						}else{
							yellow.canMove=false;
						}
						if(arr[4].equals("y")){
							yellow.canRotate=true;
						}else{
							yellow.canRotate=false;
						}
						
						yellow.posx = Integer.parseInt(arr[5]);
						yellow.posy = Integer.parseInt(arr[6]);
						
						if(arr[7].equals("y")){
							yellow.isTarget= true;
						}else{
							yellow.isTarget= false;
						}
						yellow.curDir = Integer.parseInt(arr[8]);
						tokens.add(yellow);
					}else if(arr[2].equals("blue")){
						BlueToken blue = new BlueToken();
						if(arr[3].equals("y")){ //move
							blue.canMove=true;
						}else{
							blue.canMove=false;
						}
						if(arr[4].equals("y")){
							blue.canRotate=true;
						}else{
							blue.canRotate=false;
						}
						
						blue.posx = Integer.parseInt(arr[5]);
						blue.posy = Integer.parseInt(arr[6]);
						
						if(arr[7].equals("y")){
							blue.isTarget= true;
						}else{
							blue.isTarget= false;
						}
						blue.curDir = Integer.parseInt(arr[8]);
					}else if(arr[2].equals("green")){
						GreenToken green = new GreenToken();
						if(arr[3].equals("y")){ //move
							green.canMove=true;
						}else{
							green.canMove=false;
						}
						if(arr[4].equals("y")){
							green.canRotate=true;
						}else{
							green.canRotate=false;
						}
						
						green.posx = Integer.parseInt(arr[5]);
						green.posy = Integer.parseInt(arr[6]);
						
						if(arr[7].equals("y")){
							green.isTarget= true;
						}else{
							green.isTarget= false;
						}
						green.curDir = Integer.parseInt(arr[8]);
					}else if(arr[2].equals("black")){
						BlackToken black = new BlackToken();
						if(arr[3].equals("y")){ //move
							black.canMove=true;
						}else{
							black.canMove=false;
						}
						if(arr[4].equals("y")){
							black.canRotate=true;
						}else{
							black.canRotate=false;
						}
						
						black.posx = Integer.parseInt(arr[5]);
						black.posy = Integer.parseInt(arr[6]);
						
						if(arr[7].equals("y")){
							black.isTarget= true;
						}else{
							black.isTarget= false;
						}
						black.curDir = Integer.parseInt(arr[8]);
					}
				}
				
			
			}
		} catch (IOException e) {
		System.out.println("Error : Could not read file");
		}
	}
	

}
