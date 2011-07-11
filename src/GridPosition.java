

public class GridPosition {	
		  public int row;
		  public int col;
		  
		  public GridPosition(int r, int c){
			  this.row=r; this.col=c;
		  }
		  
		  public boolean equals(GridPosition x){
			  return (this.row==x.row)&&(this.col==x.col);
		  }
		  

		  
		  public boolean equals(Object x){
			  if (x instanceof GridPosition){
				  GridPosition y = (GridPosition) x;
				  return (this.row==y.row)&&(this.col==y.col);
			  }
			  else return false;  
		  }
		  
		  public String toString(){
			  return "<"+row+","+col+">";
		  }
		  
		 
}
