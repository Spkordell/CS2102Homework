
abstract class AbsRanked implements IContestant, IRanked{
	String name;
	int ranking;
	//constructor
	AbsRanked(String name, int ranking){
		this.name = name;
		this.ranking = ranking;
	}
	
	
	

	public boolean hasBetterRanking(IRanked opponent){
		return this.ranking <= getRanking(opponent);
	}
	public int getRanking (IRanked opponent){
		return this.ranking;
	}
	
}
