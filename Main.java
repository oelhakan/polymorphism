class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot Here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }
    public String plot(){
        return "Shark Eats Lots Of People";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens Attempt To Take Over Planet Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids Try And Escape A Maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces Try To Take Over The Universe";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
    //no plot method
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");     // \n for next line.
        }

    }
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;   //math.random returns a random double number between 1.0 and 0.0
        System.out.println("Random Number Generated Was : " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2 :
                return new IndependenceDay();
            case 3 :
                return new MazeRunner();
            case 4 :
                return new StarWars();
            case 5 :
                return new Forgetable();
        }
        return null;
    }
}
