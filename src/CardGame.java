public class CardGame {

    int hälsa;
    int styrka;
    double pricksäkerhet;
    int trollkraft;

    public String Krigare() {
        hälsa = 300;
        styrka = 100;
        pricksäkerhet = 0.8;
        trollkraft = 0;
    }

    public String Trollkarl() {
        hälsa = 150;
        styrka = 75;
        pricksäkerhet = 0.3;
        trollkraft = 10;
    }

    public String Bågskytt() {
        hälsa = 100;
        styrka = 50;
        pricksäkerhet = 0.2;
        trollkraft = 0;
    }

    public String Tjuv() {
        hälsa = 150;
        styrka = 30;
        pricksäkerhet = 1;
        trollkraft = 0;
    }

    public String playAgent(String Card) {
        return Card;
    }

    public void getCard() {
        playAgent(Krigare());
        playAgent(Trollkarl());
        playAgent(Bågskytt());
        playAgent(Tjuv());
    }

    public static void main(String[] args) {

    }
}
