public abstract class Component {

    private boolean turnedOn = true;
    private int volumeLevel = 0;

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void turnOn(){
        this.turnedOn = true;
    }

    public void turnOff(){
        this.turnedOn = false;
    }
}
