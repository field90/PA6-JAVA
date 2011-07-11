
public class Board 
{
	public int width, depth;
	//an array of spaces 
	Space[][] board;
	 public int getWidth(){
		  return width;
	  }
	  
	  public int getDepth(){
		  return depth;
	  }
	  public Board(int w, int d){
		  this.width=w;
		  this.depth=d; 
		  
		  board = new Space[w][d];
		  /*
		   * first we create four random walls for every cell in the maze
		   * Each wall may or may not be open (depending on a random choice of edginess)
		   */
		  for (int i=0;i<w;i++)
		  {
			  for (int j=0; j<d; j++) 
			  {
				  board[i][j] = new Space();
			  }
		  }
	  }
}
