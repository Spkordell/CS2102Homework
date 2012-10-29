
public class RankedTeam extends AbsRanked {
	
	String captain;
	int numplayers;
	// constructor 
	RankedTeam (String name, int ranking, String captain, int numplayers){
		super(name,ranking);
		this.captain = captain;
		this.numplayers = numplayers;
	}
	
	
	
}
