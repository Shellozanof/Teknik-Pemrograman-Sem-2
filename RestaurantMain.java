public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Spaghetti", 80000, 5);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        
        menu.tampilMenuMakanan();
        System.out.println("-----------------------------------");

        menu.pesanMenuMakanan(0, 5);  // Pesan Pizza 5 (Berhasil)
        menu.pesanMenuMakanan(1, 10); // Pesan Spaghetti 10 (Gagal, stok cuma 5)
        
        System.out.println("-----------------------------------");
        menu.tampilMenuMakanan();
    }
}