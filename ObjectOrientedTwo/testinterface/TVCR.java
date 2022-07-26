package testinterface;

public class TVCR extends Tv implements IVCR {
    VCR vcr = new VCR();

    @Override
    public void play() {
        vcr.play();
    }

    @Override
    public void stop() {
        vcr.stop();
    }
}
