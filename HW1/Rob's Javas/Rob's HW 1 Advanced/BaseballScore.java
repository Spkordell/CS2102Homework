
public class BaseballScore implements IScore{
	int t1runs;
	int t2runs;
	int innings;
	// constructor
	BaseballScore (int runs1,int runs2, int numInnings) { 
		this.t1runs = runs1;
		this.t2runs = runs2;
		this.innings = numInnings;
	}
	
	
	
	
	// isValid will check a BasebalScore to make sure 9+ innings were played AND the game wasn't a tie
	// returning true if valid and false if invalid.
	public boolean isValid(){
		return (this.t1runs != this.t2runs && this.innings >= 9);
	}
}
