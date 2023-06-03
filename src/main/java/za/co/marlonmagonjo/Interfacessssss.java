package za.co.marlonmagonjo;

import java.util.Scanner;

/**
 *
 *  Cohesion - Defines interaction between objects
 *      Low cohesion - BAD
 *      High cohesion - GOOD
 *  Coupling - Dependency among objects
 *      Tight coupling - BAD
 *      Loose coupling - GOOD
 *  Interfaces for loosely coupled code
 *
 */

interface VideoPlayerr {
    void play(String file);
}

class MP4Playerr implements VideoPlayerr {

    @Override
    public void play(String file) {
        System.out.println("MP4Player playing the file - " + file);
    }
}

class MOVPlayerr implements VideoPlayerr {

    @Override
    public void play(String file) {
        System.out.println("MOVPlayer playing the file - " + file);
    }
}

class PlayerFactoryy {
    public static VideoPlayerr getPlayer(String file){
        if(file.endsWith("mp4")){
            return new MP4Playerr();
        }
        if(file.endsWith("mov")){
            return new MOVPlayerr();
        }
        return null;
    }
}

public class Interfacessssss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which file do you want to play");
        String file = scan.nextLine();

        VideoPlayerr player = PlayerFactoryy.getPlayer(file);
        if (player == null){
            System.out.println("Could not find a player for the file");
        } else {
            player.play(file);
        }
    }
}
