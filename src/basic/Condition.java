package basic;

public class Condition {
    public static void main(String[] args) {
        int BhabiGaveMe$ = 5000;
        int BhaiaGaveMe$ = 10000;
        if (BhabiGaveMe$ > 2000 && BhaiaGaveMe$ < 5000) {
            System.out.println("Buy a nice car");
        } else {
            System.out.println("Buy a new laptop");
        }
        int bts = 600;
        int nuest = 200;
        if (bts <= 600 | nuest < 600) {
            System.out.println("buy a concert ticket");
        } else if (bts > 1000); {
            System.out.println("do not buy the ticket");
        } if (bts == 600); {
            System.out.println("you need to save more money to buy a ticket");
        } if (nuest<=200) {
            System.out.println("go to nuest concert instead of bts");
        }
        int monstax =500;
        if (monstax == 1000) {
            System.out.println("I can't afford the concert ticket");
        } else if (monstax != 1000){
            System.out.println("I will be able to afford the ticket ");
        } else if (bts < 1000 && monstax >= 500) {
            System.out.println("I'll be able to attend both the concerts");
        }

        int skorea = 5000;
        int nkorea = 2000;
        if (skorea > 5000 && nkorea <= 5000) {
            System.out.println("Enjoy in South Korea");
        } else {
            System.out.println("Die because Kim Jong-un will shoot you");
        }

        int bigfish = 3;
        int smallfish = 5;
        if (bigfish != 3 | smallfish < 5) {
            System.out.println("Bhaia and Bhabi's hard work will go to waste");
        } else if (bigfish >= 3 && smallfish >= 5){
            System.out.println("Bhaia and Bhabi will be elated");
        } else if (bigfish > 5) {
            System.out.println("Bhabi will cook the fish for Sehri");
        }

        int steal$ = 1000;
        if (steal$ >= 1000) {
            System.out.println("Report it to police");
        } else if (steal$ < 1000) {
            System.out.println("Beat the thief into pulp");
        }
        int zombie = 5000;
        int halfzombie = 10000;
        if (zombie == 5000 && halfzombie >= 1000) {
            System.out.println("Do not leave the apartment");
        } else if (zombie != 1000 | halfzombie <= 1000) {
            System.out.println("Hide, Fight and leave the city");
        }
        int debt = 10000;
        if (debt > 10000) {
            System.out.println("Participate in squid game");
        } else if (debt != 10000 | debt <= 10000) {
            System.out.println("do not participate in the deadly game");
        }

    }

}
