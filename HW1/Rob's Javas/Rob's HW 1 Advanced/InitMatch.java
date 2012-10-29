
class InitMatch extends AbsMatch{
	
	// constructor
	InitMatch (MatchData data){
		super(data);
	}
	
	// allScoresValid checks all scores contained for validity, returning true if valid and false if invalid
	public boolean allScoresValid() {
		return this.data.gameScore.isValid(); 
	}
	
	// playersAlwaysAdvanced checks to make sure all teams in the current match were in the feeders... since this is an initial match
	// it simply returns true.
	public boolean playersAlwaysAdvanced() {
		return true;		 
	}
	
	
	
	// matchesPlayed takes the string name of a team and returns the number of games that team played in
	public int matchesPlayed (String ateam){
		 //checks name against each team playing in the match, assumes the team didn't play against itself
		if (this.getName(1).equals(ateam) || this.getName(2).equals(ateam)){  
			return 1;   													       
		}
		return 0;   // returns 0 if it didn't find a matching team
	}
}
