Interface ITournament {}

class initMatch implements ITournament {
  matchData data;
  initMatch (data) {
    this.data=data;
  }
}

class advanceMatch implements ITournament {
  matchData data;
  tournament feeder1;
  tournament feeder2;
  advanceMatch (data,feeder1,feeder2) {
    this.data=data;
    this.feeder1.feeder1;
    this.feeder2=feeder2;
  }
}

class matchData {
  String team1;
  String team2;
  soccerScore score;
  matchData(team1,team2,score) {
    this.team1=team1;
    this.team2=team2;
    this.score=score;
  }
}

class soccerScore {
  int goals1;
  int goals2;
  boolean extraTime;
  soccerScore(goals1,goals2,extraTime) {
    this.goals1=goals1;
    this.goals2=goals2;
    this.extraTime=extraTime;
  }
}