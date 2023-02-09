package com.examplecodewars.codewars.testdome;

import java.util.HashSet;
import java.util.Set;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
        Set<String> playlist = new HashSet<>();


       playlist.add(name);


        while(nextSong != null) {
            final boolean added = playlist.add(nextSong.name);
            if(!added) {
                return true;
            }
            nextSong = nextSong.nextSong;
        }

        return false;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}
