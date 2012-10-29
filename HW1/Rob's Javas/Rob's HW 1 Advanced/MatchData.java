
public class MatchData {
	IContestant team1;               // variables
	IContestant team2;
	IScore gameScore;
	// constructor
	MatchData (	IContestant team1, IContestant team2, IScore gameScore){  // constructor
		this.team1 = team1;
		this.team2 = team2;
		this.gameScore = gameScore;			
	}
}
