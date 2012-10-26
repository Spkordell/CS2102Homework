/*
Purpose:
Date:
Authors:
*/
//To Do
//Include code header
//Extend your current definitions to also support baseball scores.
//Add Main.c
//Add example Data
//Add Methods
//And yes, it's one file, but it's under 200 lines, so I think it's fine. If you want to break it up, go for it.

interface ITournament {}

//To ensure all score classes have an isValid method, an interface was created containing the method name.
//All classes related to scoring should implement this interface.
interface IScores {
  boolean isValid();
}
class InitMatch implements ITournament {
  MatchData data;
  InitMatch (MatchData data) {
    this.data=data;
  }
}
class AdvanceMatch implements ITournament {
  MatchData data;
  ITournament feeder1;
  ITournament feeder2;
  AdvanceMatch (MatchData data,ITournament feeder1,ITournament feeder2) {
    this.data=data;
    this.feeder1=feeder1;
    this.feeder2=feeder2;
  }
}
class MatchData implements IScores { //should this implement IScores? Or should a new interfce be made? If it implements IScores, it needs an isValid Method, which doens't really make sense here, or actually, maybe it does...I'm not sure. Thoughts?
  String team1;
  String team2;
  IScores score; //previously defined as type soccerScore
  MatchData(String team1,String team2,IScores score) {
    this.team1=team1;
    this.team2=team2;
    this.score=score;
  }
  public boolean isValid() {
    return this.score.isValid();
  }
}
class SoccerScore implements IScores {
  int goals1;
  int goals2;
  boolean extraTime;
  SoccerScore(int goals1,int goals2,boolean extraTime) {
    this.goals1=goals1;
    this.goals2=goals2;
    this.extraTime=extraTime;
  }
  public boolean isValid() {
    return ((this.goals1==this.goals2) && extraTime);
  }
}
class BaseballScore implements IScores{
  int runs1;
  int runs2;
  int totalInnings;
  BaseballScore(int runs1,int runs2,int totalInnings) {
    this.runs1=runs1;
    this.runs2=runs2;
    this.totalInnings=totalInnings;
  }
  public boolean isValid() {
    return (totalInnings>=9 && this.runs1!=this.runs2);
  }
}

class Examples {
  Examples(){}
  InitMatch soccerMatch1 = new InitMatch(new MatchData("aCleverSoccerTeamNameHere","anotherCleverSoccerTeamNameHere",new SoccerScore(12,12,false))); //Not a Valid Score
  InitMatch baseballMatch1 = new InitMatch(new MatchData("aCleverBaseballTeamNameHere","anotherCleverbaseBallTeamNameHere",new BaseballScore(5,628,9))); //Is a valid Score    
  //Need examples of advance Match and methods
}
