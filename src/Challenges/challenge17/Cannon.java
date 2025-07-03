package Challenges.challenge17;

public class Cannon {

    int Rounds = 100;
    int maxRounds = Rounds;



// if (i % 5 == 1 || i % 5 == 2 || i % 5 == 4 || i % 5 == 7) {
// dit is fout, want modulo %5 kan alleen resten van 0,1,2,3,4 bevatten...  5%5 = 0 en 9%5 = 4

    public void loopThroughValues(int maxRounds) {
        for (int i = 1; i <= maxRounds; i++) {
            if (i % 15 == 0) { // % 15 == 0 is hetzelfde als %3 == 0 && %5 ==0 om te zien welke iteraties een vuur en electric shot hebben
                System.out.println(i + ": \u001B[35mCombined Shot 1\u001B[0m");
            } else if (i % 3 == 0) {
                System.out.println(i + ": \u001B[31mFire\u001B[0m");
            } else if (i % 5 == 0) {
                System.out.println(i + ": \u001B[33mElectric\u001B[0m");
            } else {
                System.out.println(i + ": \u001B[0mNormal\u001B[0m");
            }
        }
    }


    public void shotWarning() {

    }

    public void changeColor() {

    }
}
