package testinterface;

public class Tv {
    protected boolean power;
    protected int channel;
    protected int volume;

    public void power() { power = !power; }
    public void channelUp() { channel++; }
    public void channelDown() { channel--; }
}
