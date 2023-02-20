package za.co.marlonmagonjo;

import java.util.Scanner;

interface VideoPlayer {
    void play(String file);
}

class MP4Player implements VideoPlayer{

    @Override
    public void play(String file) {
        System.out.println("MP4Player playing the file - " + file);
    }
}

class MOVPlayer implements  VideoPlayer{

    @Override
    public void play(String file) {
        System.out.println("MOVPlayer playing the file - " + file);
    }
}

class PlayerFactory {
    public static VideoPlayer getPlayer(String file){
        if(file.endsWith("mp4")){
            return new MP4Player();
        }
        if(file.endsWith("mov")){
            return new MOVPlayer();
        }
        return null;
    }
}

public class VideoPlayerInterface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which file do you want to play?");
        String file = scan.nextLine();
        // Client
        VideoPlayer player = PlayerFactory.getPlayer(file);
        if(player == null){
            System.out.println("Could not find a player for the given file");
        } else {
            player.play(file);
        }
    }
}
