
public interface IScore {
	
	
	
	
	
	
	
	// By including this in the interface, we have guaranteed
	// that all classes implementing IScore (and thus all scores)
	// will have this method, or else Java will give an error.
	boolean isValid ();
}
