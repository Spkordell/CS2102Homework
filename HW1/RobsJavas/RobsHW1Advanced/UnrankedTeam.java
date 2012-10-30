
public class UnrankedTeam implements IContestant{
	String name;
	String captain;
	int numplayers;
	UnrankedTeam (String name, String captain, int numplayers){
		this.name = name;
		this.captain = captain;
		this.numplayers = numplayers;
	}
	
	// takes no input and returns a string representing the name- used to guarantee all IContestant have .name
	public String returnName(){
		return this.name;
	}
}
