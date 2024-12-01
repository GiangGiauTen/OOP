package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

// hust.soict.dsai.test.disc.TestPassingParameter.java
// Le Truong Giang 20205077
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cinderelle dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        o1 = (DigitalVideoDisc) o1;
        o2 = (DigitalVideoDisc) o2;
        DigitalVideoDisc tmp = new DigitalVideoDisc(((DigitalVideoDisc) o1).getTitle(),
                ((DigitalVideoDisc) o1).getCategory(), ((DigitalVideoDisc) o1).getDirector(),
                ((DigitalVideoDisc) o1).getLength(), ((DigitalVideoDisc) o1).getCost());
        ((DigitalVideoDisc) o1).setTitle(((DigitalVideoDisc) o2).getTitle());
        ((DigitalVideoDisc) o1).setCategory(((DigitalVideoDisc) o2).getCategory());
        ((DigitalVideoDisc) o1).setDirector(((DigitalVideoDisc) o2).getDirector());
        ((DigitalVideoDisc) o1).setCost(((DigitalVideoDisc) o2).getCost());
        ((DigitalVideoDisc) o1).setLength(((DigitalVideoDisc) o2).getLength());

        ((DigitalVideoDisc) o2).setTitle(tmp.getTitle());
        ((DigitalVideoDisc) o2).setCategory(tmp.getCategory());
        ((DigitalVideoDisc) o2).setDirector(tmp.getDirector());
        ((DigitalVideoDisc) o2).setCost(tmp.getCost());
        ((DigitalVideoDisc) o2).setLength(tmp.getLength());
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
