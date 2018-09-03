package com.android.jsanchez.sounds_native.modals;

public class Animal {

    private String name;
    private int icon;
    private int audio;
    private boolean isPlaying;
    private int duration;

    public Animal() {
    }

    public Animal(String name, int icon, int audio, boolean isPlaying, int duration) {
        this.name = name;
        this.icon = icon;
        this.audio = audio;
        this.isPlaying = isPlaying;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
