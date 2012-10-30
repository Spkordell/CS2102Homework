
public class UnrankedPlayer implements IContestant{
	String name;
	UnrankedPlayer (String name){
		this.name = name;
	}
	// takes no input and returns a string representing the name- used to guarantee all IContestant have .name
	public String returnName(){
		return this.name;
	}
}
