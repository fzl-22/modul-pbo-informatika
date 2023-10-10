import classes.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Player petani = new Player();

        petani.name = "Joko";
        petani.speed = 100;
        petani.healthPoint = 70;

        while(petani.healthPoint > 0){
            petani.run();
            petani.getHit();
            System.out.println("HP: " + petani.healthPoint);
        }

        if(petani.isDead()){
            System.out.println("GAME OVER");
        }

        
        // Handphone handphone1 = new Handphone();

        // handphone1.merk = "Xiaomi";
        // handphone1.pemilik = "Udin";
        // handphone1.ukuranLayar = 960;

        // Handphone handphone2 = new Handphone();

        // handphone2.merk = "Iphone";
        // handphone2.pemilik = "Adi";
        // handphone2.ukuranLayar = 1080;

        // System.out.println(handphone1.merk);
        // System.out.println(handphone2.merk);

        // handphone1.hidupkanHandphone();
        // handphone2.hidupkanHandphone();
    }
}
