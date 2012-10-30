
public class TennisScore implements IScore{
	String gender;
	ISet firstset;
	ISet secondset;
	ISet thirdset;
	ISet fourthset;
	ISet fifthset;

	// constructors (more than 1 for various cases of having different numbers of sets
	// 1 constructor for each possibility (1 set, 2 sets .. etc)
	
	// for 1 set played- minimum 1 set must be played for any record to exist
	TennisScore (ISet firstset, String gender){ // for 1 set played
		this.firstset = firstset;
		this.secondset = new UnplayedSet ();
		this.thirdset = new UnplayedSet ();
		this.fourthset = new UnplayedSet ();
		this.fifthset = new UnplayedSet ();
		this.gender = gender;
	}

	// for 2 sets played
	TennisScore (ISet firstset, ISet secondset, String gender){ 
		this.firstset = firstset;
		this.secondset = secondset;
		this.thirdset = new UnplayedSet ();
		this.fourthset = new UnplayedSet ();
		this.fifthset = new UnplayedSet ();
		this.gender = gender;
	}

	 // for 3 sets played
	TennisScore (ISet firstset, ISet secondset, ISet thirdset, String gender){
		this.firstset = firstset;
		this.secondset = secondset;
		this.thirdset = thirdset;
		this.fourthset = new UnplayedSet ();
		this.fifthset = new UnplayedSet ();
		this.gender = gender;
	}

	// for 4 sets played
	TennisScore (ISet firstset, ISet secondset, ISet thirdset, ISet fourthset, String gender){
		this.firstset = firstset;
		this.secondset = secondset;
		this.thirdset = thirdset;
		this.fourthset = fourthset;
		this.fifthset = new UnplayedSet ();
		this.gender = gender;
	}

	// for 5 sets played
	TennisScore (ISet firstset, ISet secondset, ISet thirdset, ISet fourthset, ISet fifthset, String gender){
		this.firstset = firstset;
		this.secondset = secondset;
		this.thirdset = thirdset;
		this.fourthset = fourthset;
		this.fifthset = fifthset;
		this.gender = gender;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}
}
