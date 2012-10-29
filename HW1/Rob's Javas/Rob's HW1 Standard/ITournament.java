
public interface ITournament {
	boolean allScoresValid();
	boolean playersAlwaysAdvanced();
	int matchesPlayed (String ateam);
		
	String getName (int num);  // this helper is listed here because it is actually designed to operate on the interface
}
