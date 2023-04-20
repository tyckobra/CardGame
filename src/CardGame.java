import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;

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
        return null;
    }

    public String Trollkarl() {
        hälsa = 150;
        styrka = 75;
        pricksäkerhet = 0.3;
        trollkraft = 10;
        return null;
    }

    public String Bågskytt() {
        hälsa = 100;
        styrka = 50;
        pricksäkerhet = 0.2;
        trollkraft = 0;
        return null;
    }

    public String Tjuv() {
        hälsa = 150;
        styrka = 30;
        pricksäkerhet = 1;
        trollkraft = 0;
        return null;
    }

    public String playAgent(String Card) {
        return Card;
    }

    public void Card() {
        playAgent(Krigare());
        playAgent(Trollkarl());
        playAgent(Bågskytt());
        playAgent(Tjuv());
    }

    public static void main(String[] args) {
        Card c = new Card() {
            @Override
            public ATR getATR() {
                return null;
            }

            @Override
            public String getProtocol() {
                return null;
            }

            @Override
            public CardChannel getBasicChannel() {
                return null;
            }

            @Override
            public CardChannel openLogicalChannel() throws CardException {
                return null;
            }

            @Override
            public void beginExclusive() throws CardException {

            }

            @Override
            public void endExclusive() throws CardException {

            }

            @Override
            public byte[] transmitControlCommand(int i, byte[] bytes) throws CardException {
                return new byte[0];
            }

            @Override
            public void disconnect(boolean b) throws CardException {

            }
        };
    }
}
