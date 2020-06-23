public class MP3Player implements IConnect {

    public MP3Player() {
    }

    public String connect(Stereo stereo) {
        return stereo.getStereoName();
    }

    public static String staticString(){
        return "Howdy I am a static String, no objects needed here!";
    }


}
