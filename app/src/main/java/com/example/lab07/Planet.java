package com.example.lab07;

import android.os.Parcel;
import android.os.Parcelable;

public class Planet implements Parcelable {
    private String name;
    private int imageResId;
    private String distanceFromSun;
    private String mass;
    private String revolutionPeriod;
    private int numberOfMoons;

    // Constructeur
    public Planet(String name, int imageResId, String distanceFromSun, String mass, String revolutionPeriod, int numberOfMoons) {
        this.name = name;
        this.imageResId = imageResId;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.revolutionPeriod = revolutionPeriod;
        this.numberOfMoons = numberOfMoons;
    }

    // Constructeur pour Parcelable
    protected Planet(Parcel in) {
        name = in.readString();
        imageResId = in.readInt();
        distanceFromSun = in.readString();
        mass = in.readString();
        revolutionPeriod = in.readString();
        numberOfMoons = in.readInt();
    }

    public static final Creator<Planet> CREATOR = new Creator<Planet>() {
        @Override
        public Planet createFromParcel(Parcel in) {
            return new Planet(in);
        }

        @Override
        public Planet[] newArray(int size) {
            return new Planet[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(imageResId);
        dest.writeString(distanceFromSun);
        dest.writeString(mass);
        dest.writeString(revolutionPeriod);
        dest.writeInt(numberOfMoons);
    }

    // Getters pour accéder aux données
    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDistanceFromSun() {
        return distanceFromSun;
    }

    public String getMass() {
        return mass;
    }

    public String getRevolutionPeriod() {
        return revolutionPeriod;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }
}
