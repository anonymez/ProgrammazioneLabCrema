
public class Grid {
/**
 *   n		x x
 *   n-1	x x
 *   n-2	x x
 *   .		x x
 *   .		x x
 *   .		x x
 *   2		x x
 *   1		x x
 *   0		x x
 *			0 1 2 . . . . m-2 m-1 m
 *
 *
 * rows = n+1
 * columns = m+1
 */
	private int rows,columns;
	private Pedina[][] pedineGrid;
	public Grid(int rows,int columns){
		this.rows=rows;
		this.columns=columns;
		this.pedineGrid=new Pedina[rows][columns];
		for(int indexRow=0;indexRow<this.rows;indexRow++){
			for(int indexCol=0;indexCol<this.columns;indexCol++){
				this.pedineGrid[indexRow][indexCol]=new Pedina();
			}
		}
	}
	
	
	public boolean addPedina(int x,Player p) throws ColumnFullException,FullGridException{
		
		if((x<0)||(x>=this.columns)){
			throw new ColumnFullException();
		}
		for(int indexRow=0;indexRow<this.rows;indexRow++){
			if (this.pedineGrid[indexRow][x].getPlayer()==null){
				this.pedineGrid[indexRow][x].setPlayer(p);
				return this.checkWinner(indexRow,x);
			}
		}
		for(int indexCol=0;indexCol<this.columns;indexCol++){
			if(this.pedineGrid[this.rows-1][indexCol].getPlayer()==null){
				throw new ColumnFullException();
			}
		}
		
		throw new FullGridException();
	}


	private boolean checkWinner(int r, int c) {
		//down c
		Player p=this.pedineGrid[r][c].getPlayer();
		if(this.smart4Check(r, c, 0, 1, p))
			return true;
		if(this.smart4Check(r, c, 1, 0, p))
			return true;
		if(this.smart4Check(r,c,1,1,p))
			return true;
		if(this.smart4Check(r, c, -1, +1, p))
			return true;
		return false;
	}
	
	private boolean smart4Check(int r,int c,int stepRow,int stepCol,Player p){
		int quattro=0;
		int indexCol,indexRow;
		//vertical
		indexRow=r;
		indexCol=c;
	    //up
	    while(((((indexRow>=0)&&(indexCol>=0))&&
	    	  (indexRow<this.rows))&&(indexCol<this.columns))&&
	    	  (this.pedineGrid[indexRow][indexCol].getPlayer()!=null))
	    		{
	    	if(this.pedineGrid[indexRow][indexCol].checkPlayer(p)){
	    		quattro++;
	    		if (quattro==4)
					return true;
	    	}else{
	    		break;
	    	}
	    	indexRow=indexRow+stepRow;
	    	indexCol=indexCol+stepCol;
	    }
	    //down
	   
	    stepRow=stepRow*-1;
	    stepCol=stepCol*-1;
	    indexRow=r+stepRow;
	    indexCol=c+stepCol;
	    while(((((indexRow>=0)&&(indexCol>=0))&&
		    	  (indexRow<this.rows))&&(indexCol<this.columns))&&
		    	  (this.pedineGrid[indexRow][indexCol].getPlayer()!=null)){
	    	if(this.pedineGrid[indexRow][indexCol].checkPlayer(p)){
	    		quattro++;
	    		if (quattro==4)
					return true;
	    	}else{
	    		break;
	    	}
	    	indexRow=indexRow+stepRow;
	    	indexCol=indexCol+stepCol;
	    }
	    return false;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result="";
		for(int indexRow=this.rows-1;indexRow>=0;indexRow--){
			for(int indexCol=0;indexCol<this.columns;indexCol++){
				result+=this.pedineGrid[indexRow][indexCol].getCoin()+" ";
			}
			result+="\n";
		}
		return result;
	}
	
	
}


