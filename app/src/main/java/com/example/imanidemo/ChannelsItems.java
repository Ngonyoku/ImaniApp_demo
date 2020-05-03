package com.example.imanidemo;

public class ChannelsItems {
    private int image;
    private String name, location;

    public ChannelsItems(int image, String name, String location) {
        this.image = image;
        this.name = name;
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
