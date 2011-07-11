import java.util.ArrayList;
import java.util.Collections;


public class Model 
{
	public Board theBoard;
	public ArrayList<GridPosition> minePosition;
	public ArrayList<GridPosition> freeSpace;
	 public static boolean debugging = true;
	public Model(int w, int d)
	{
		theBoard=new Board(w,d);
		minePosition = new ArrayList<GridPosition>();
		// next we add all free positions into a list and shuffle it!
		  freeSpace = new ArrayList<GridPosition>();
		  for (int i=0; i<w; i++)
			  for(int j=0;j<d;j++)
				  freeSpace.add(new GridPosition(i,j));
		  // shuffling the freeSpace allows us to pick a random elt from the list ...
		  Collections.shuffle(freeSpace);
		  for (int i=0;i<Math.min(20,w*d);i++){
			  GridPosition q = getEmptySpace();
			  if (debugging) System.out.println("adding a jewel at position "+q);
			  minePosition.add(q);
		  }
	}
	 // here we add up to 20 mines to the board
	  
	  public void addMine() {
		  minePosition.add(getEmptySpace());
	  }
	    	 
	  public GridPosition getEmptySpace() {
		  // We should consider the case where there is no more freespace!!
		  // Currently it will throw an index out of bounds exception
		  GridPosition p = freeSpace.remove(freeSpace.size()-1);
		  return p;
	  }
}
