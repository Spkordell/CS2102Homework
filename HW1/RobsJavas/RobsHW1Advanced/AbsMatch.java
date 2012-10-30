

abstract class AbsMatch implements ITournament{
	MatchData data;
	// constructor
	AbsMatch (MatchData data){
		this.data = data;
	}
	
	// getName is a shortcut for getting the string name from the match of team1 or team2 based on the input 
	// This method is meant to only be called within the program and not by the user. The only inputs that this should
	// get are the integers "1" and "2"
	public String getName (int num){  
		if (num == 1){
			return this.data.contestant1.returnName();  
		}
		return this.data.contestant2.returnName();     // if it isn't 1, then it is 2 and we can just do this
	}	
}
