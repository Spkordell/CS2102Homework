
public class InitMatch implements ITournament{
	MatchData agame;
	// constructor
	InitMatch (MatchData agame){
		this.agame = agame;
	}
	
	// allScoresValid checks all scores contained for validity, returning true if valid and false if invalid
	public boolean allScoresValid() {
		return this.agame.gameScore.isValid(); 
	}
	
	// playersAlwaysAdvanced checks to make sure all teams in the current match were in the feeders... since this is an initial match
	// it simply returns true.
	public boolean playersAlwaysAdvanced() {
		return true;		 
	}
	
	// getName is a shortcut for getting the string name from the match of team1 or team2 based on the input 
	// This method is meant to only be called within the program and not by the user. The only inputs that this should
	// get are the integers "1" and "2"
	public String getName(int num){
		if (num == 1){
			return this.agame.team1;  
		}
		return this.agame.team2;  // if it isn't 1, then it is 2 and we can just do this
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
