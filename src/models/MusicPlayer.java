package models;

import domain.App;

public class MusicPlayer extends App {
    public MusicPlayer(String name, String version) {
        super(name, version);
    }

    public void play(){
        System.out.println("playing");
    }

    public void playNext(){
        System.out.println("playing next music");
    }
    public void playPrevious(){
        System.out.println("playing previous music");
    }

    public void pause(){
        System.out.println("pausing music");
    }

    public void close(){
        System.out.println("closing music player");
    }
}
