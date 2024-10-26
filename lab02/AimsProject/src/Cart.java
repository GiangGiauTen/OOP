
// Cart.java
// Le Truong Giang 20205077
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERD = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
    private int qtyOrdered = 0;

    /**
     * Thêm 1 DVD mới vào giỏ hàng
     * 
     * @param disc
     * @return void
     */
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBERS_ORDERD) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsOrdered.add(disc);
        qtyOrdered++;
        System.out.printf("The disc: %s has been added\n", disc.getTitle());
    }

    /**
     * Tính tổng số tiền giỏ hàng
     * 
     * @return float
     */
    public float totalCost() {
        float cartTotal = 0f;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            cartTotal += itemsOrdered.get(i).getCost();
        }
        return cartTotal;
    }

    /**
     * Xóa 1 DVD khỏi giỏ hàng
     * 
     * @param disc
     * @return boolean
     */
    public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean isRemoved = false;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            // Nếu tìm thấy sản phẩm thì xóa
            if (disc.equals(itemsOrdered.get(i)) == true) {
                itemsOrdered.remove(i);
                qtyOrdered--;
                isRemoved = true;
            }
        }

        return isRemoved;

    }

    /**
     * @param
     * @return void
     */
    public void printCart() {
        System.out.println("Ten SP\t\t\t\t\t\t\t Gia");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc product = itemsOrdered.get(i);
            System.out.printf("%s\t\t\t\t\t\t %f\n", product.getTitle(), product.getCost());
        }
    }
}
