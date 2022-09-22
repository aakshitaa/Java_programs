class Player {
    String name;
    String team;
    int jersey_number;
}

class Cricket_Player extends Player {
    int batting_avg = 118;
    int run_rate = 339;

    Cricket_Player(String n, String t, int jn) {
        this.name = n;
        this.team = t;
        this.jersey_number = jn;
        System.out.println("Sport:Cricket \nName: " + name + "\nTeam: " + team + "\nJersey number: " + jersey_number
                + "\nBatting average: " + batting_avg + "\nRun rate: " + run_rate);
    }
}

class Football_Player extends Player {
    int avg_score = 4;
    int receiving = 776;

    Football_Player(String n, String t, int jn) {
        this.name = n;
        this.team = t;
        this.jersey_number = jn;
        System.out.println("Sport:Cricket \nName: " + name + "\nTeam: " + team + "\nJersey number: " + jersey_number
                + "\nAverage Score: " + avg_score + "\nReceiving: " + receiving);
    }
}

class Hockey_player extends Player {
    int wins = 243;
    int goal_avg = 7;

    Hockey_player(String n, String t, int jn) {
        this.name = n;
        this.team = t;
        this.jersey_number = jn;
        System.out.println("Sport:Cricket \nName: " + name + "\nTeam: " + team + "\nJersey number: " + jersey_number
                + "\nwins: " + wins + "\ngoal average: " + goal_avg);
    }
}

public class Final {
    public static void main(String[] args) {
        Cricket_Player cp = new Cricket_Player("Mahendra Singh Dhoni", "India", 7);
        Football_Player fp = new Football_Player("Cristiano Ronaldo", "Portugal", 7);
        Hockey_player hp = new Hockey_player("Connor Mc David", "Richmond Hill", 97);
    }
}