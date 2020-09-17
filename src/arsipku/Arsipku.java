package arsipku;
public class Arsipku implements Biodata, Nilai{
    public static void main(String[] args) {
        Arsipku ps = new Arsipku ();
        ps.tampilNama();
        ps.tampilTempatLahir();
        ps.tampilHobi();
        ps.tampilAgama();
        ps.tampilBahasaIndonesia();
        ps.tampilMatematika();
        
    }
    public void tampilNama() {
        System.out.println("Biodata");
        System.out.println("Namaku : Widya Prihardiyanti ");
    }
    public void tampilTempatLahir() {
        System.out.println("TempatLahir : Jember, 16 Mei 2003 ");
    }
    public void tampilHobi() {
        System.out.println("Hobi : Bulu Tangkis ");
    }
    public void tampilAgama() {
        System.out.println("Nilai");
        System.out.println("Agaa = 90 ");
    }
    public void tampilBahasaIndonesia() {
        System.out.println("BahasaIndonesia = 85 ");
    }
    public void tampilMatematika(){
        System.out.println("Matematika = 80 ");
    }
}

