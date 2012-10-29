/* Assignment 1 (advanced)
	Robert Dabrowski (rpdabrowski)
	Steve Kelly      (sjkelly)
	Steve Kordell    (spkordell)
*/

import tester.*;
public class Examples {
	Examples (){}  // constructor
	
	////////////// sample data //////////////////////
	// sample soccer and baseball scores 
	SoccerScore score1= new SoccerScore (10,9, true);  // valid
	SoccerScore score2= new SoccerScore (9,9, true);   // valid
	SoccerScore score3= new SoccerScore (10,9, false); // valid
	SoccerScore score4= new SoccerScore (9,9, false);  // invalid
	
	BaseballScore score5 = new BaseballScore (4, 2, 9); // valid
	BaseballScore score6 = new BaseballScore (2, 3, 10); // valid
	BaseballScore score7 = new BaseballScore (7, 3, 8); // invalid
	BaseballScore score8 = new BaseballScore (8, 8, 9); // invalid
	BaseballScore score9 = new BaseballScore (8, 8, 4); // invalid
	
	// sample soccer games, but java knows that because of the SoccerScore object
	MatchData USvsCanada = new MatchData ("USA", "Canada", new SoccerScore (88, 99, true));
	MatchData USvsMexico = new MatchData ("USA", "Mexico", new SoccerScore (12, 3, false));
	MatchData CanadavsMexico = new MatchData ("Canada", "Mexico", new SoccerScore (0, 7, false));
	MatchData USvsSpain = new MatchData ("USA", "Spain", new SoccerScore (9001, 3, true));
	MatchData USvsItaly = new MatchData ("USA", "Italy", score1);
	
	// sample baseball games, but java knows that because of the BaseballScore object
	MatchData RedSoxvsYankees1 = new MatchData ("Red Sox", "Yankees", new BaseballScore (88, 99, 47));
	MatchData RedSoxvsYankees2 = new MatchData ("Red Sox", "Yankees", new BaseballScore (12, 7, 8));
	MatchData RedSoxvsYankees3 = new MatchData ("Red Sox", "Yankees", new BaseballScore (2, 2, 9));
	MatchData WhiteSoxvsYankees = new MatchData ("White Sox", "Yankees", new BaseballScore (4, 3, 10));
	MatchData MetsvsRedSox = new MatchData ("Mets", "Red Sox", new BaseballScore (3, 4, 9));
		
	// sample sets
	Set set1 = new Set (6,3); // valids
	Set set2 = new Set (6,1);
	Set set3 = new Set (1,6);
	Set set4 = new Set (7,6);
	Set set5 = new Set (4,6);
	Set set6 = new Set (6,7);
	Set set7 = new Set (5,7);
	Set set8 = new Set (6,6); // invalids
	Set set9 = new Set (7,3);
	Set set10 = new Set (8,3);
	Set set11 = new Set (3,8);
	Set set12 = new Set (4,3);
	
	// sample tennis scores
	TennisScore match1 = new TennisScore ("Bob", "Joe", set1);       // valid
	TennisScore match2 = new TennisScore ("Bob", "Joe", set2, set3, set4);
	TennisScore match3 = new TennisScore ("Bob", "Joe", set1, set2, set3, set4);
	TennisScore match4 = new TennisScore ("Steve", "Joe", set1,set2, set3, set4, set7);
	TennisScore match5 = new TennisScore ("Steve", "Joe", set1, set6); 
	TennisScore match6 = new TennisScore ("Steve", "Joe", set9);     // invalids
	TennisScore match7 = new TennisScore ("Steve", "Joe", set10, set2);
	TennisScore match8 = new TennisScore ("Girl", "Woman", set11);
	TennisScore match9 = new TennisScore ("Girl", "Woman", set12, set11, set9, set8, set10);
	TennisScore match10 = new TennisScore ("Girl", "Woman", set11, set12, set2);
	TennisScore match11 = new TennisScore ("Girl", "Woman", set1, set10, set8);
	
	// soccer tournament
	InitMatch Game1s = new InitMatch(USvsItaly);                           // valid
	InitMatch Game2s = new InitMatch(CanadavsMexico);                      // valid
	AdvanceMatch Game3s = new AdvanceMatch(USvsCanada, Game1s, Game2s);    // valid
		
