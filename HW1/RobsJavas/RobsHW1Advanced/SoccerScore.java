
public class SoccerScore implements IScore{
	int t1goals;
	int t2goals;
	boolean usedExtraTime;
	// constructor
	SoccerScore (int goals1,int goals2, boolean usedExtraTime) {
		this.t1goals = goals1;
		this.t2goals = goals2;
		this.usedExtraTime = usedExtraTime;
	}
	
	
	
	
	
	
	
	
	// isValid will check a SoccerScore to make sure that extra time was played if the 
	// game was a tie. If the game was not a tie, it is valid for the game to have taken
	// extra time, returning true if valid and false if invalid
	public boolean isValid(){
		return !(this.t1goals == this.t2goals && !(this.usedExtraTime));
	}
}



