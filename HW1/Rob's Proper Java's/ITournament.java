
public interface ITournament {
	boolean allScoresValid();
	boolean playersAlwaysAdvanced();
	String getName(int num); // meant for internal program use only. Inputs must be the integers 1 or 2
	int matchesPlayed (String ateam);
}
