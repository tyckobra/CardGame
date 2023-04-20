public class CardGame {
    String Krigare;
    int healthpoints; //liv
    int damage; //skada per träff
    double attackspeed; //slag per sekund
    int range; //meter

    public Krigare() {
        healthpoints = 300;
        damage = 100;
        attackspeed = 0.5;
        range = 1;
    }

    public Trollkarl() {
        healthpoints = 150;
        damage = 75;
        attackspeed = 0.3;
        range = 3;
    }

    public Bågskytt() {
        healthpoints = 100;
        damage = 50;
        attackspeed = 0.8;
        range = 10;
    }

    public Tjuv() {
        healthpoints = 150;
        damage = 30;
        attackspeed = 1.3;
        range = 1;
    }

    public static void main(String[] args) {

    }
}
