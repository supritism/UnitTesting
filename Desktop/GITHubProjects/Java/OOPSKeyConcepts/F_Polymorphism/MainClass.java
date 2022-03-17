package com.fls.OOPSKeyConcepts.F_Polymorphism;

//Will be creating different classes in this single main class to show Polymorphism and save some time.
public class MainClass {

    public static void main(String[] args) {

        for(int i=1; i<11; i++){
            Movie movie = getRandomMovie();
            System.out.println("Movie #" + i + " Movie name: " + movie.getName() + "\n" + "Movie plot: " + movie.plot());
        }
    }

    public static Movie getRandomMovie(){
        int randomMovie = (int) (Math.random() * 5 + 1);

        switch(randomMovie) {
            case 1 :
                return new Jaws();

            case 2 :
                return new IndependenceDay();

            case 3 :
                return new MazeRunner();

            case 4 :
                return new StarWars();

            default :
                return new ForgettableMovie();

        }
    }

}

//Base Movie class
class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

//Subclass 1
class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}

//Subclass 2
class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}

//Subclass 3
class MazeRunner extends Movie{

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze";
    }
}

//Subclass 4
class StarWars extends Movie{

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial forces try to take over the universe";
    }
}

//Subclass 5
class ForgettableMovie extends Movie{

    public ForgettableMovie() {
        super("Forgettable Movie");
    }
    //No plot method here
}