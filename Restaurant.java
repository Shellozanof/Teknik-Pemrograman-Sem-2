public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        setStok(id, stok);
    }

    public void pesanMenuMakanan(int idMenu, int jumlahPesan) {
        if (idMenu < 0 || idMenu > id) {
            System.out.println("Menu tidak ditemukan!");
            return;
        }

        if (stok[idMenu] >= jumlahPesan) {
            System.out.println("Memesan: " + nama_makanan[idMenu] + " sebanyak " + jumlahPesan);
            setStok(idMenu, stok[idMenu] - jumlahPesan);
            System.out.println("Pemesanan Berhasil!");
        } else {
            System.out.println("Maaf, stok " + nama_makanan[idMenu] + " tidak mencukupi!");
        }
    }

    public void tampilMenuMakanan() {
        System.out.println("DAFTAR MENU:");
        for (int i = 0; i <= id; i++) {
            if (nama_makanan[i] != null && !isOutOfStock(i)) {
                System.out.println(i + ". " + nama_makanan[i] + " [" + getStok(i) + "]\tRp. " + getHarga(i));
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public static void nextId() {
        id++;
    }

    public String getNama(int id) { return nama_makanan[id]; }
    
    public double getHarga(int id) { return harga_makanan[id]; }

    public int getStok(int id) { return stok[id]; }

    public void setStok(int id, int stok) {
        // Validasi stok tidak boleh negatif
        if (stok < 0) {
            this.stok[id] = 0; 
        } else {
            this.stok[id] = stok;
        }
    }
}