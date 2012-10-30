
public class MatchData {
	IContestant contestant1;               // variables
	IContestant contestant2;
	IScore gameScore;
	// constructor
	MatchData (	IContestant contestant1, IContestant contestant2, IScore gameScore){  // constructor
		this.contestant1 = contestant1;
		this.contestant2 = contestant2;
		this.gameScore = gameScore;			
	}
}