	// Baseball tournament
	InitMatch Game1b = new InitMatch (MetsvsRedSox);                           // valid
	InitMatch Game2b = new InitMatch (WhiteSoxvsYankees);                      // valid
	AdvanceMatch Game3b = new AdvanceMatch (RedSoxvsYankees3, Game1b, Game2b); // invalid
	AdvanceMatch Game4b = new AdvanceMatch (MetsvsRedSox, Game2b, Game2b);     // very invalid
	
	
	
	
	
	
	//////////////////////// tests //////////////////////////////////////
	// testing isValid
	boolean test1 (Tester t){
		return t.checkExpect(score1.isValid()  ,  true); 	}
	boolean test2 (Tester t){
		return t.checkExpect(score2.isValid()  ,  true); 	}
	boolean test3 (Tester t){
		return t.checkExpect(score3.isValid()  ,  true); 	}
	boolean test4 (Tester t){
		return t.checkExpect(score4.isValid()  ,  false); 	}
	boolean test5 (Tester t){
		return t.checkExpect(score5.isValid()  ,  true); 	}
	boolean test6 (Tester t){
		return t.checkExpect(score6.isValid()  ,  true); 	}
	boolean test7 (Tester t){
		return t.checkExpect(score7.isValid()  ,  false); 	}
	boolean test8 (Tester t){
		return t.checkExpect(score8.isValid()  ,  false); 	}
	boolean test9 (Tester t){
		return t.checkExpect(score9.isValid()  ,  false); 	}
	
	
	// testing allScoresValid
	boolean test10 (Tester t){
		return t.checkExpect(Game1s.allScoresValid()  ,  true); 	}
	boolean test11 (Tester t){
		return t.checkExpect(Game2s.allScoresValid()  ,  true); 	}
	boolean test12 (Tester t){
		return t.checkExpect(Game3s.allScoresValid()  ,  true); 	}
	boolean test13 (Tester t){
		return t.checkExpect(Game1b.allScoresValid()  ,  true); 	}
	boolean test14 (Tester t){
		return t.checkExpect(Game2b.allScoresValid()  ,  true); 	}
	boolean test15 (Tester t){
		return t.checkExpect(Game3b.allScoresValid()  ,  false); 	}

	//  testing playersAlwaysAdvanced
	boolean test16 (Tester t){
		return t.checkExpect(Game1s.playersAlwaysAdvanced()  ,  true); 	}
	boolean test17 (Tester t){
		return t.checkExpect(Game2s.playersAlwaysAdvanced()  ,  true); 	}
	boolean test18 (Tester t){
		return t.checkExpect(Game3s.playersAlwaysAdvanced()  ,  true); 	}
	boolean test19 (Tester t){
		return t.checkExpect(Game1b.playersAlwaysAdvanced()  ,  true); 	}
	boolean test20 (Tester t){
		return t.checkExpect(Game2b.playersAlwaysAdvanced()  ,  true); 	}
	boolean test21 (Tester t){
		return t.checkExpect(Game3b.playersAlwaysAdvanced()  ,  true); 	}
	boolean test22 (Tester t){
		return t.checkExpect(Game4b.playersAlwaysAdvanced()  ,  false); }

	// testing matchesPlayed
	boolean test23 (Tester t){
		return t.checkExpect(Game4b.matchesPlayed("Red Sox")  ,  1); }
	boolean test24 (Tester t){
		return t.checkExpect(Game2b.matchesPlayed("Red Sox")  ,  0); }
	boolean test25 (Tester t){
		return t.checkExpect(Game1b.matchesPlayed("Red Sox")  ,  1); }
	boolean test26 (Tester t){
		return t.checkExpect(Game3b.matchesPlayed("Red Sox")  ,  2); }
	
	/*  #2
	    Our code requires that all "scores" have an isValid method by including it in the IScore interface. When we make a new score
	    and have it implement IScore, we will get an error if that new class didn't have an isValid method.
	  
	    #6
		It did and it didn't. It doesn't explicitly check for validity and then spit out an error if invalid. It also will not break
		down if an invalid tournament is put in; it would simply spit out how many matches the given team played in. However, It will 
		yield an incorrect answer if the match is a specific kind of invalid- the given team played "against itself" or is listed as 
		both teams in the IScore object. The code will accept this case and only give the team credit for 1 match instead of 2.
		
		That assumption could be in two places. The first is in a comment that would tell the user to only use valid data, but that 
		isn't 100% reliable. The second is at the start of matchesPlayed we could run playersAlwaysAdvanced on the tournament and 
		spit out an error if the tournament was invalid. This may be a harsh solution because we technically can count how many matches
		a team played in an invalid tournament just as easily as in a valid tournament. 
	 */
}

