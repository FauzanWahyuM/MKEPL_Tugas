public class TotalBiaya {
    private static final int TAMBAHAN_TAMU_PER_ORANG = 100_000;
    private static final int DISKON_VOUCHER = 50_000;

    public static double hitungTotalBiaya(HotelRoomBooking booking) {
        double total = booking.getHargaPerMalam() * booking.getJumlahMalam();

        if (booking.getJumlahTamu() > 2) {
            total += (booking.getJumlahTamu() - 2) * TAMBAHAN_TAMU_PER_ORANG;
        }

        if (booking.getKodeVoucher() != null && booking.getKodeVoucher().length() > 3) {
            total -= DISKON_VOUCHER;
        }

        if (!booking.isStatusAktif()) {
            total = 0;
        }

        return total;
    }
}
