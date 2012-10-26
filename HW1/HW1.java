//To Do
//Extend your current definitions to also support baseball scores.
//Add Main.c
//Add example Data
//Add Methodss

//And yes, it's one file, but it's under 200 lines, so I think it's fine. If you want to break it up, go for it.

Interface ITournament {}
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
    this.feeder1.feeder1;
    this.feeder2=feeder2;
  }
}
class MatchData {
  String team1;
  String team2;
  SoccerScore score;
  matchData(String team1,String team2,SoccerScore score) {
    this.team1=team1;
    this.team2=team2;
    this.score=score;
  }
}
class SoccerScore {
  int goals1;
  int goals2;
  boolean extraTime;
  soccerScore(int goals1,int goals2,boolean extraTime) {
    this.goals1=goals1;
    this.goals2=goals2;
    this.extraTime=extraTime;
  }
  boolean isValid() {
    return ((this.goals1==this.goals2) && extraTime);
  }
}
class BaseballScore {
  int runs1;
  int runs2;
  int totalInnings;
  BaseballScore(int runs1,int runs2,int totalInnings) {
    this.runs1=runs1;
    this.runs2=runs2;
    this.totalInnings=totalInnings;
  }
  boolean isValid() {
    return (totalInnings>=9 && this.runs1!=this.runs2)
  }
}

class Examples {
  Examples(){}
}
