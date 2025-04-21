public class InfoPelanggan {
    private String namaPemesan;
    private String nomorKTP;
    private String nomorTelepon;
    private String email;
    private JenisKelamin jenisKelamin;

    public InfoPelanggan(String namaPemesan, String nomorKTP, String nomorTelepon, String email,
            JenisKelamin jenisKelamin) {
        this.namaPemesan = namaPemesan;
        this.nomorKTP = nomorKTP;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }
}
