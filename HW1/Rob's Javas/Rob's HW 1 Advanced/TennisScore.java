
public class TennisScore implements IScore{
 String player1;
 String player2;
 ISet firstset;
 ISet secondset;
 ISet thirdset;
 ISet fourthset;
 ISet fifthset;

 // constructors (more than 1 for various cases of having different numbers of sets
 // 1 constructor for each possibility (1 set, 2 sets .. etc)
 // for 1 set played
 TennisScore (String player1, String player2, ISet firstset){ // for 1 set played
  this.player1 = player1;
  this.player2 = player2;
  this.firstset = firstset;
  this.secondset = new UnplayedSet ();
  this.thirdset = new UnplayedSet ();
  this.fourthset = new UnplayedSet ();
  this.fifthset = new UnplayedSet ();
 }
 // for 2 sets played
 TennisScore (String player1, String player2, ISet firstset, ISet secondset){ 
  this.player1 = player1;
  this.player2 = player2;
  this.firstset = firstset;
  this.secondset = secondset;
  this.thirdset = new UnplayedSet ();
  this.fourthset = new UnplayedSet ();
  this.fifthset = new UnplayedSet ();
 }
  // for 3 sets played
 TennisScore (String player1, String player2, ISet firstset, ISet secondset, ISet thirdset){
  this.player1 = player1;
  this.player2 = player2;
  this.firstset = firstset;
  this.secondset = secondset;
  this.thirdset = thirdset;
  this.fourthset = new UnplayedSet ();
  this.fifthset = new UnplayedSet ();
 }
 // for 4 sets played
 TennisScore (String player1, String player2, ISet firstset, ISet secondset, ISet thirdset, ISet fourthset){
  this.player1 = player1;
  this.player2 = player2;
  this.firstset = firstset;
  this.secondset = secondset;
  this.thirdset = thirdset;
  this.fourthset = fourthset;
  this.fifthset = new UnplayedSet ();
 }
 // for 5 sets played
 TennisScore (String player1, String player2, ISet firstset, ISet secondset, ISet thirdset, ISet fourthset, ISet fifthset){
  this.player1 = player1;
  this.player2 = player2;
  this.firstset = firstset;
  this.secondset = secondset;
  this.thirdset = thirdset;
  this.fourthset = fourthset;
  this.fifthset = fifthset;
 }
 public boolean isValid() {
   //male scores are always valid as the method won't accept more than 5 sets
   return (this.gender.equals("M") || (this.gender.equals("F") && this.forthset instanceof UnplayedSet));
}
