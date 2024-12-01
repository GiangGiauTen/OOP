package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store myStore = new Store();
        // tạo dvd1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // tạo dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        // Tạo dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        // Tạo dvd4
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Em và Trịnh", "Phim", "ZZZZ", 10, 77.54f);
        // Tạo dvd5
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Doraemon", "Hoạt hình", "SSS", 20, 12f);

        // Thêm các DVD vào cửa hàng
        myStore.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5);
        // Xóa sản phẩm
        System.out.println("Xóa sản phẩm có ID 1");
        myStore.removeMedia(1);
        myStore.removeMedia(1);
        System.out.println("Xóa sản phẩm có title: Doraemon");
        myStore.removeMedia("Doraemon");
        myStore.removeMedia("Doraemon");
    }
}
