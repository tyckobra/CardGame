import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;

public class CardGame {

    private static Object playAgent;

    int hälsa;
    int styrka;
    double pricksäkerhet;
    int trollkraft;

    public CardGame() {

        class Krigare {
            private final Krigare Krigare;

            public Krigare() {
                this.Krigare = new Krigare();
                hälsa = 300;
                styrka = 100;
                pricksäkerhet = 0.8;
                trollkraft = 0;
            }
        }

        class Trollkarl {
            private final Trollkarl Trollkarl;

            public Trollkarl() {
                this.Trollkarl = new Trollkarl();
                hälsa = 150;
                styrka = 75;
                pricksäkerhet = 0.3;
                trollkraft = 10;
            }
        }

        class Bågskytt {
            private final Object Bågskytt;

            public Bågskytt() {
                this.Bågskytt = new Bågskytt();
                hälsa = 100;
                styrka = 50;
                pricksäkerhet = 0.2;
                trollkraft = 0;
            }
        }

        class Tjuv {
            private final Tjuv Tjuv;

            public Tjuv() {
                this.Tjuv = new Tjuv();
                hälsa = 150;
                styrka = 30;
                pricksäkerhet = 1;
                trollkraft = 0;
            }
        }
    }

    public class playAgent {
        public playAgent() {
            playAgent = new playAgent();
        }

    }
    public static void main(String[] args) {
        System.out.println(playAgent);
    }
}
