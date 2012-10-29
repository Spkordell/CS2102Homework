
class AdvanceMatch extends AbsMatch{
	
	ITournament feeder1;
	ITournament feeder2;
	// constructor
	AdvanceMatch (MatchData data,	ITournament feeder1, ITournament feeder2){
		super(data);
		this.feeder1 = feeder1;
		this.feeder2 = feeder2;
		}
	// allScoresValid checks all scores contained for validity, returning true if valid and false if invalid
	public boolean allScoresValid(){
		return this.data.gameScore.isValid() && this.feeder1.allScoresValid() && this.feeder2.allScoresValid();
	}
	
	// playersAlwaysAdvanced checks the players in the current game and makes sure they are listed at least once in either of 
	// the feeder matches. It does not check to make sure they didn't already play each other. Returns true if they did and false otherwise
	public boolean playersAlwaysAdvanced(){
		// checks all possible locations for the first team, proceeds to next question if true
		if (this.getName(1).equals(this.feeder1.getName(1))   
				|| this.getName(1).equals(this.feeder1.getName(2))
				|| this.getName(1).equals(this.feeder2.getName(1))
				|| this.getName(1).equals(this.feeder2.getName(2))){
			// checks all possible locations for the second team, proceeds if true
			if (this.getName(2).equals(this.feeder1.getName(1))     
						|| this.getName(2).equals(this.feeder1.getName(2))
						|| this.getName(2).equals(this.feeder2.getName(1))
						|| this.getName(2).equals(this.feeder2.getName(2))){  
				return true;
			}
		}
		return false;  // if either of the questions above fail to find the team in a previous game, this returns false
	}
	
	
	
	
	// matchesPlayed takes the string name of a team and returns the number of games that team played in
	public int matchesPlayed (String ateam){
		int occurences = 0;  
		//checks name against each team playing in the match, assumes the team didn't play against itself
		if (this.getName(1).equals(ateam) || this.getName(2).equals(ateam)) {
			occurences ++;													       
		}
		return occurences + this.feeder1.matchesPlayed(ateam) + this.feeder2.matchesPlayed(ateam);
	}





}
