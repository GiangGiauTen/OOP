package hust.soict.dsai.aims.data;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.model.Track;
import hust.soict.dsai.aims.store.Store;

import javax.naming.LimitExceededException;

public class InitData {
    public static final Store myStore = new Store();
    public static final Cart myCart = new Cart();

    public static void init() throws LimitExceededException {
        // Tạo các DVD có trong cửa hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Doraemon", "Hoạt hình", "ZZZ", 21 ,24.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Conan", "Hoạt hình", "Change", 54 ,99.7f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("luffy", "Hoạt hình", "ABC", 65 ,90f);
        // Tạo các CD có trong cửa hàng
        CompactDisc cd1 = new CompactDisc("Nguyễn Hồng Sơn", "Nhạc của tôi", 75.5f);
        cd1.addTrack(new Track("Sơn 1", 13));
        cd1.addTrack(new Track("Sơn 2", 24));
        cd1.addTrack(new Track("Sơn 3", 24));

        CompactDisc cd2 = new CompactDisc("Hoàng Sơn", "Đi để chở về", "Soobin Hoàng Sơn", 25.99f);
        cd2.addTrack(new Track("Đi để chở về 1", 2));
        cd2.addTrack(new Track("Đi để chở về 2", 2));
        cd2.addTrack(new Track("Đi để chở về 3", 3));

        // Tạo các Book có trong cửa hàng
        Book book1 = new Book("Nhật chuyên ngành 1", "Tiếng Nhật", 21f);
        Book book2 = new Book("Nhật chuyên ngành 2", "Tiếng Nhật", 25f);
        Book book3 = new Book("Giải tích IV", "Toán cao cấp", 9999f);
        // Add vào store
        myStore.addMedia(dvd1, dvd2, cd1, cd2, book1, book2);

        myCart.addMedia(dvd1, cd2);
    }
}
