/* Assignment 1 (advanced)
 Robert Dabrowski (rpdabrowski)
 Steve Kelly      (sjkelly)
 Steve Kordell    (spkordell)
 */

import tester.*;
public class Examples {
 Examples (){}  // constructor

 ////////////// sample data //////////////////////
 // UnrankedPlayer = an example just to prove the class works, not applied here
  UnrankedPlayer ThatGuy = new UnrankedPlayer("THAT GUY");
 // Soccer
 // sample soccer soccer scores
 SoccerScore score1= new SoccerScore (10,9, true);  // valid
 SoccerScore score2= new SoccerScore (9,9, true);   // valid
 SoccerScore score3= new SoccerScore (10,9, false); // valid
 SoccerScore score4= new SoccerScore (9,9, false);  // invalid

 // RankedTeam = soccer teams are ranked
 RankedTeam USA = new RankedTeam ("USA", 1, "Soccer Player", 15 );
 RankedTeam Canada = new RankedTeam ("Canada", 2, "Soccer Guy", 20 );
 RankedTeam Mexico = new RankedTeam ("Mexico", 3, "Goalie", 16 );
 RankedTeam Spain = new RankedTeam ("Spain", 4, "Their Mascott", 17 );
 RankedTeam Italy = new RankedTeam ("Italy", 5, "Tom Brady", 16 );

 // sample soccer games, but java knows that because of the SoccerScore object
 MatchData USvsCanada = new MatchData (USA, Canada, new SoccerScore (88, 99, true));
 MatchData USvsMexico = new MatchData (USA, Mexico, new SoccerScore (12, 3, false));
 MatchData CanadavsMexico = new MatchData (Canada, Mexico, new SoccerScore (0, 7, false));
 MatchData USvsSpain = new MatchData (USA, Spain, new SoccerScore (9001, 3, true));
 MatchData USvsItaly = new MatchData (USA, Italy, score1);

 // soccer tournament
 InitMatch Game1s = new InitMatch(USvsItaly);                           // valid
 InitMatch Game2s = new InitMatch(CanadavsMexico);                      // valid
 AdvanceMatch Game3s = new AdvanceMatch(USvsCanada, Game1s, Game2s);    // valid
 
 //Baseball
 // sample baseball scores
 BaseballScore score5 = new BaseballScore (4, 2, 9); // valid
 BaseballScore score6 = new BaseballScore (2, 3, 10); // valid
 BaseballScore score7 = new BaseballScore (7, 3, 8); // invalid
 BaseballScore score8 = new BaseballScore (8, 8, 9); // invalid
 BaseballScore score9 = new BaseballScore (8, 8, 4); // invalid

 // UnrankedTeam = baseball teams are teams that are unranked
 UnrankedTeam RedSox = new UnrankedTeam("Red Sox", "Captain Guy", 29 );
 UnrankedTeam Yankees = new UnrankedTeam("Yankees", "Captain Male", 28 );
 UnrankedTeam WhiteSox = new UnrankedTeam("White Sox", "Captain Dude", 27 );
 UnrankedTeam Mets = new UnrankedTeam("Mets", "Captain Man", 30 );

 // sample baseball games, but java knows that because of the BaseballScore object
 MatchData RedSoxvsYankees1 = new MatchData (RedSox, Yankees, new BaseballScore (88, 99, 47));
 MatchData RedSoxvsYankees2 = new MatchData (RedSox, Yankees, new BaseballScore (12, 7, 8));
 MatchData RedSoxvsYankees3 = new MatchData (RedSox, Yankees, new BaseballScore (2, 2, 9));
 MatchData WhiteSoxvsYankees = new MatchData (WhiteSox, Yankees, new BaseballScore (4, 3, 10));
 MatchData MetsvsRedSox = new MatchData (Mets, RedSox, new BaseballScore (3, 4, 9));

 // Baseball tournament
 InitMatch Game1b = new InitMatch (MetsvsRedSox);                           // valid
 InitMatch Game2b = new InitMatch (WhiteSoxvsYankees);                      // valid
 AdvanceMatch Game3b = new AdvanceMatch (RedSoxvsYankees3, Game1b, Game2b); // invalid
 AdvanceMatch Game4b = new AdvanceMatch (MetsvsRedSox, Game2b, Game2b);     // very invalid
 
 //Tennis
 // sample TennisSet results for tennis
 TennisSet TennisSet1 = new TennisSet (6,3); // valids
 TennisSet TennisSet2 = new TennisSet (6,1);
 TennisSet TennisSet3 = new TennisSet (1,6);
 TennisSet TennisSet4 = new TennisSet (7,6);
 TennisSet TennisSet5 = new TennisSet (4,6);
 TennisSet TennisSet6 = new TennisSet (6,7);
 TennisSet TennisSet7 = new TennisSet (5,7);
 TennisSet TennisSet8 = new TennisSet (6,6); // invalids
 TennisSet TennisSet9 = new TennisSet (7,3);
 TennisSet TennisSet10 = new TennisSet (8,3);
 TennisSet TennisSet11 = new TennisSet (3,8);
 TennisSet TennisSet12 = new TennisSet (4,3);

