package hust.soict.dsai.aims.disc;// hust.soict.dsai.aims.disc.DigitalVideoDisc.java

import java.util.Objects;

public class DigitalVideoDisc {
    private String title;

    private String category;
    private String director;
    private int length;
    private float cost;

    public static int nbDigitalVideoDiscs = 0;
    private int id;

    public int getId() {
        return id;
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        getNewId();
        this.title = title;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        getNewId();
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        getNewId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
    }

    public void getNewId() {
        nbDigitalVideoDiscs += 1;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        getNewId();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
    }

    /**
     * So khớp title với instance hiện tại
     * 
     * @param title
     * @return
     */
    public boolean isMatch(String title) {
        return getTitle() == title;
    }

    @Override
    public String toString() {
        return String.valueOf(id) + ". DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - "
                + String.valueOf(getLength()) + ": " + String.valueOf(getCost()) + "$";
    }

    /**
     * So sánh 2 DVD với nhau
     * 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DigitalVideoDisc that = (DigitalVideoDisc) o;
        return length == that.length && Float.compare(that.cost, cost) == 0 && Objects.equals(title, that.title)
                && Objects.equals(category, that.category) && Objects.equals(director, that.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, category, director, length, cost);
    }
}
