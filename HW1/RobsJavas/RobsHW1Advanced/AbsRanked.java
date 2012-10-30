
abstract class AbsRanked implements IContestant, IRanked{
	String name;
	int ranking;
	//constructor
	// the integer input for ranking should be >= 1
	AbsRanked(String name, int ranking){
		this.name = name;
		this.ranking = ranking;
	}
	
	// takes no input and returns a string representing the name- used to guarantee all IContestant have .name
	public String returnName(){
		return this.name;
	}
	
	// takes an object representing a ranked opponent and returns boolean for whether the current object is ranked better
	public boolean hasBetterRanking(IRanked opponent){
		return this.ranking < getRanking(opponent);
	}
	// returns the ranking variable of the given object
	public int getRanking (IRanked opponent){
		return this.ranking;
	}
	
}