 // sample tennis scores
 TennisScore match1 = new TennisScore ( TennisSet1,"F");       // valid
 TennisScore match2 = new TennisScore ( TennisSet2, TennisSet3, TennisSet4,"F");
 TennisScore match3 = new TennisScore ( TennisSet1, TennisSet2, TennisSet3, TennisSet4,"M");
 TennisScore match4 = new TennisScore ( TennisSet1,TennisSet2, TennisSet3, TennisSet4, TennisSet7,"M");
 TennisScore match5 = new TennisScore ( TennisSet1, TennisSet6,"F"); 
 TennisScore match6 = new TennisScore ( TennisSet9,"F");     // invalids
 TennisScore match7 = new TennisScore ( TennisSet10, TennisSet2,"F");
 TennisScore match8 = new TennisScore ( TennisSet11,"F");
 TennisScore match9 = new TennisScore ( TennisSet12, TennisSet11, TennisSet9, TennisSet8, TennisSet10,"F");
 TennisScore match10 = new TennisScore (TennisSet11, TennisSet12, TennisSet2,"M");
 TennisScore match11 = new TennisScore (TennisSet1, TennisSet2, TennisSet8,"M");

 // RankedPlayer = tennis players that are ranked
 RankedPlayer Steve = new RankedPlayer ("Steve", 5);
 RankedPlayer Stephen = new RankedPlayer ("Stephen", 99999);
 RankedPlayer Joe = new RankedPlayer ("Joe", 3);
 RankedPlayer Kathi = new RankedPlayer ("Kathi", 1);
 RankedPlayer Woman = new RankedPlayer ("Woman", 2);

 // sample tennis matches
 MatchData StevevsJoe1 = new MatchData (Steve, Joe, match1);
 MatchData StevevsJoe2 = new MatchData (Steve, Joe, match2);
 MatchData StevevsJoe3 = new MatchData (Steve, Joe, match3);
 MatchData StevevsJoe4 = new MatchData (Steve, Joe, match4);
 MatchData StevevsJoe5 = new MatchData (Steve, Joe, match5);
 MatchData StevevsStephen6 = new MatchData (Steve, Joe, match7);
 MatchData StevevsJoe7 = new MatchData (Steve, Joe, match8);
 MatchData KathivsWoman7 = new MatchData (Kathi, Woman, match1);
 MatchData KathivsWoman8 = new MatchData (Kathi, Woman, match9);
 MatchData KathivsWoman9 = new MatchData (Kathi, Woman, match10);
 MatchData KathivsWoman10 = new MatchData (Kathi, Woman, match11);

 // tennis tournament 
 InitMatch Game1T = new InitMatch(StevevsJoe1);
 InitMatch Game2T = new InitMatch(StevevsStephen6);
 InitMatch Game3T = new InitMatch(StevevsJoe1);






 //////////////////////// tests //////////////////////////////////////
 // testing isValid
 boolean test1 (Tester t){
  return t.checkExpect(score1.isValid()  ,  true);  }
 boolean test2 (Tester t){
  return t.checkExpect(score2.isValid()  ,  true);  }
 boolean test3 (Tester t){
  return t.checkExpect(score3.isValid()  ,  true);  }
 boolean test4 (Tester t){
  return t.checkExpect(score4.isValid()  ,  false);  }
 boolean test5 (Tester t){
  return t.checkExpect(score5.isValid()  ,  true);  }
 boolean test6 (Tester t){
  return t.checkExpect(score6.isValid()  ,  true);  }
 boolean test7 (Tester t){
  return t.checkExpect(score7.isValid()  ,  false);  }
 boolean test8 (Tester t){
  return t.checkExpect(score8.isValid()  ,  false);  }
 boolean test9 (Tester t){
  return t.checkExpect(score9.isValid()  ,  false);  }


 // testing allScoresValid
 boolean test10 (Tester t){
  return t.checkExpect(Game1s.allScoresValid()  ,  true);  }
 boolean test11 (Tester t){
  return t.checkExpect(Game2s.allScoresValid()  ,  true);  }
 boolean test12 (Tester t){
  return t.checkExpect(Game3s.allScoresValid()  ,  true);  }
 boolean test13 (Tester t){
  return t.checkExpect(Game1b.allScoresValid()  ,  true);  }
 boolean test14 (Tester t){
  return t.checkExpect(Game2b.allScoresValid()  ,  true);  }
 boolean test15 (Tester t){
  return t.checkExpect(Game3b.allScoresValid()  ,  false);  }

 //  testing playersAlwaysAdvanced
 boolean test16 (Tester t){
  return t.checkExpect(Game1s.playersAlwaysAdvanced()  ,  true);  }
 boolean test17 (Tester t){
  return t.checkExpect(Game2s.playersAlwaysAdvanced()  ,  true);  }
 boolean test18 (Tester t){
  return t.checkExpect(Game3s.playersAlwaysAdvanced()  ,  true);  }
 boolean test19 (Tester t){
  return t.checkExpect(Game1b.playersAlwaysAdvanced()  ,  true);  }
 boolean test20 (Tester t){
  return t.checkExpect(Game2b.playersAlwaysAdvanced()  ,  true);  }
 boolean test21 (Tester t){
  return t.checkExpect(Game3b.playersAlwaysAdvanced()  ,  true);  }
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

 // testing hasBetterRanking
 boolean test27 (Tester t){
  return t.checkExpect(Kathi.hasBetterRanking(Woman)  ,  true); }
 boolean test28 (Tester t){
  return t.checkExpect(Mexico.hasBetterRanking(USA)  ,  false); }
 boolean test29 (Tester t){
  return t.checkExpect(Mexico.hasBetterRanking(Italy)  ,  false); }
 
 
 
 
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

