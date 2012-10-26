Interface ITournament {}
class InitMatch implements ITournament {
  MatchData data;
  InitMatch (MatchData data) {
    this.data=data;
  }
}
class AdvanceMatch implements ITournament {
  MatchData data;
  Tournament feeder1;
  Tournament feeder2;
  AdvanceMatch (MatchData data,Tournament feeder1,Tournament feeder2) {
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
}